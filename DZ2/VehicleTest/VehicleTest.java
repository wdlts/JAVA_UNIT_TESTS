import TEMP.Main.Car;
import TEMP.Main.Motorcycle;
import TEMP.Main.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {
    @org.junit.jupiter.api.Test
    void checkCarHasFourWheels(){
        Car car1 = new Car("BMW", "525", 2000);
        assertThat(car1.getNumWheels()).isEqualTo(4);
    }
    @org.junit.jupiter.api.Test
    void checkMotoHasTwoWheels(){
        Motorcycle moto1 = new Motorcycle("Suzuki", "333", 2001);
        assertThat(moto1.getNumWheels()).isEqualTo(2);
    }
    @org.junit.jupiter.api.Test
    void checkCarIsInstanceOfVehicle(){
        Car car1 = new Car("BMW", "525", 2000);
        assertThat(car1).isInstanceOf(Vehicle.class);
    }
    @org.junit.jupiter.api.Test
    void checkCarSpeedIsSixtyWhenTesDrive(){
        Car car1 = new Car("BMW", "525", 2000);
        car1.testDrive();
        assertThat(car1.getSpeed()).isEqualTo(60);
    }
    @org.junit.jupiter.api.Test
    void checkMotoSpeedIsSeventyFiveWhenTesDrive(){
        Motorcycle moto1 = new Motorcycle("Suzuki", "333", 2001);
        moto1.testDrive();
        assertThat(moto1.getSpeed()).isEqualTo(75);
    }
    @org.junit.jupiter.api.Test
    void checkCarSpeedIsZeroWhenParking(){
        Car car1 = new Car("BMW", "525", 2000);
        car1.testDrive();
        car1.park();
        assertThat(car1.getSpeed()).isEqualTo(0);
    }
    @org.junit.jupiter.api.Test
    void checkMotoSpeedIsZeroWhenParking(){
        Motorcycle moto1 = new Motorcycle("Suzuki", "333", 2001);
        moto1.testDrive();
        moto1.park();
        assertThat(moto1.getSpeed()).isEqualTo(0);
    }
}

