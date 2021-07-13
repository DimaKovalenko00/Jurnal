package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "med_karta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MedCarta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int med_karta_id;
    private int nomer_karti;
    private int groop_zdorovya;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;


}