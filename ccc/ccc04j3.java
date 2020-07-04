package ccc;

import java.util.Scanner;

public class ccc04j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.nextLine();
        String[] adj = new String[n];
        String[] noun = new String[m];
            
        int i = 0;
        while (s.hasNext()) {
            if (i < n) {
                adj[i] = s.nextLine();
            } else {
                noun[i - n] = s.nextLine();
            }
            i++;
        }
        
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < m; j++) {
                System.out.println(adj[k] + " as " + noun[j]);
            }
        }
    }
}
