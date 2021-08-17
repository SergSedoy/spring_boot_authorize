package com.example.spring_boot_authorize.repository;

import com.example.spring_boot_authorize.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();

        Map<String, String> mapa = new HashMap<>();
        mapa.put("Serg", "password");
        mapa.put("Nika", "password1");
        mapa.put("Max", "password2");

        Map<String, List<Authorities>> mapaAuthorities = new HashMap<>();
        mapaAuthorities.put("password", List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
        mapaAuthorities.put("password1", List.of(Authorities.READ));
        mapaAuthorities.put("password2", List.of(Authorities.READ, Authorities.WRITE));

        if (mapa.containsKey(user)) {
            String passwordTmp = mapa.get(user);
            if (passwordTmp.equals(password)) {
                list = mapaAuthorities.get(password);
            }
        }
        return list;
    }
}
