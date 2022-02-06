package ru.dima.springcourse;

public class ComputerMouse extends AbstractUsbDevise implements UsbDevise{

    private final static String mouse = "Мышь";

    public ComputerMouse(String model){
        super(model, mouse);
    }

    @Override
    public void connect() {
        System.out.println("Мышь модели " + getModel() + " подключена.");
    }

    @Override
    public void disconnect() {
        System.out.println("Мышь модели " + getModel() + " отключена.");
    }
}
