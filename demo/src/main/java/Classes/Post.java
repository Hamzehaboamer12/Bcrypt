package Classes;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Post {

    @Setter(value = AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String textContent ;

    @ManyToOne
    Customer customer;
}
