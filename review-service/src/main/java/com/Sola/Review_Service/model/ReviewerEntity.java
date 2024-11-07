package com.Sola.Review_Service.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "Reviewer")
@NoArgsConstructor
@AllArgsConstructor
public class ReviewerEntity {

    @Id
    private String id;
    private String fullName;
    private String email;
}
