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

    public int getxCoord(){
        return xcoord;
    }

    public int getyCoord(){
        return ycoord;
    }

    public boolean checkInventory(String item) {
        int i = 0;
        while (i < inventory.size()) {
            if ((inventory.get(i)).equals(item)) {
                return true;
            }
          } return false;
    }

    public void turnRight() {

        if (Player.isAllowed((xcoord + 1) + " " + ycoord)) {
            xcoord ++;
        }

    }

    public void turnLeft() {
        if (Player.isAllowed((xcoord - 1) + " " + ycoord)) {
            xcoord --;
        }
    }

    public void goUp() {
        if (Player.isAllowed((xcoord) + " " + ycoord - 1)) {
            ycoord --;
        }
    }

    public void goDown() {
        if (Player.isAllowed((xcoord) + " " + ycoord + 1)) {
            ycoord ++;
        }
    }

    public void pickBerries() {
        inventory.add("Berry");
        System.out.println("You found berries!");
    }

    public void distract() {
        System.out.println("You throw berries towards the bear to distract it. It seems to work!");
        inventory.remove("Berry");  
        calmBear();   
    }

    public void sing() {
        System.out.println("You sing at the bear to distract it. It seems to work!");
        calmBear();
    }

}