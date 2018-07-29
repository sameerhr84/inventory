package com.retail.ecom.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.ecom.inventory.bootstrap.InventoryApplication;
import com.retail.ecom.inventory.pojo.Inventory;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	private static int reservationId=1;
	@RequestMapping("/availability")
    public  Inventory  inventory(@RequestParam(value="id") String id) {
		Inventory inventory=new Inventory();
		inventory.setId(id);
		inventory.setInventoryCount(InventoryApplication.inventoryCount);
		return inventory;
    }
	
	@RequestMapping("/reservation")
    public  Inventory  reservation(@RequestParam(value="id") String id) {
		Inventory inventory=new Inventory();
		inventory.setId(id);
		inventory.setInventoryCount(InventoryApplication.inventoryCount);
		if(InventoryApplication.inventoryCount!=0)
		{
			inventory.setReservationID(reservationId++);
			InventoryApplication.inventoryCount--;
		}
		return inventory;
    }

}
