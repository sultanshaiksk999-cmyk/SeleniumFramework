package BDD.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileReader {
    private static Properties prop;

    public static Properties getProperties(){
        if(prop == null){
            try{
                prop = new Properties();
                FileInputStream fis =new FileInputStream("C:\\Users\\shaik. sulthanbasha\\IdeaProjects\\BDD\\src\\main\\java\\BDD\\Properties\\file.properties");
                prop.load(fis);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return prop;
    }
    public static String getProperty(String key){
        return getProperties().getProperty(key);
    }
}
