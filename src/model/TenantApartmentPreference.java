package model;

import java.math.BigDecimal;

public class TenantApartmentPreference extends ApartmentPreference{
    // ID, auto-gen
    private long tenantApartmentPreferenceID;

    // int. part = 6, frac. part = 2
    // Assert Max = 100,000.00
    private BigDecimal preferredMonthlyRent;

}
