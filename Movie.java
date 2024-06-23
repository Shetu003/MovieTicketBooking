package Booking;
import java.util.Scanner;

public class Movie{
    private String name;
    private String Theatrename;
    private int noOfTicket;
    private int cost;
    Movie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the movie: ");
        this.name = sc.nextLine();
        System.out.println("Enter the theatre name: ");
        this.Theatrename = sc.nextLine();
        System.out.println("Enter the number of tickets: ");
        this.noOfTicket  = sc.nextInt();
        System.out.println("Enter the cost per Ticket: ");
        this.cost = sc.nextInt();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setTheatrename(String theatrename) {
        this.Theatrename = theatrename;
    }
    public String getTheatrename() {
        return Theatrename;
    }
    public void setNoOfTicket(int noOfTicket) {
        this.noOfTicket = noOfTicket;
    }
    public int getNoOfTicket() {
        return noOfTicket;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    void storeAllDetails(String name, String Brand,int memory,int camera,double price){
        this.name = name;
        this.Theatrename = Theatrename;
        this.noOfTicket = noOfTicket;
        this.cost = cost;
    }
    void viewAllDetails(){
        System.out.println("Name: "+name);
        System.out.println("Theatre name: "+Theatrename);
        System.out.println("No. of tickets: "+noOfTicket);
        System.out.println("Cost of ticket: "+cost);
    }
}
