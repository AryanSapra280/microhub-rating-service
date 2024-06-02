package com.rating.ratingService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.ratingService.entities.Rating;
import com.rating.ratingService.repositories.IRatingRepository;

@Service
public class RatingServiceImpl implements IRatingService {


    @Autowired
    private IRatingRepository ratingRepository;

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserEmail(String email) {
        return ratingRepository.findByUserEmail(email);
    }

    @Override
    public List<Rating> getRatingByHotelName(String hotelName) {
       return ratingRepository.findByHotelName(hotelName);
    }
    
}
