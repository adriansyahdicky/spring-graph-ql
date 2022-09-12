package com.lear.graph.demograph.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCustomerRequest {
    private Integer id;
    private String name;
    private String mobilePhone;
    private String address;
    private Boolean isActivated;
}
