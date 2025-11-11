package com.pokemon.service.repository;

import com.pokemon.service.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "pokemon", url = "https://pokeapi.co/api/v2")
@RequestMapping("/pokemon")
public interface IFeignPokemonRepository {

    @GetMapping("/{id}")
    public PokemonDTO getPokemon(@PathVariable("id") int id);
}
