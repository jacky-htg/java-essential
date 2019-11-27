package com.rebels.learn.oop;

public class MountainBike extends Bicycle{

    // the MountainBike subclass adds one more field
    private int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear,int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    public int getSeatHeight(){
        return seatHeight;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString()
    {
        return (super.toString()+
                "\nseat height is "+seatHeight);
    }

    public static void main(String[] args)
    {
        MountainBike mountainBike = new MountainBike(3,20,25);
        System.out.println(mountainBike.toString());
    }
}
