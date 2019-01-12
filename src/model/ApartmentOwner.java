package model;

import java.util.List;

public class ApartmentOwner extends User{

    // extends other things from user

    // OneToMany
    private List<Apartment> ownedApartments;
}
