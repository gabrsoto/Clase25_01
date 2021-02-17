package ClaseTarde;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MiFactory {
    static InputStream inputStream;

    public static Object GetInstance(String objName) {
        Object objInstance = null;
        try {
            String clase = GetPropValue(objName);
            objInstance = Class.forName(clase).getConstructor().newInstance(new Object[]{});
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("No se pudo leer la propiedad del archivo MiFactory.properties");
        }

        return objInstance;
    }

    public static String GetPropValue(String objName) throws IOException {
        String result = "";
        try (InputStream input = new FileInputStream(objName)) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            result = prop.getProperty("sorter");


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
