package org.adaschool.demoh2jpa.application.controller;

import org.adaschool.demoh2jpa.application.service.BeerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public record BeerController(
  BeerService beerService
) {

  // Crear un endpoint POST Recibir una entidad Beer
  // Return ResponseStatus | HttpStatus.CREATED


}
