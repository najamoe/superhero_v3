package com.example.superheltev3.services;


import com.example.superheltev3.model.Superhelt;
import com.example.superheltev3.repositories.SuperheltRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheltService {

    SuperheltRepository superheltRepository;

    public SuperheltService(SuperheltRepository superheltRepository){
        this.superheltRepository = superheltRepository;
    }

    public Superhelt skabHelt(String realname, String superheroname, String superpower, boolean human, double power) {
        return superheltRepository.skabHelt(realname, superheroname, superpower, human, power);
    }
    public List<Superhelt> AlleHelte(){
        return superheltRepository.AlleHelte();
    }

    public Superhelt søgSuperhelt(String realname) {
        return superheltRepository.searchSuperhero(realname);
    }



    public Superhelt redigerHelt(Superhelt superhelt) {
        Superhelt returnSuperhero = superheltRepository.redigerHelt(superhelt);
        return returnSuperhero;
    }
    public Superhelt slethelt(String name) {
        return superheltRepository.sletHelt(name);
    }
}
