package com.company;

public class ceil {
    int x,y;
    boolean isBlue = false;

    public ceil(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static public boolean equals (ceil a,ceil b){
        if (a.x == b.x && a.y == b.y)
            return true;
        else
            return false;

    }
}
