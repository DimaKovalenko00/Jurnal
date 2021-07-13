package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by user on 01.02.2019.
 */
//@Entity
//@Table(name = "propiska")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Propiska {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int propiska_id;
    private String tip_propiski;
    private Date data_propiski;
    private String adres;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
}