package com.sandeep.ContactManger.Entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;

@Entity(name = "user")
@Table(name = "users")
public class UserEntity {
    @Id
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePicLink;
    private String phoneNumber;


    //information
    @Getter(AccessLevel.NONE)
    private boolean enabled = true;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // SELF , GOOGLE , FACEBOOK , TWITTER , LINKDIN , GITHUB
    @Enumerated(value = EnumType.STRING)
    private Provider provider = Provider.SELF;
    private String providerUserId;
}
