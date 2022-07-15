package com.openclosed;

import java.util.Random;

public
class VehicleInsuranceCustomer implements CustomerProfile {
    @Override
    public
    boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
