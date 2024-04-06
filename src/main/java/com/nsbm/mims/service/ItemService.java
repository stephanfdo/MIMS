package com.nsbm.mims.service;

import com.nsbm.mims.model.Item;

import java.util.List;

public interface ItemService {
    Item createItem(Item item);

    Item getItem(Long itemId);

    Item updateItem(Long itemId, Item itemDetails);

    void deleteItem(Long itemId);

    List<Item> getAllItems();
}