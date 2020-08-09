package Liseners;

import ReaderUtils.DataReaderContext;
import ReaderUtils.DataSheetFactory;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener, IInvokedMethodListener {

    public static ThreadLocal<String> testName = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        //System.out.println("In onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //System.out.println("In onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //System.out.println("In onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //System.out.println("In onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        //System.out.println("In onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        //System.out.println("In onFinish");
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        //System.out.println("In beforeInvocation");
        if(method.isTestMethod()) {
            //System.out.println("In test beforeInvocation");
            String[] testClassFullName = testResult.getInstanceName().toString().split("[.]");
            String testClassName = testClassFullName[testClassFullName.length-1];
            //System.out.println("Test Name in Listener is : "+testClassName);
            testName.set(testClassName);
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        //System.out.println("In afterInvocation");
    }
}
