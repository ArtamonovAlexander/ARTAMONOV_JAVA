package ru.home.darkroom.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
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

    @NotNull
    private String name;

    @NotNull
    @Min(15)
    private Long age;

    @NotNull
    private String gender;

    @NotNull
    private Long number;

    @NotNull
    private LocalDateTime dateSeance;


    @ManyToMany(mappedBy = "clients")
    private List<Room> rooms;

}
