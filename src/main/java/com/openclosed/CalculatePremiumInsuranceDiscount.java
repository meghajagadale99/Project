package com.openclosed;

public
class CalculatePremiumInsuranceDiscount {
    public
    int calculatePremiumDiscountPercent(CustomerProfile customerProfile) {
        if (customerProfile.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}
