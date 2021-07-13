package by.dmitry.kovalenko.model.entity;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "ck")
public class CK {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ck_id;

    private String predmeti;
    private int b;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prepod_id")
    private Prepod prepod;

    public CK(int ckId, String predmeti, int b) {
        this.ck_id = ckId;
        this.predmeti = predmeti;
        this.b = b;
    }

    public int getCk_id() {
        return ck_id;
    }

    public void setCk_id(int ck_id) {
        this.ck_id = ck_id;
    }

    public String getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(String predmeti) {
        this.predmeti = predmeti;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return "entity.CK{" +
                "ck_id=" + ck_id +
                ", predmeti='" + predmeti+ '\'' +
                ", b=" + b +
                '}';
    }

    public Prepod getPrepod() {
        return prepod;
    }

    public void setPrepod(Prepod prepod) {
        this.prepod = prepod;
    }
}
