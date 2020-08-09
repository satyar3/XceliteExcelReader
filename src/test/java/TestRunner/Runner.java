package TestRunner;

import ReaderUtils.DataReader;
import ReaderUtils.DataSheetFactory;

import java.util.stream.Stream;

public class Runner{

    public static void main(String[] args) {

        //Get All Data
        /*System.out.println("Fetching all data from stream");
        Stream<DataSheetFactory> dataSheetFactoryStream = DataReader.readAllData();
        dataSheetFactoryStream.forEach(getTestData -> {
            System.out.println("Test Name : "+getTestData.getTestName());
            System.out.println("Test First Name : "+getTestData.getFirstName());
            System.out.println("Test Last Name : "+getTestData.getLastName());
            System.out.println("Test Emp ID : "+getTestData.getEmpId());
        });*/

        //Get Specific Data
        System.out.println("Fetching specific data from stream");
        DataSheetFactory getTestData = DataReader.readData("Test2");
        System.out.println("Test Name : "+getTestData.getTestName());
        System.out.println("Test First Name : "+getTestData.getFirstName());
        System.out.println("Test Last Name : "+getTestData.getLastName());
        System.out.println("Test Emp ID : "+getTestData.getEmpId());
    }
}