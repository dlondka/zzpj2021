package p.lodz.it.zzjp02;

import p.lodz.it.zzjp.Person;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main( String[] args ) {

        Properties properties = new Properties();
        String filePath = "config.dev.properties";
        //String filePath = "config.prod.properties";
        //String filePath = "config.properties";

        try (InputStream resourceAsStream = App.class.getClassLoader().getResourceAsStream(filePath)) {
            properties.load(resourceAsStream);
            System.out.println("Property: " + properties.getProperty("data"));
        } catch (IOException e) {
            System.err.println("Unable to load: " + filePath);
        }

        Person person = new Person();
        person.setName("Daniel");
        person.setSurname("Łondka");
        person.sayHello();
    }
}
