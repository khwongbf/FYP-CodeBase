package model;

import java.util.List;

public class TenantGroup {
    // auto-generate
    private long groupID;

    // OneToMany
    private List<Tenant> tenants;
}
