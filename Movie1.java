package Booking;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Movie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int status = 1;
        Movie movlist[]=null;
        do{
            System.out.println("Welcome to the cinema hall: ");
            System.out.println("1. Add Movie Details: ");
            System.out.println("2. Search and Book: ");
            System.out.println("3. View All: ");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter no. of movies: ");
                    int no = sc.nextInt();
                    movlist = new Movie[no];
                    for (int i = 0; i < movlist.length; i++) {
                        int j = i;
                        System.out.println("Enter movie "+  ++j  + "Details");
                        movlist[i]=new Movie();
                    }
                    System.out.println("Data Saved...");
                    break;
                case 2:
                    boolean flag = true;
                    sc.nextLine();
                    System.out.println("Enter the movie name: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < movlist.length; i++) {
                        if(movlist[i].getName().equals(name))
                        {
                            movlist[i].viewAllDetails();
                            flag = true;
                            System.out.println("Would you like to book ticket for the movie?: ");
                            System.out.println("Enter 1 to book and 2 to exit: ");
                            int c = sc.nextInt();
                            if(c==1)
                            {
                                System.out.println("Enter the no of tickets: ");
                                int tick = sc.nextInt();
                                int tc = movlist[i].getCost()*tick;
                                System.out.println("The bill comes up to: "+tc);
                            }
                            else{
                                break;
                            }
                        }
                        else{
                            flag = false;
                        }
                    }
                    if(flag == false)
                        System.err.println("Not found");
                    break;
                case 3:
                    for (int i = 0; i < movlist.length; i++) {
                        movlist[i].viewAllDetails();;
                    }
                default :
                    System.out.println("Wrong choice...");
            }
            System.out.println("Do you want to continue(1.Yes / 2.No) : ");
            status = sc.nextInt();
        }
        while(status==1);
        System.out.println("Execution completes successfully:)");
    }
}
