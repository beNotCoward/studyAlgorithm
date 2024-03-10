package com.lentouqin.lettcode2023;

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1 && this.big >= 1){
            this.big--;
            return true;
        }else if(carType == 2 && this.medium >= 1){
            this.medium--;
            return true;
        }else if(carType == 3 && this.small >= 1){
            this.small--;
            return true;
        }
        return false;
    }
}