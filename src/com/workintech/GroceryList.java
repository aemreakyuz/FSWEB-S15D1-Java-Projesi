package com.workintech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryList {
   private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String items){
        String [] splitItems = splitItems(items);
        for(String item: splitItems){
            String trimmedItem= item.trim();
            if(checkItemIsInList(trimmedItem)){
                System.out.println("Item var: " + item);
            }
            else{
                this.items.add(trimmedItem);
                sortItems();
            }
        }

    }
    public void removeItems(String items) {
        String[] splitItems = splitItems(items);
        for (String item : splitItems) {
            String trimmedItem = item.trim();
            if (!checkItemIsInList(trimmedItem)) {
                System.out.println("Bu item zaten yok: " + item);
            } else {
                this.items.remove(trimmedItem);
            }
        }
    }


    private static String [] splitItems (String items){
        String[] splitItems = items.split(",");
        return splitItems;
    }
    public void sortItems() {
        Collections.sort(this.items);
    }
    public boolean checkItemIsInList(String item) {
        return items.contains(item);
    }
    public void printSorted(){
        System.out.println("Mevcut pazar listesi: ");
        for (String item : this.items){
            System.out.println(item);
        }
    }


}
