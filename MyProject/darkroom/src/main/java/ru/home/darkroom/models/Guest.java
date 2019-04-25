package ru.home.darkroom.model;

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
    private String login;
    private String password;
    private Integer age;
    private String gender;
    private Long number;

//    @ManyToMany(mappedBy = "clients")
//    private List<Room> rooms;

    @Enumerated(value = EnumType.STRING)
    private Role role;
}
