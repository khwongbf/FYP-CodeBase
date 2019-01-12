package model;

import java.math.BigDecimal;
import java.util.List;

public class Tenant extends User{

    // Max = ??
    private BigDecimal tenantRating;

    // OneToMany
    private List<TenantApartmentPreference> tenantApartmentPreferences;

    // OneToOne, optional
    private TenantFlatmatePreference tenantFlatmatePreference;
}
