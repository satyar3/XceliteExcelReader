package ReaderUtils;

import com.ebay.xcelite.Xcelite;
import com.ebay.xcelite.reader.SheetReader;
import com.ebay.xcelite.sheet.XceliteSheet;

import java.io.File;
import java.util.Collection;
import java.util.stream.Stream;

public class DataReader {

    public static Stream<DataSheetFactory> readAllData(){
        Xcelite xcelite = new Xcelite(new File("src/main/resources/TestData.xlsx"));
        XceliteSheet sheet = xcelite.getSheet("DummyTest");
        SheetReader<DataSheetFactory> reader = sheet.getBeanReader(DataSheetFactory.class);
        Collection<DataSheetFactory> users = reader.read();
        return users.stream();
    }

    public static DataSheetFactory readData(String testCaseName){
        Xcelite xcelite = new Xcelite(new File("src/main/resources/TestData.xlsx"));
        XceliteSheet sheet = xcelite.getSheet("DummyTest");
        SheetReader<DataSheetFactory> reader = sheet.getBeanReader(DataSheetFactory.class);
        Collection<DataSheetFactory> users = reader.read();
        Stream<DataSheetFactory> dataReaderStream =  users.stream().filter(testName -> testName.getTestName().equalsIgnoreCase(testCaseName));
        dataReaderStream.parallel().forEach(col -> {
            DataReaderContext.getDataSheetFactory().setTestName(col.getTestName());
            DataReaderContext.getDataSheetFactory().setFirstName(col.getFirstName());
            DataReaderContext.getDataSheetFactory().setLastName(col.getLastName());
            DataReaderContext.getDataSheetFactory().setEmpId(col.getEmpId());
        });
        return DataReaderContext.getDataSheetFactory();
    }

    public static DataSheetFactory readData(){
        String testCaseName = DataReaderContext.getTestName();
        Xcelite xcelite = new Xcelite(new File("src/main/resources/TestData.xlsx"));
        XceliteSheet sheet = xcelite.getSheet("DummyTest");
        SheetReader<DataSheetFactory> reader = sheet.getBeanReader(DataSheetFactory.class);
        Collection<DataSheetFactory> users = reader.read();
        Stream<DataSheetFactory> dataReaderStream =  users.stream().filter(testName -> testName.getTestName().equalsIgnoreCase(testCaseName));
        dataReaderStream.forEach(col -> {
            DataReaderContext.getDataSheetFactory().setTestName(col.getTestName());
            DataReaderContext.getDataSheetFactory().setFirstName(col.getFirstName());
            DataReaderContext.getDataSheetFactory().setLastName(col.getLastName());
            DataReaderContext.getDataSheetFactory().setEmpId(col.getEmpId());
        });
        return DataReaderContext.getDataSheetFactory();
    }
}
