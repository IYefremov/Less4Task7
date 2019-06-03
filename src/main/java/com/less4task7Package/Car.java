package com.less4task7Package;

public class Car extends Vehicle {

    private int currentGear;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private int currentSpeed;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }


    public int gearChange (int currentSpeed){


        if (currentSpeed == 0) {
            return this.currentGear = 0;
        }
        if(currentSpeed > 0 && currentSpeed <= 30 ){
            return this.currentGear = 1;
        }
        if(currentSpeed >= 31 && currentSpeed <= 50 ){
            return this.currentGear = 2;
        }
        if(currentSpeed >= 51 && currentSpeed <= 80 ){
            return this.currentGear = 3;
        }
        if(currentSpeed >= 81 && currentSpeed <= 110 ){
            return this.currentGear = 4;
        }
        if(currentSpeed >= 111 && currentSpeed <= 140 ){
            return this.currentGear = 5;
        }
        if(currentSpeed >= 141){
            return this.currentGear = 6;
        }
        return 0;
    }

}
