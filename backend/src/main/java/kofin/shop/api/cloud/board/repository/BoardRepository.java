package kofin.shop.api.cloud.board.repository;

import kofin.shop.api.cloud.board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Article, Long> {

}
