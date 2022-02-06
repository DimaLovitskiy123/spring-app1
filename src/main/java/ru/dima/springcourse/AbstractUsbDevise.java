package ru.dima.springcourse;

public abstract class AbstractUsbDevise {
    private String model;
    private String typeOfDevise;

    public AbstractUsbDevise(String model, String typeOfDevise){
        this.model = model;
        this.typeOfDevise = typeOfDevise;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfDevise(){
        return typeOfDevise;
    }
}
