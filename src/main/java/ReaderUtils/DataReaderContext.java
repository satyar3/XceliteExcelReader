package ReaderUtils;

import Liseners.CustomListener;

public class DataReaderContext {

    private static ThreadLocal<DataReaderContext> parallelRun = new ThreadLocal<>();
    private static ThreadLocal<DataSheetFactory> dataSheetFactory = new ThreadLocal<>();
    private static ThreadLocal<DataReader> dataReader = new ThreadLocal<>();

    public static DataSheetFactory getDataSheetFactory() {
        return dataSheetFactory.get();
    }

    public static void setDataSheetFactory(DataSheetFactory d) {
        dataSheetFactory.set(d);
    }

    public static DataReader getDataReader() {
        return dataReader.get();
    }

    public static void setDataReader(DataReader d) {
        dataReader.set(d);
    }

    public static DataReaderContext getParallelRun() {
        return parallelRun.get();
    }

    public static void setParallelRun(DataReaderContext p) {
        parallelRun.set(p);
    }

    public static String getTestName() {
        return CustomListener.testName.get();
    }
}
