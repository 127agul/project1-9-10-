//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
          while(choice != 4) {
              System.out.println("Choose one of the options below (number)");
              System.out.println("1. View");
              System.out.println("2. Edit");
              System.out.println("3. View Day");
              System.out.println("4.Exit");
              int choice = sc.nextInt();


              if (choice == 2) {
                  System.out.println("What is your first period class (Name of Class)?");
                  String first = sc.nextLine();
                  System.out.println("What is your second period class (Name of Class)?");
                  String second = sc.nextLine();
                  System.out.println("What is your third period class (Name of Class)?");
                  String third = sc.nextLine();
                  System.out.println("What is your fourth period class (Name of Class)?");
                  String fourth = sc.nextLine();
                  System.out.println("What is your fifth period class (Name of Class)?");
                  String fifth = sc.nextLine();
                  System.out.println("What is your sixth period class (Name of Class)?");
                  String sixth = sc.nextLine();
                  System.out.println("What is your seventh period class (Name of Class)?");
                  String seventh = sc.nextLine();
              }
          }



        }
    }
