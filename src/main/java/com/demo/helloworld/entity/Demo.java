package com.demo.helloworld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Demo {

    @Id
    private int id;

    private String name;
    private String address;
}
