// InventoryService.java
package com.nsbm.mims.service;

import com.nsbm.mims.model.Inventory;

import java.util.List;

//inventory services
public interface InventoryService {
    Inventory addToInventory(Inventory inventory);
    void removeFromInventory(Long id);
    List<Inventory> viewInventory();
    Inventory updateInventory(Long itemId, Inventory inventoryDetails);
}