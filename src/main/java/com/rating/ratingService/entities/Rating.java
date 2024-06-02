package com.rating.ratingService.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document("user_ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rating {
    
    @Id //auto-increment is done by mongodb
    private String ratingId;
    private String hotelName;
    private String ratingValue;
    private String userEmail;
    private String feedback;
}
