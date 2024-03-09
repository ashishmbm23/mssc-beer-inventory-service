package com.ashish.mssc.msscbeerinventoryservice.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BeerInventory extends BaseEntity{
    private UUID beerId;
    private String upc;
    private Integer quantityOnHand = 0;
}
