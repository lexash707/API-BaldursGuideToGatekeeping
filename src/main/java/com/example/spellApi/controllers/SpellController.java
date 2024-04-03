package com.example.spellApi.controllers;

import com.example.spellApi.models.Spell;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpellController {

    @GetMapping(path = "/spells")
    public List<Spell> allSpells() {
        List<Spell> spells = new ArrayList<>();
        // Cloud of Daggers, 2, AOE ; Fireball, 3 , precise; Bless, 1, Buff
        spells.add(new Spell(1L,"Cloud of Daggers",2,"AOE"));
        spells.add(new Spell(2L,"Fireball",3,"Precise"));
        spells.add(new Spell(3L,"Bless",1,"Buff"));

        return spells;
    }
}
