import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opt;
        boolean access = true;
        Person person;
        int id = 0;

        while(access != false)
        {
            System.out.println("1.-Register Person");
            System.out.println("2.-Show People");
            System.out.println("3.-Delete Person");
            System.out.println("4.-Update Person");
            System.out.println("5.-Exit");
            System.out.println("Type an option: ");
            opt = input.nextInt();
            switch (opt)
            {
                case 1:
                    System.out.println("Register Person: ");
                    System.out.println("Type a name: ");
                    String name = input.nextLine();
                    System.out.println("Type a last name: ");
                    String lastName = input.nextLine();
                    System.out.println("Type an age: ");
                    int age = input.nextInt();
                    person = new Person(++id, name, lastName, age);
                    System.out.println("Person registered correctly");
                    break;
                case 2:
                    System.out.println("Show people: ");
                    break;
                case 3:
                    System.out.println("Delete Person: ");
                    break;
                case 4:
                    System.out.println("Update Person: ");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Type a correct option");
                    break;
            }
        }
    }
}
