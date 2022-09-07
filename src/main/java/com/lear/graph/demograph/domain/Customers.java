package com.lear.graph.demograph.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
@Entity
@Builder
public class Customers {
    @Id
    private int id;
    private String name;
    private String mobilePhone;
    private String address;
    private Boolean isActivated;
}
