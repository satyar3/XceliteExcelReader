import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void test(){
        System.out.println("Test2 Name : "+DataReader.readData(getClass().getSimpleName()).getTestName());
        System.out.println("Test2 First Name : "+DataReader.readData(getClass().getSimpleName()).getFirstName());
        System.out.println("Test2 Last Name : "+DataReader.readData(getClass().getSimpleName()).getLastName());
        System.out.println("Test2 Emp ID : "+DataReader.readData(getClass().getSimpleName()).getEmpId());
    }
}
