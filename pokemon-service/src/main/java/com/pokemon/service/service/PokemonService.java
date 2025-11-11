package com.pokemon.service.service;

import com.pokemon.service.dto.PokemonDTO;
import com.pokemon.service.repository.IFeignPokemonRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    private IFeignPokemonRepository pokemonRepository;

    @CircuitBreaker(name = "cb", fallbackMethod = "falla")
    @Retry(name = "cb")
    public PokemonDTO getPokemon(int id) {

        exception();
        return pokemonRepository.getPokemon(id);
    }

    public void exception() {
        throw  new IllegalArgumentException("NO");
    }

    public PokemonDTO falla(int id,Throwable throwable) {
        return new PokemonDTO(id,"NO_FUNCIONA");
    }


}
