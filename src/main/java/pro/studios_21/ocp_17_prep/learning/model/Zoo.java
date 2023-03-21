package pro.studios_21.ocp_17_prep.learning.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Zoo {
    private String name;
    private Date establishedDate;
    private Double size;
    private List<Animal> animals;
    private List<Employee> employees;
}

