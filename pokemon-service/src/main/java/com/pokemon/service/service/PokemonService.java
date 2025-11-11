package com.pokemon.service.service;

import com.pokemon.service.dto.PokemonDTO;
import com.pokemon.service.repository.IFeignPokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    private IFeignPokemonRepository pokemonRepository;

    public PokemonDTO getPokemon(int id) {
        return pokemonRepository.getPokemon(id);
    }

}
