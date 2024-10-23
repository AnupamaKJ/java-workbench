package com.learning;

class Computer {
    public void playMusic() {
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

public class demo {
    public static void main(String[] args)
    {
        Computer comp = new Computer();
        comp.playMusic();
        String result = comp.getMeAPen(9);
        System.out.println(result);
    }

}
