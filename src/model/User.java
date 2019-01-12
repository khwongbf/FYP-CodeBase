package model;

import java.util.List;

public class User {
    //auto-generate
    private long userID;

    private String username;

    // will be hashed at server side
    private String password;

    //Element Collection
    private List<Phone> phones;

    //Element Collection
    private List<Email> emails;
}
