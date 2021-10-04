package kofin.shop.api.cloud.item.service;

import kofin.shop.api.cloud.item.domain.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    List<Item> findAll();
    List<Item> findAllByItemName(String itemName);
    Optional<Item> findById(long id);

}
