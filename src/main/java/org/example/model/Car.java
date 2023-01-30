package org.example.model;

import lombok.*;

import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class Car {
    private String brand;
    private String model;
    private String engineVolume;

}
