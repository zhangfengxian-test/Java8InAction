package com.zfx.ch11;

import java.util.Optional;

public class Quiz11_2 {

    public static void main(String[] args) {
        System.out.println(getCarInsuranceName(Optional.empty(), 20));
    }

    public static String getCarInsuranceName(Optional<Person> person, int minAge) {
        return person.filter(p -> p.getAge() >= minAge)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");

    }

}
