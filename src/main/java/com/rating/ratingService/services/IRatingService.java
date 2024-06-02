package com.rating.ratingService.services;

import java.util.List;

import com.rating.ratingService.entities.Rating;

public interface IRatingService {
    Rating saveRating(Rating rating);
    List<Rating> getAllRating();
    List<Rating> getRatingByUserEmail(String email);
    List<Rating> getRatingByHotelName(String hotelName);
}
