package com.rating.ratingService.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.ratingService.entities.Rating;
import com.rating.ratingService.services.IRatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/rating")
public class ratingController {
    
    @Autowired
    private IRatingService ratingService;
    
    @PostMapping("/save")
    public ResponseEntity<?> saveRating(@RequestBody Rating rating) {
        String userEmail = rating.getUserEmail().toLowerCase();
        rating.setUserEmail(userEmail);
        return new ResponseEntity<>( ratingService.saveRating(rating),HttpStatus.CREATED);
    }
    
    @GetMapping("/all")
    public ResponseEntity<?> getRatings() {
        return new ResponseEntity<>(ratingService.getAllRating(),HttpStatus.OK);
    }

    @GetMapping("/user/{userEmail}")
    public ResponseEntity<?> getRatingByUserEmail(@PathVariable String userEmail) {
        userEmail = userEmail.toLowerCase();
        return new ResponseEntity<>(ratingService.getRatingByUserEmail(userEmail),HttpStatus.OK);
    }

    @GetMapping("/hotel/{hotelName}")
    public ResponseEntity<?> getRatingByHotelName(@PathVariable String hotelName) {
        return new ResponseEntity<>(ratingService.getRatingByHotelName(hotelName),HttpStatus.OK);
    }
    
    
    
}
