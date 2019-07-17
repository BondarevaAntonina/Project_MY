package homeworks.patterns.observer;

import java.io.File;

/**
 * Created by antoni on 17.07.2019.
 */
public interface EventListener {
    void update(String eventType, File file);
}
