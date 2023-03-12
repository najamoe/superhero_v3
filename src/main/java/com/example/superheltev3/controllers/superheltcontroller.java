package com.example.superheltev3.controllers;

import com.example.superheltev3.model.Superhelt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.superheltev3.services.SuperheltService;

import java.util.List;

@RestController("/")
public class superheltcontroller {
    @Autowired
    SuperheltService superheltService;

    public superheltcontroller(SuperheltService superheltService){
        this.superheltService = superheltService;
    }

    @PostMapping("/skabhelt")
    public ResponseEntity<Superhelt> getSkabHelt(@RequestBody Superhelt superhelt){
        Superhelt skabHelt = superheltService.skabHelt(superhelt.getRealname(), superhelt.getSuperheroname(), superhelt.getSuperpower(), superhelt.isHuman(), superhelt.getPower());
        return new ResponseEntity<>(skabHelt, HttpStatus.OK);
    }
    @GetMapping("/allehelte")
    public ResponseEntity<List<Superhelt>> AlleHelte(){
        List superhelteListe = superheltService.AlleHelte();
        return new ResponseEntity<>(superhelteListe, HttpStatus.OK);
    }

    @GetMapping("/helt/{navn}")
    public ResponseEntity<Superhelt> getSøgSuperhelt(@PathVariable String realname){
        Superhelt søgSuperhelt = superheltService.søgSuperhelt(realname);
        return new ResponseEntity<>(søgSuperhelt, HttpStatus.OK);
    }


    @GetMapping("/redigerhelt")
    public ResponseEntity<Superhelt> getRedigerHelt(@RequestBody Superhelt superhelt){
        Superhelt redigerHelt = superheltService.redigerHelt(superhelt);
        return new ResponseEntity<>(redigerHelt, HttpStatus.OK);
    }

    @GetMapping("/slethelt{name}")
    public ResponseEntity<Superhelt> getSlethelt (@PathVariable String realName){
        Superhelt sletHelt = superheltService.slethelt(realName);
        return new ResponseEntity<>(sletHelt, HttpStatus.OK);
    }

}
