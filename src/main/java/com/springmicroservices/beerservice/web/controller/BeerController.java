package com.springmicroservices.beerservice.web.controller;

import com.springmicroservices.beerservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //TODO implement with service
        return new ResponseEntity<BeerDto>(BeerDto.builder().build(), (HttpStatus.OK));
    }

    @PostMapping
    public ResponseEntity addNewBeer(@RequestBody BeerDto beerDto){
        // TODO - implement with service
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        // TODO implement with service
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
