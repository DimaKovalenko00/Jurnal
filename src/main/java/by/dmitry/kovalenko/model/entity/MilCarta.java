package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "mil_karta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class MilCarta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mil_karta_id;
    private int kol_privodov;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
