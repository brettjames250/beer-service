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
        BeerDto newBeer = BeerDto.builder().build();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/va/beer/" + newBeer.getBeerId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable BeerDto beerDto){
        // TODO implement with service
        return new ResponseEntity(BeerDto.builder().build(), HttpStatus.NO_CONTENT);
    }


}
