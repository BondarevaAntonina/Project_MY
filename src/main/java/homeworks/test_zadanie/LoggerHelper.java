package homeworks.test_zadanie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.WeakHashMap;

/**
 * Created by antoni on 16.05.2018.
 */
public class LoggerHelper {
    public static synchronized Logger getLogger(Class clazz) {
        return LoggerFactory.getLogger(clazz);
            }
//    private static WeakHashMap<Thread, Entry> threadsTests = new WeakHashMap<Thread, Entry>();
    private static WeakHashMap<Thread, Thread> mainTreadsMap = new WeakHashMap<Thread, Thread>();
    private static WeakHashMap<Thread, String> threadLogFileNameMap = new WeakHashMap<Thread, String>();
    private static WeakHashMap<Thread, String> threadClassFileNameMap = new WeakHashMap<Thread, String>();

}
