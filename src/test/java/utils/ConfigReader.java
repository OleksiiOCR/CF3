package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getProperties(String key) {
        String propertyPath = "localConfig.properties";
        try (FileInputStream fileInputStream = new FileInputStream(propertyPath)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties.getProperty(key);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        throw new RuntimeException("error reading property");
    }
}
