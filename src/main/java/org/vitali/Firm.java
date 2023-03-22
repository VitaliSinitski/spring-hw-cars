package org.vitali;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Firm {
    private String name;
    private Integer age;
    private List<ICar> carsList = new ArrayList<>();
    public void driveCar() {
        for (ICar car : carsList) {
            System.out.println(car.getDrive());
        }
    }

}