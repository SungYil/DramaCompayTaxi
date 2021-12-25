package entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30)
    private String email;

    @Column(length = 255)
    private String password;

    @Column(length = 30)
    private String usertype;
    private ZonedDateTime createdat;
    private ZonedDateTime updatedat;
}
