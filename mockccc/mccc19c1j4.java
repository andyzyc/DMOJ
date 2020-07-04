package mockccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class mccc19c1j4 {
    public static class Food implements Comparable<Food> {
        public String name;
        public int num;
        public int rank;

        public Food(String name, int num, int rank) {
            this.name = name;
            this.num = num;
            this.rank = rank;
        }
        
        public int compareTo(Food other) {
            if (this.num == other.num) {
                if (this.rank > other.rank) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.num > other.num ) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(s.readLine());
        Food DTB = new Food("Deluxe Tuna Bitz", 0, 4);
        Food BB = new Food("Bonito Bitz", 0, 3);
        Food S = new Food("Sashimi", 0, 2);
        Food RB = new Food("Ritzy Bitz", 0, 1);
        
        for (int i = 0; i < N; i++) {
            String food = s.readLine();
            switch (food) {
                case "Deluxe Tuna Bitz":
                    DTB.num++;
                    break;
                case "Bonito Bitz":
                    BB.num++;
                    break;
                case "Sashimi":
                    S.num++;
                    break;
                case "Ritzy Bitz":
                    RB.num++;
                    break;
            }
        }
        
        ArrayList<Food> arrList = new ArrayList<Food>();
        arrList.add(DTB);
        arrList.add(BB);
        arrList.add(S);
        arrList.add(RB);
        Collections.sort(arrList);
        Collections.reverse(arrList);
        for (Food f: arrList) {
            if (f.num != 0) {
                System.out.println(f.name + " " + f.num);
            }
        }
    }
}
