package ru.home.darkroom.domain;

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
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center center;

    @OneToMany(mappedBy = "room")
    private List<Seance> seances;

    @ManyToMany
    @JoinTable(name = "client_room",
            joinColumns = @JoinColumn(name = "room_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "client_id", referencedColumnName = "id"))
//            joinColumns = @JoinColumn(name = "beginTime", referencedColumnName = "id"),
//            joinColumns = @JoinColumn(name = "endTime", referencedColumnName = "id"))
    private List<User> clients;
}
