//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String first;
        String second;
        String third;
        String fourth;
        String fifth;
        String sixth;
        String seventh;
        String[][] schedule = new String[7][6];
        while (choice != 3) {
            System.out.println("Choose one of the options below (number)");
            System.out.println("1. View");
            System.out.println("2. Edit");
            System.out.println("3.Exit");
            choice = sc.nextInt();
            sc.nextLine();



            if (choice == 2) {
                System.out.println("What is your first period class (Name of Class)?");
                first = sc.nextLine();
                System.out.println("What is your second period class (Name of Class)?");
                second = sc.nextLine();
                System.out.println("What is your third period class (Name of Class)?");
                third = sc.nextLine();
                System.out.println("What is your fourth period class (Name of Class)?");
                fourth = sc.nextLine();
                System.out.println("What is your fifth period class (Name of Class)?");
                fifth = sc.nextLine();
                System.out.println("What is your sixth period class (Name of Class)?");
                sixth = sc.nextLine();
                System.out.println("What is your seventh period class (Name of Class)?");
                seventh = sc.nextLine();
                String[] morn = {first, second, third, fourth};
                String[] afternoon = {fifth, sixth, seventh};
                int morningIndex = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 3; j++) {
                        schedule[i][j] = morn[morningIndex];
                        morningIndex = (morningIndex + 1) % 4;
                    }

                }

                int afterIndex = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 4; j < 6; j++) {
                        schedule[i][j] = afternoon[afterIndex];
                        afterIndex = (afterIndex + 1) % 3;
                    }
                    schedule[i][3] = "Lunch";

                }
                schedule[6][0] = third;
                schedule[6][1] = fourth;
                schedule[6][2] = seventh;
                schedule[6][3] = "Lunch";
                schedule[6][4] = fifth;
                schedule[6][5] = sixth;

                //for(String[] s : schedule) {
                  //  for(String str : s) {
                 //       System.out.println(str);
                  //  }
               // }
            }
            if (choice == 1) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println(schedule[i][j] + " ");
                    }
                }
            }
        }
    }
}
