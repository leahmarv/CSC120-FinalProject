/*
 * Map Class
 * Final Project
 * @author Leah Marville
 * @ version 9 December 2022
 */

import java.util.HashMap;

public class Map {
    
    HashMap<String, Integer> xcoord;
    HashMap<String, Integer> ycoord;

    public Map() {
        this.xcoord = new HashMap<String, Integer>();
        this.ycoord = new HashMap<String, Integer>();
    }
}
