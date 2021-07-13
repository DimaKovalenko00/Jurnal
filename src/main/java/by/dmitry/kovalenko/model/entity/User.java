package by.dmitry.kovalenko.model.entity;
import lombok.*;

import javax.persistence.*;
/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name= "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String login;
    private String password;
    private String dostup;
}
