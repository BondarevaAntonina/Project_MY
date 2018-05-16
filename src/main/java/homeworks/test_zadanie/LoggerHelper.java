package homeworks.test_zadanie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by antoni on 16.05.2018.
 */
public class LoggerHelper {
    public static synchronized Logger getLogger(Class clazz) {
        return LoggerFactory.getLogger(clazz);
            }


}
