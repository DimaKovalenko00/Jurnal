package by.dmitry.kovalenko.model.entity;
import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name= "role")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_id;
    private String roleName;
    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
