package Helper;

import java.io.IOException;
import java.net.URL;

/**
 * Created by antoni on 05.12.2017.
 */
public class BaseFunction {

    public static String getProperty(String key) {
        String result = null;
        //load properties
            /*if (propertiesMap == null) {
                propertiesMap = loadPropertiesMap(new FileInputStream("ifobs-selenium-test.properties"));
            }
            result = propertiesMap.get(key);*/
        result = System.getProperty(key);
        if (result == null) {
            throw new IllegalArgumentException("Property not found - " + key);
        }

        if (result.startsWith("//")) {
            URL url = BaseFunction.class.getResource(result.substring(1, result.length()));
            if (url != null) {
                String path = FilenameUtils.separatorsToSystem(url.getPath());
                if (path.startsWith("\\")) {
                    return path.substring(1, path.length());
                } else {
                    return path;
                }
            }
        }

        return result;
    }

    public static String getBaseUrl() throws IOException {
        String url = getProperty("base.url");
        Const.baseUrl = url;
        return url;
    }


}
