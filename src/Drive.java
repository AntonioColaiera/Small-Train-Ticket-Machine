
public class Drive {
    public static void main(String[] args) {
        double charge = TicketSystem.getCharge(Location.SUNNYCITY, false, 2); 
        System.out.println(charge);  
        double charge1 = TicketSystem.getCharge(Location.HAPPYTOWN, true, 3); 
        System.out.println(charge1);  
        double charge2 = TicketSystem.getCharge(Location.GLORIOUSLAKE, true, 4); 
           System.out.println(charge2);  
}
}