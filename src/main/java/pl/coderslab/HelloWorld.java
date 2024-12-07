package pl.coderslab;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private final MessagePrinter messagePrinter;

    public HelloWorld(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;

        System.out.println("HelloWorld constructor");
    }

    public void sayHello() {
        System.out.println(messagePrinter.printMessage());
    }
}
