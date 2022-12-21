/*
 * Map Class
 * Final Project
 * @author Leah Marville
 * @ version 9 December 2022
 */

 import java.util.ArrayList;

public class Map {
    // List of coordinates where players can walk
    ArrayList<String> freespace;

    //List of coordinates where players can pick berries
    ArrayList<String> berry;

    //List of coordinates where players can read signs
    ArrayList<String> sign;

    public Map() {
        this.freespace = new ArrayList<String>();
        freespace.add("2 3");
        freespace.add("2 4");
        freespace.add("3 2");
        freespace.add("3 2");
        freespace.add("3 7");
        freespace.add("4 2");
        freespace.add("5 2");
        freespace.add("6 2");
        freespace.add("6 3");
        freespace.add("6 4");
        freespace.add("6 5");
        freespace.add("6 6");
        freespace.add("6 7");
        freespace.add("7 2");

        this.berry = new ArrayList<String>();
        berry.add("3 3");
        berry.add("7 6");
        berry.add("7 7");
        berry.add("7 8");
        berry.add("8 7");

        this.sign = new ArrayList<String>();
        sign.add("2, 7");
        sign.add("5, 3");
        sign.add("5, 8");
        

    }

    public boolean moveAllowed (Player player, int x, int y) {
        int c = 0;
        while (c < freespace.size()) {
            if ((freespace.get(c)).equals(Player.getxCoord.toString() + Player.getyCoord.toString())) {
                return true;
            } return false;
        }
    }
}

