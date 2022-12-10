/*
 * Player Class
 * Final Project
 * @author Leah Marville
 * @ version 9 December 2022
 */

import java.util.ArrayList;
public class Player {

    String name;
    ArrayList<String> inventory;
    int xcoord;
    int ycoord;

    public Player(String name, int x, int y) {
        this.name = name;
        this.inventory = new ArrayList<String>();
        this.xcoord = x;
        this.ycoord = y;
    }

    public checkInventory(String item) {
        // Searches inventory for item
    }

}