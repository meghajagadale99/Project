package com.liskov;

public
class Car extends Vehicle{
    @Override
    public
    double getInteriorWidth() {
        return this.getCabinWidth();
    }

    private
    double getCabinWidth() {
        return 0;
    }
}
