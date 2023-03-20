package br.com.gustavo.kafka.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {
    private String name;
    private String dateOfBirth;
    private String height;
    private String age;
}
