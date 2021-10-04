package kofin.shop.api.cloud.item.domain;

import com.sun.istack.NotNull;
import kofin.shop.api.cloud.board.domain.Article;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @Component @Table(name = "Items")
public class Item {
    @Id
    @Column(name = "item_id")
    @GeneratedValue
    private long itemId;

    @Column(name = "item_brand", length = 20) @NotNull private String itemBrand;
    @Column(name = "item_name", length = 50) @NotNull private String itemName;
    @Column(name = "item_color", length = 20) @NotNull private String itemColor;
    @Column(name = "release_date", length = 20) private Date releasedDate;
    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER)
    private List<Article> articleList = new ArrayList<>();

}
