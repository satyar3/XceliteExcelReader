package ReaderUtils;

import com.ebay.xcelite.Xcelite;
import com.ebay.xcelite.reader.SheetReader;
import com.ebay.xcelite.sheet.XceliteSheet;

import java.io.File;
import java.util.Collection;
import java.util.stream.Stream;

public class DataReader {
    static DataSheetFactory testDataFactory = new DataSheetFactory();

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
            testDataFactory.setTestName(col.getTestName());
            testDataFactory.setFirstName(col.getFirstName());
            testDataFactory.setLastName(col.getLastName());
            testDataFactory.setEmpId(col.getEmpId());
        });
        return testDataFactory;
    }
}
