package model;

import java.util.List;

public class TenantFlatmatePreference {

    // OneToOne
    private Tenant tenant;

    // Assert: Positive, less than maximumAge
    private int minimumAge;

    // Assert: Positive, less than 150
    private int maximumAge;

    // optional
    private MarriageStatus marriageStatus;

    // optional
    private Gender gender;

    // element collection
    private List<Occupation> occupations;

    private boolean haveChildren;

    private boolean havePets;

    // Max Length = 250 characters
    private String lifestyleDescription;

    public enum Gender{
        MALE, FEMALE
    }

    public enum MarriageStatus {
        SINGLE, COUPLE, DIVORCED, WIDOWED
    }
}
