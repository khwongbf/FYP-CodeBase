package model;

import java.math.BigDecimal;

public class BuyerApartmentPreference extends ApartmentPreference {
    //auto-generate, Id
    private long preferenceID;

    // int. digits = 15, frac. digits = 2
    private BigDecimal price;

    //ManyToOne
    private Buyer buyer;
}
