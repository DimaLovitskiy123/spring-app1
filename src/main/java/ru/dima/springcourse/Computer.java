package ru.dima.springcourse;

import java.util.List;

public class Computer {

    private List<UsbDevise> usbDevises;

    public Computer(List<UsbDevise> usbDevises){
        this.usbDevises = usbDevises;
    }

    public void computerOn(){
        System.out.println("Компьютер включается.");
        for(UsbDevise runner : usbDevises){
            runner.connect();
        }
    }

    public void computerOff(){
        for(UsbDevise runner : usbDevises){
            runner.disconnect();
        }
        System.out.println("Компьютер выключается.");
    }
}
