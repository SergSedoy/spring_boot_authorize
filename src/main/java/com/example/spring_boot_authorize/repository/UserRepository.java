package com.example.spring_boot_authorize.repository;

import com.example.spring_boot_authorize.Authorities;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return List.of(Authorities.READ, Authorities.DELETE);
    }
}
