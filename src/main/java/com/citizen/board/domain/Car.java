package com.citizen.board.domain;

public class Car {

    private String name;
    private String number;
    private Integer size;

    public Car(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.number = carBuilder.number;
        this.size = carBuilder.size;
    }

    public static CarBuilder builder(String name, String number) {
        return new CarBuilder(name, name);
    }

    public static class CarBuilder {
        private final String name;
        private final String number;
        private Integer size = 0;

        public CarBuilder(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public CarBuilder size(Integer val) {
            this.size = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}