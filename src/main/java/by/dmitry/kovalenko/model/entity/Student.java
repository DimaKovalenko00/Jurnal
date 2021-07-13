package by.dmitry.kovalenko.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    private String f;
    private String i;
    private String o;
    private int kol_nb;

    @ManyToOne
    @JoinColumn(name = "groop_id")
    private Groop groop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "predmet_usp_id")
    private PredmetUspevaimost predmetUspevaimost;

    public void setGroop(Groop groop) {
        this.groop = groop;
    }

    public Groop getGroop() {
        return groop;
    }
}
