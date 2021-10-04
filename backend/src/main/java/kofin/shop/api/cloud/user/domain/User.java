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
    @Column(name="user_id")
    @GeneratedValue
    private long userId;

    @Column(length = 50) @NotNull private String userName;
    @Column(length = 10) @NotNull private String password;
    @Column(length = 50) @NotNull private String name;
    @Column(length = 50) @NotNull private String email;
    @Column(name = "reg_date", length = 20) @NotNull private String regDate;

    @OneToMany(mappedBy = "user")
    private List<Article> articleList = new ArrayList<>();

}
