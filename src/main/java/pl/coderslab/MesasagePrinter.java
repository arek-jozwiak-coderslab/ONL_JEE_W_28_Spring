package pl.coderslab;

import org.springframework.stereotype.Component;

@Component
public class MesasagePrinter implements MessagePrinter {

    public MesasagePrinter() {
        System.out.println("MessagePrinter constructor");
    }

    @Override
    public String printMessage() {
        return "Hello World";
    }
}