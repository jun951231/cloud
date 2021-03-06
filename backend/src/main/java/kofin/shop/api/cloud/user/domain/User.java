package kofin.shop.api.cloud.user.domain;

import com.sun.istack.NotNull;
import kofin.shop.api.cloud.board.domain.Article;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @Component @Table(name="Users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Article> articleList = new ArrayList<>();

}
