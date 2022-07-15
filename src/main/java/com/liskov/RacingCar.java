package com.liskov;

public
class RacingCar extends Vehicle{
    @Override
    public
    double getInteriorWidth() {
        return this.getCockpitWidth();
    }

    private
    double getCockpitWidth() {
        return 0;
    }
}
