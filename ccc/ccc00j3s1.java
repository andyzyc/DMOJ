package ccc;

import java.util.Scanner;

public class ccc00j3s1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money = s.nextInt();
        int playTime = 0;
        int[] counter = {s.nextInt(), s.nextInt(), s.nextInt()};
        int[] plays = {35, 100, 10};
        int[] winnings = {30, 60, 9};
        
        int i = 0; // counter
        while (money > 0) {
            int machine = i % 3;
            money--;
            playTime++;
            counter[machine]++;
            
            if (counter[machine] == plays[machine]) {
                counter[machine] = 0;
                money += winnings[machine];
            }
            i++;
        }
        System.out.println("Martha plays " + playTime + " times before going broke.");
    }
}
