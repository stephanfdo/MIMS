package com.nsbm.mims.service.impl;
import com.nsbm.mims.model.Inventory;
import com.nsbm.mims.repository.InventoryRepository;
import com.nsbm.mims.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Inventory addToInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public void removeFromInventory(Long id) {
        inventoryRepository.deleteById(id);
    }

    @Override
    public List<Inventory> viewInventory() {
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory updateInventory(Long itemId, Inventory inventoryDetails) {
        Inventory existingItem = inventoryRepository.findByItemId(itemId);
        if (existingItem != null) {
            existingItem.setQuantity(inventoryDetails.getQuantity());
            // Update other fields as needed
            return inventoryRepository.save(existingItem);
        } else {
            throw new IllegalArgumentException("Item not found in inventory.");
        }
    }
}
