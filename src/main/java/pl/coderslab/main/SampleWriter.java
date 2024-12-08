package pl.coderslab.main;

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
