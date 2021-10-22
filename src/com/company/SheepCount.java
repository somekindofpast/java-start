package com.company;

public class SheepCount {
    public static void main(String[] args) {
        int sheepCount = 0;//countElements("sheep", args);
        int wolfCount = 0;//countElements("wolf", args);
        int sheepEaten = 0;

        for(int i = 0; i < args.length; i++)
        {
            if(args[i].equals("sheep")) {
                sheepCount++;
                if(i != 0 && args[i-1].equals("wolf")) {
                    sheepEaten++;
                }
            }
            if(args[i].equals("wolf")) {
                wolfCount++;
            }
        }

        System.out.println("Sheep: " + sheepCount);
        System.out.println("Wolves: " + wolfCount);
        System.out.println("Sheep eaten: " + (sheepCount-sheepEaten));
    }

    public static int countElements(String target, String[] elements) {
        int count = 0;
        for (String element : elements) {
            if(target.equals(element))
                count++;
        }
        return count;
    }


}