package br.com.crossmade.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    @Autowired
    private MyFirstClass myFirstClass;

    private Environment env;

    // public MyFirstService(MyFirstClass myFirstClass) {
    // this.myFirstClass = myFirstClass;
    // }

    public String tellAStory() {
        return "The dependency is saying :" + myFirstClass.sayHello();
    }

    @Autowired
    public void setEnvironment(Environment env) {
        this.env = env;
    }

    public String getJavaVersion() {
        return env.getProperty("java.version");
    }

    public String getUserName() {
        return env.getProperty("user.name");
    }

    public String getOSName() {
        return env.getProperty("os.name");
    }

    public String readCustomProperty() {
        return env.getProperty("my.custom.property");
    }
}
