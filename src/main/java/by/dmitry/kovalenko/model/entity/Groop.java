package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "groop")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Groop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groop_id;
    private String nomer_groop;
    private int god_postup;
    @ManyToOne
    private Otdel otdel;

}

