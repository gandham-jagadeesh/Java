public class Program{
    public static void main(String args[]){
        int pick = 2;
        switch(pick){
            case 1 -> System.out.println("Thank you for your Bookings");
            case 2 -> System.out.println("Status Booked");
            case 3 -> System.out.println("Ticket Cancelled");
            case 4 -> System.out.println("Bye");
            default -> System.out.println("enter between 1 to 4 ");
        }
    }
}