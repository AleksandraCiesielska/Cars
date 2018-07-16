package com.example.Cars;

public  class Car {
    private String brand;
    private String model;
    private String description;


    public Car() {
         //wywoływanie konstruktora this odwołuje się do obiektu w którym jesteśmy
    }                   // mapuje obiekty które są wysłane w car
        public String toString(){
        return
                getBrand()+" "+getModel()+" "+ getDescription(); //wyświo
        }
    public Car(String brand, String model, String description) { //konstruktor 3 parametrowy i bezparametrowy
        //zmienna cars taka sama dla wszystkich obiektów
        //samochód w chwili wywoływania jest dodawany do tej listy
        this.brand = brand;
        this.model = model;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) { //do tego gettery i settery
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
