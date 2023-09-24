import java.util.*;
import java.io.*;
import java.lang.*;

class num {
  public static void startNewGame() {
    // random creation
    Random r = new Random();
    int a = r.nextInt(6);
    System.out.println("wellcome to guess the number game !!!");
    // each person have 5 chance with in the chance they need to guess the number
    for (int i = 1; i <= 5; i++) {

      Scanner scan = new Scanner(System.in);
      System.out.println("enter number:");

      int b = scan.nextInt();
      if (a == b) {

        System.out.println("WIN");
        break;

      } else {
        System.out.println(a);
        System.out.println("sorry its wrong!");

      }

    }
    System.out.println("------------------------------------------------------------");

  }

  public static void main(String aa[]) {

    // game will never end hahaha
    while (true) {
      startNewGame();
    }

  }
}