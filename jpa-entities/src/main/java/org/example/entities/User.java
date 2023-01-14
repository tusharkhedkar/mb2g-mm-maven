package org.example.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
}
