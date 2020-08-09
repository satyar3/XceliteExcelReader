package TestRunner;

import ReaderUtils.DataReaderContext;
import ReaderUtils.DataSheetFactory;
import org.testng.annotations.BeforeTest;

public class TestBase {

    @BeforeTest
    public void setUp(){
        DataReaderContext.setDataSheetFactory(new DataSheetFactory());
    }
}
