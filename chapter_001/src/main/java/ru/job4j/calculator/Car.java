package ru.job4j.calculator;
public class Car {
    private double volume;

    public void drive(int kilometr) {
        this.volume = this.volume - kilometr;
    }
    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }
    public boolean canDrive() {
        boolean result = this.volume > 0;
        return result;
    }
    public void gasinfo() {
        System.out.println("i can drive" +  this.volume  + "kilometrs.");
    }


}
