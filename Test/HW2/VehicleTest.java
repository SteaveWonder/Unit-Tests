package HW2;

import Main.hw2.Car;
import Main.hw2.Motorcycle;
import Main.hw2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Проект Vehicle. Написать следующие тесты с использованием JUnit5:
 * - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
 * - Проверить, что объект Car создается с 4-мя колесами.
 * - Проверить, что объект Motorcycle создается с 2-мя колесами.
 * - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
 * - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
 * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
 * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
 * В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".
 * Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".
 * Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.
 * Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.
 */
public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    void init() {
        car = new Car("BMW", "M5", 2024);
        motorcycle = new Motorcycle("Ducati", "Superleggera", 2023);
    }

    //Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof)
    @Test
    void typeVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    //Проверить, что объект Car создается с 4-мя колесами
    @Test
    void wheels4() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //Проверить, что объект Motorcycle создается с 2-мя колесами
    @Test
    void wheels2() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    //Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive())
    @Test
    void maxCarSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive())
    @Test
    void maxMotoSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void carParkingCheck() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void motoParkingCheck() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
