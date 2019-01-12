package model;

import java.math.BigDecimal;
import java.util.List;

public class Apartment {
    private long apartmentID;

    // integer part = 5, fractional part = 2
    private BigDecimal size;

    // Medium Large Object in DB
    private byte[] photo;

    private Geolocation geolocation;

    //embedded
    private List<Facility> facilities;

    private boolean petsAllowed;

    //ManyToOne
    private ApartmentOwner apartmentOwner;
}
