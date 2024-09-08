package com.adam.Kafka_tutorial.payload;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppUser {
    private int id;
    private String fullName;
}
