package com.pokemon.service.repository;

import com.pokemon.service.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokemon-name", url = "https://pokeapi.co/api/v2")
public interface IFeignPokemonRepository {

    @GetMapping("/pokemon/{id}")
    public PokemonDTO getPokemon(@PathVariable("id") int id);
}
