package pro.studios_21.ocp_17_prep.learning.model;

import lombok.Data;
import java.awt.*;

@Data
public class Animal {
    private String name;
    private AnimalType type;
    private double age;
    private Image photo;
}
