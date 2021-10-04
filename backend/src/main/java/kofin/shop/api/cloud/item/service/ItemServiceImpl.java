package kofin.shop.api.cloud.item.service;

import kofin.shop.api.cloud.item.domain.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public List<Item> findAllByItemName(String itemName) {
        return null;
    }

    @Override
    public Optional<Item> findById(long id) {
        return Optional.empty();
    }
}
