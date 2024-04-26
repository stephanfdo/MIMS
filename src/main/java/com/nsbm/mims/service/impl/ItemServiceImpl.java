package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.Item;
import com.nsbm.mims.repository.ItemRepository;
import com.nsbm.mims.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    //crete a item service
    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    //view item details service
    @Override
    public Item getItem(Long itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }

    //update item details
    @Override
    public Item updateItem(Long itemId, Item itemDetails) {
        Item item = getItem(itemId);
        if (item == null)
            return null;

        // Update item details
        item.setName(itemDetails.getName());
        item.setPrice(itemDetails.getPrice());
        // Update other fields as needed

        return itemRepository.save(item);
    }

    //delete item
    @Override
    public void deleteItem(Long itemId) {
        itemRepository.deleteById(itemId);
    }

    //view all the items service
    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}