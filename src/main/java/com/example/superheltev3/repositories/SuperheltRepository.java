package com.example.superheltev3.repositories;
// Klassen skal indeholde CRUD metoder. Genbrug data fra din database fra superhelt v2 projektet og anvend en hardkodet ArrayList til opbevaring af data.

import com.example.superheltev3.model.Superhelt;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("superhelteDB")
public class SuperheltRepository {

    private List<Superhelt> superhelte = new ArrayList<>(List.of(
            new Superhelt("Clark Kent", "superman", "fly", true, 1.2),
            new Superhelt("Bruce Banner", "the hulk", "strength", true, 2.2),
            new Superhelt("Barry Allen", "the flash", "speed", true, 1.2)));
    // "CREATE" opretter en superhelt

    public Superhelt skabHelt(String realname, String superheroname, String superpower, boolean human, double power) {

        Superhelt helt = new Superhelt(realname, superheroname, superpower, human, power);
        superhelte.add(helt);
        return helt;
    }

    // "READ" lister alle superhelte
    public List<Superhelt> AlleHelte() {
        return superhelte;
    }

    // "READ SPECIFIC" viser helt med specifikt navn = {navn}
    public Superhelt søgSuperhelt (String realname){
        for (Superhelt superhelt : superhelte){
            if (superhelt.getRealname().contains(realname.toLowerCase().trim())){
                return superhelt;
            }
        } return null;
    }

    //"UPDATE" retter oplysninger om helt
    public Superhelt redigerHelt(Superhelt superhelt ) {
        for (Superhelt helt : superhelte) {
            if (helt.getRealname().equals(superhelt.getRealname())) {

                String nytNavn = superhelt.getRealname();
                helt.setRealname(nytNavn);
                // String nytHelteNavn = superhelt.getSuperheroname();
               //TODO FAIL helt.getSuperheroname(nytHelteNavn);

                String nySuperpower = superhelt.getSuperpower();
                helt.setSuperpower(nySuperpower);

                boolean nyHuman = superhelt.isHuman();
                helt.setHuman(nyHuman);

                double nyPower = superhelt.getPower();
                helt.setPower(nyPower);
            }
            return helt;
        }
        return null; //Nothing happened
    }

    // "DELETE" sletter en helt med navn = {navn}
    public Superhelt sletHelt(String navn){
        for(Superhelt helt :superhelte){
            if(helt.getRealname().toLowerCase().contains(navn.toLowerCase().trim())){
                superhelte.remove(helt);
            } return helt;
        } return null;
     }

     //Søg efter helt
     public Superhelt searchSuperhero(String name) {
         for (Superhelt helt : superhelte) {
             if (helt.getRealname().toLowerCase().contains(name.toLowerCase().trim())) {
                 return helt;
             }
         }
         return null; //Nothing happened
     }
}

