package model;

import java.math.BigDecimal;

public class RentalApartment extends Apartment {
    // int. part = 6, fract. part = 2
    // Assert Max = 100,000.00
    private BigDecimal monthlyRent;

    private boolean childrenAllowed;

    private RentalMode rentalMode;

    public enum RentalMode {
        INDIVIDUAL, HOME_SHARING
    }
}
