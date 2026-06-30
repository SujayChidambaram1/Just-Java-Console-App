import java.util.*;

class Company{

        public void displayMessage1()
        {
            System.out.println("---------------------------------");
            System.out.println("| Hello User Come To Ilamai AI  |");
            System.out.println("---------------------------------");
            System.out.println();
        }

        public void displayMessage2()
        {
            System.out.println("May I Know What Do You Wish for...");
            System.out.println();
        }

        public void displayMessage3()
        {
            System.out.println("Enter \"Hello\" To Get To Know About Our Services.");
        }

        public void showServices(String Input2) {
            System.out.println();
            if (Input2.equalsIgnoreCase("hello")) {
                System.out.println("We Ilamai Provide Services Those Are As Follows,");
                System.out.println("+----------------------------------+");
                System.out.println("| 1 | Software Development         |");
                System.out.println("| 2 | Web Development              |");
                System.out.println("| 3 | Mobile App Development       |");
                System.out.println("| 4 | Artificial Intelligence (AI) |");
                System.out.println("| 5 | Cloud Services               |");
                System.out.println("+----------------------------------+");
                System.out.println();

                System.out.println("Enter The Service Which You Like...");
                System.out.println("Enter Type Of Services Using According Numbers...");
            } else {
                System.out.println("What Else Then");
            }
        }

        public void redirectChoice(int ChoiceOfService1){
            switch(ChoiceOfService1)
            {
                case 1:
                    System.out.println("Software Development.");
                    System.out.println("Certainly, Good Choice Then");
                    System.out.println("Get In Touch With Us On Linkedin");
                    System.out.println();
                    break;
                    case 2:
                        System.out.println("Web Development");
                        System.out.println("ofcourse, Good Choice Then");
                        System.out.println("Get In Touch With Us On Linkedin");
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Mobile App Development");
                        System.out.println("Great Deal");
                        System.out.println("Get In Touch With Us On Linkedin");
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Artificial Intelligence (AI)");
                        System.out.println("Welcone To The Party");
                        System.out.println("Get In Touch With Us On Linkedin");
                        System.out.println();
                        break;

                    case 5:
                        System.out.println("Cloud Services");
                        System.out.println("Break A leg");
                        System.out.println("Get In Touch With Us On Linkedin");
                        System.out.println();
                        break;

                    default:
                        System.out.println("Get In Touch With Us On Linkedin");
                        System.out.println("To Get More Updates");
                        break;
                }
        }
}
class Main {
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);

        Company obj = new Company();
        obj.displayMessage1();

        obj.displayMessage2();

        obj.displayMessage3();

        String Input1;
        System.out.println();

        while (true) {
            Input1 = Scan.nextLine().trim();

            if (Input1.equalsIgnoreCase("hello"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid input. Please type Hello to continue.");
            }
        }

        obj.showServices(Input1);

        System.out.println();
        int ChoiceOfService = Scan.nextInt();
        System.out.println();

        obj.redirectChoice(ChoiceOfService);
    }
}