import java.util.*;
import java.util.Scanner;
// Imports for libraries

/*
API test java program, running to experiment with JetBrains IDE, similar to Eclipse. Imports include Kotlin, Lua, and Groovy. Projected created at 6:01 PM, 1/14/2019
This is my solution to the USACO problem "Perfect Squares", coded in Java 1.8
 */

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0;
        int counter = 0;

        n = in.nextInt();

        for(int i = 0; i <= 501; i++){
            for(int j = i+1; j <= 500; j++){
                if((j*j)-(i*i) == n){
                    counter = counter + 1;
                }
            }
        }

        System.out.println(counter);

    }
}
