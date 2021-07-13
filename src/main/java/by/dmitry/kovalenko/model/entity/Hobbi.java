package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
//@Entity
@Table(name = "hobbies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Hobbi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hobbi_id;
    private String hobbi;
    private String godovnost_pokaz_na_scene;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;


}