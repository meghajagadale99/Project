package com.openclosed;

import java.util.Random;

public
class HomeInsuranceCustomer implements CustomerProfile {

    @Override
    public
    boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
