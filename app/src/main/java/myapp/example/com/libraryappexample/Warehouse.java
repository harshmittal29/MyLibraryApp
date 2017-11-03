package myapp.example.com.libraryappexample;

import java.util.ArrayList;

/**
 * Created by harsh on 07/10/2017.
 */

public class Warehouse {
    ArrayList<InventoryItem> inventoryList = new ArrayList<>();

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void addItem(InventoryItem item){
        inventoryList.add(item);
    }

    public void removeItem(InventoryItem item){
        inventoryList.remove(item);
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }
}
