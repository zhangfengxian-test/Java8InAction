package com.zfx.ch11;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<Insurance> optInsurance = Optional.ofNullable(null);
        Optional<String> name = optInsurance.map(Insurance::getName);
        System.out.println(getCarInsuranceName(Optional.empty()));
        System.out.println(getCarInsuranceNames(List.of()));
    }

    public static String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }

    public static Set<String> getCarInsuranceNames(List<Person> persons) {
        return persons.stream()
                .map(Person::getCar)
                .map(optCar -> optCar.flatMap(Car::getInsurance))
                .map(optIns -> optIns.map(Insurance::getName))
                .flatMap(Optional::stream)
                .collect(Collectors.toSet());
    }

    public static Insurance findCheapestInsurance(Person person, Car car) {
        // queries services provided by the different insurance companies
        // compare all those data
        Insurance cheapestCompany = new Insurance();
        return cheapestCompany;
    }

    public static Optional<Insurance> nullSafeFindCheapestInsurance(
            Optional<Person> person, Optional<Car> car) {
        /*if (person.isPresent() && car.isPresent()) {
            return Optional.of(findCheapestInsurance(person.get(), car.get()));
        } else {
            return Optional.empty();
        }*/
        return person.flatMap(p -> car.map(c -> findCheapestInsurance(p, c)));
    }
}

class Person {

    private Optional<Car> car;
    private int age;

    public int getAge() {
        return age;
    }

    public Optional<Car> getCar() {
        return car;
    }
}

class Car {
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }
}
