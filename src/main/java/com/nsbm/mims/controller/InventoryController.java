// InventoryController.java
package com.nsbm.mims.controller;

import com.nsbm.mims.model.Inventory;
import com.nsbm.mims.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from localhost:3000
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    //adding inventory items controller
    @PostMapping
    public ResponseEntity<Inventory> addToInventory(@RequestBody Inventory inventory) {
        Inventory updatedInventory = inventoryService.addToInventory(inventory);
        return new ResponseEntity<>(updatedInventory, HttpStatus.CREATED);
    }


    //delete inventory by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeFromInventory(@PathVariable Long id) {
        inventoryService.removeFromInventory(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //display all the inventory items
    @GetMapping
    public ResponseEntity<List<Inventory>> viewInventory() {
        List<Inventory> inventoryList = inventoryService.viewInventory();
        return new ResponseEntity<>(inventoryList, HttpStatus.OK);
    }

    //update inventory items by id
    @PutMapping("/{itemId}")
    public ResponseEntity<Inventory> updateInventory(@PathVariable Long itemId, @RequestBody Inventory inventoryDetails) {
        Inventory updatedInventory = inventoryService.updateInventory(itemId, inventoryDetails);
        return new ResponseEntity<>(updatedInventory, HttpStatus.OK);
    }
}