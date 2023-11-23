package org.adaschool.demoh2jpa.application.service;

import org.adaschool.demoh2jpa.domain.repository.BeerRepository;
import org.springframework.stereotype.Service;

@Service
public record BeerService (
  BeerRepository beerRepository
) {

  public void createBeer(){
    // llamar a la interface del repository save
  }

}
