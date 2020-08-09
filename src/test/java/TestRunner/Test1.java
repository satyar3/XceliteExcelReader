package TestRunner;

import ReaderUtils.DataReader;
import org.testng.annotations.Test;

public class Test1{
    @Test
    public void test(){
        System.out.println("TestRunner.Test1 Name : "+ DataReader.readData(getClass().getSimpleName()).getTestName());
        System.out.println("TestRunner.Test1 First Name : "+DataReader.readData(getClass().getSimpleName()).getFirstName());
        System.out.println("TestRunner.Test1 Last Name : "+DataReader.readData(getClass().getSimpleName()).getLastName());
        System.out.println("TestRunner.Test1 Emp ID : "+DataReader.readData(getClass().getSimpleName()).getEmpId());
    }
}