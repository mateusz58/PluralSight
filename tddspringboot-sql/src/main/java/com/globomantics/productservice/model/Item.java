package com.globomantics.productservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Entity
@Table(name = "Item")
class Item {

    @Id
    @GeneratedValue
    private final Long id;
    private final String name;
}

