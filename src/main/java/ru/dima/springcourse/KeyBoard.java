package ru.dima.springcourse;

public class KeyBoard extends com.dima.AbstractUsbDevise implements UsbDevise{

    private final static String keyboard = "Клавиатура";

    public KeyBoard(String model) {
        super(model, keyboard);
    }

    @Override
    public void connect() {
        System.out.println("Клавиатура модели " + getModel() + " подключена.");
    }

    @Override
    public void disconnect() {
        System.out.println("Клавиатура модели " + getModel() + " отключена.");
    }
}
