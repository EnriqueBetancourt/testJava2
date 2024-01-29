import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opt;
        boolean access = true;

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
