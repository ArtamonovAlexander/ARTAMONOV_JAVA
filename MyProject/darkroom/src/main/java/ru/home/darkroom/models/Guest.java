package ru.home.darkroom.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long age;
    private String gender;
    private Long number;
    private String dateSeance;
    private String timeSeance;


    @ManyToMany(mappedBy = "clients")
    private List<Room> rooms;

}
