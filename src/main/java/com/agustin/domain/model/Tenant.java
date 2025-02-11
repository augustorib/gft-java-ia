package com.agustin.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String email;

    private String phone_number;

    @OneToMany(mappedBy = "tenant")
    private List<LeaseContract> lease_contracts;


}
