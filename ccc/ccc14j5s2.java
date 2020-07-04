package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ccc14j5s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        String[] firstStudents = new String[N];
        String[] secondStudents = new String[N];
        HashMap<String, String> students = new HashMap<String, String>();

        // assigning input lines 2 and 3 to arrays
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            firstStudents[i] = st.nextToken();
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            secondStudents[i] = st.nextToken();
        }

        if (firstStudents[0].equals(secondStudents[0])) {
            System.out.println("bad");
            System.exit(0);
        } else {
            students.put(firstStudents[0], secondStudents[0]);
        }
        int counter = 0;

        // looping through each index of arrays
        for (int i = 1; i < N; i++) {

            // check if second array has a key in HashMap
            if (students.containsKey(secondStudents[i])) {

                // check if value of specified key in HashMap is equal to specified index of first array
                if (students.get(secondStudents[i]).equals(firstStudents[i])) {
                    // nothing happens
                }

                // did not equal, abort
                else {
                    System.out.println("bad");
                    counter++;
                    break;
                }
            } else {

                // check if key and value are the same
                if (!firstStudents[i].equals(secondStudents[i])) {

                    // HashMap has no key of second array's value, add key
                    students.put(firstStudents[i], secondStudents[i]);
                }

                // did not equal, abort
                else {
                    System.out.println("bad");
                    counter++;
                    break;
                }
            }
        }

        // check if print good or not
        if (counter == 0) {
            System.out.println("good");
        }
    }
}
