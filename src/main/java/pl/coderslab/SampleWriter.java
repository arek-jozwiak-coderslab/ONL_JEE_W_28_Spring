package pl.coderslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleWriter {

    private final HelloWorld helloWorld;

    public SampleWriter(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void write(String text) {
      helloWorld.sayHello();
    }
}
