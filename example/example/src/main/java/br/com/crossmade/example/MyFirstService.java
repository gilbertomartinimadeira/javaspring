package br.com.crossmade.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    @Value("Hello Gil")
    private String customProperty;

    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;

    @Value("123")
    private String customIntProperty;

    public String getCustomProperty() {
        return customProperty;
    }

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }

    public String getCustomIntProperty() {
        return customIntProperty;
    }

    public MyFirstService(
            @Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory() {
        return "The dependency is saying :" + myFirstClass.sayHello();
    }

}

// private Environment env;

// public MyFirstService(MyFirstClass myFirstClass) {
// this.myFirstClass = myFirstClass;
// }

// @Autowired
// public void setEnvironment(Environment env) {
// this.env = env;
// }

// public String getJavaVersion() {
// return env.getProperty("java.version");
// }

// public String getUserName() {
// return env.getProperty("user.name");
// }

// public String getOSName() {
// return env.getProperty("os.name");
// }

// public String readCustomProperty() {
// return env.getProperty("my.custom.property");
// }
// }
