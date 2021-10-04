package kofin.shop.api.cloud.board.domain;

import com.sun.istack.NotNull;
import kofin.shop.api.cloud.user.domain.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @Component @Table(name = "articles")
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue
    private long articleId;

    @Column(length = 50) @NotNull
    private String title;
    @Column(length = 200) @NotNull
    private String content;
    @Column(name = "written_date", length = 20) @NotNull
    private Date writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", insertable = false, updatable = false)
    private User item;
}
