package Lec06;

import java.util.*;

public class GuestRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int randomNumber = rd.nextInt(20) + 1;
        int n = 0;
        int count = 0;
        do {
            System.out.println("enter guess number: ");
            n = sc.nextInt();
            if (n < randomNumber) {
                System.out.println("smaller than randomNumber ");
            } else if (n > randomNumber) {
                System.out.println("bigger than randomNumber ");
            }else{
                System.out.println("CONGRATULATION !! CORRECT NUMBER <3 ");
            }
            count++;

        } while (randomNumber != n);
        System.out.println("You have entered :" + count + " times ");
    }
}
