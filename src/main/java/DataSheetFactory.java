import com.ebay.xcelite.annotations.Column;

public class DataSheetFactory {

    @Column(name = "TestName")
    private String testName;

    @Column(name = "Firstname")
    private String firstName;

    @Column(name = "Lastname")
    private String lastName;

    @Column(name = "EmpID")
    private long empId;

    public String getTestName() {
        return testName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getEmpId() {
        return empId;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }
}
