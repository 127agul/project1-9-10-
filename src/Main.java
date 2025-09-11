//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          ArrayList<String> morning = new ArrayList<>();
          ArrayList<String> afternoon = new ArrayList<>();
          int choice = 0;
          while(choice != 4) {
              System.out.println("Choose one of the options below (number)");
              System.out.println("1. View");
              System.out.println("2. Edit");
              System.out.println("3. View Day");
              System.out.println("4.Exit");
              choice = sc.nextInt();
              sc.nextLine();
              String first;
              String second;
              String third;
              String fourth;
              String fifth;
              String sixth;
              String seventh;


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
                   morning.add(first);
                   morning.add(second);
                   morning.add(third);
                   morning.add(fourth);
                   afternoon.add(fifth);
                   afternoon.add(sixth);
                   afternoon.add(seventh);
              }
          }

          if(choice == 1) {

          }





        }
    }
