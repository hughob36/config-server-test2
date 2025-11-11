package com.pokemon.service.controller;

import com.pokemon.service.dto.PokemonDTO;
import com.pokemon.service.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{id}")
    public PokemonDTO getPokemon(@PathVariable int id) {
        return pokemonService.getPokemon(id);
    }
}
