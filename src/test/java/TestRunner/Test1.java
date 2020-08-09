package TestRunner;

import Liseners.CustomListener;
import ReaderUtils.DataReaderContext;
import ReaderUtils.DataSheetFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Test1 extends TestBase{
    @Test
    public void test(){
        System.out.println("TestRunner.Test1 Name : "+ DataReaderContext.getDataReader().readData().getTestName());
        System.out.println("TestRunner.Test1 First Name : "+ DataReaderContext.getDataReader().readData().getFirstName());
        System.out.println("TestRunner.Test1 Last Name : "+ DataReaderContext.getDataReader().readData().getLastName());
        System.out.println("TestRunner.Test1 Emp ID : "+ DataReaderContext.getDataReader().readData().getEmpId());
    }
}