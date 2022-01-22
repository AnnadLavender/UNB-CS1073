/**
This is a driver program.
@author Ngoc Phuong Anh Nguyen 3712361
*/
import java.text.NumberFormat;
public class Payroll
{
  public static void main(String[] args)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    RestaurantWorker jeffreyKingston = new RestaurantWorker("Jeffrey Kingston", "Busser", 11.75);
    RestaurantWorker susanGrantLong = new RestaurantWorker("Susan Grant-Long", "Busser", 11.95);
    RestaurantWorker leroyHaines = new RestaurantWorker("Leroy Haines", "Dishwasher", 12.50);

    Server johnathanGorman = new Server("Jonathan Gorman", "Server", 12.50, 0.12);
    Server tanyaMasterson = new Server("Tanya Masterson", "Server", 11.75, 0.10);
    Server brittanyPhillips = new Server("Brittany Phillips", "Server", 13.50, 0.15);

    Chef kathyCox = new Chef("Kathy Cox", "Executive Chef", 24.50, 72.50);
    Chef thomasMcLean = new Chef("Thomas McLean", "Sous Chef", 19.50, 35.00);
    Chef nathanielPaul = new Chef("Nathaniel Paul", "Sous Chef", 20.75, 35.00);
    Chef eleanorRyan = new Chef("Eleanor Ryan", "Pastry Chef", 18.00, 27.00);

    System.out.println("Worker's Name & Job Title\tRate of Pay\tPay this week");
    System.out.println("=========================\t===========\t=============");
    System.out.println(jeffreyKingston.getName() +" ("+ jeffreyKingston.getJobTitle() +")\t"+
    formatter.format(jeffreyKingston.getSalaryRate()) + "/hr\t" + formatter.format(jeffreyKingston.computePay(18)));

    System.out.println(susanGrantLong.getName() +" ("+ susanGrantLong.getJobTitle() +")\t"+
    formatter.format(susanGrantLong.getSalaryRate()) + "/hr\t" + formatter.format(susanGrantLong.computePay(14.5)));

    System.out.println(leroyHaines.getName() +" ("+ leroyHaines.getJobTitle() +")\t"+
    formatter.format(leroyHaines.getSalaryRate()) + "/hr\t" + formatter.format(leroyHaines.computePay(42)));

    System.out.println(johnathanGorman.getName() +" ("+ johnathanGorman.getJobTitle() +")\t"+
    formatter.format(johnathanGorman.getSalaryRate()) + "/hr\t" + formatter.format(johnathanGorman.computePay(46.5)));

    System.out.println(tanyaMasterson.getName() +" ("+ tanyaMasterson.getJobTitle() +")\t"+
    formatter.format(tanyaMasterson.getSalaryRate()) + "/hr\t" + formatter.format(tanyaMasterson.computePay(18)));

    System.out.println(brittanyPhillips.getName() +" ("+ brittanyPhillips.getJobTitle() +")\t"+
    formatter.format(brittanyPhillips.getSalaryRate()) + "/hr\t" + formatter.format(brittanyPhillips.computePay(38.5)));

    System.out.println(kathyCox.getName() +" ("+ kathyCox.getJobTitle() +")\t"+
    formatter.format(kathyCox.getSalaryRate()) + "/hr\t" + formatter.format(kathyCox.computePay(46.5)));

    System.out.println(thomasMcLean.getName() +" ("+ thomasMcLean.getJobTitle() +")\t"+
    formatter.format(thomasMcLean.getSalaryRate()) + "/hr\t" + formatter.format(thomasMcLean.computePay(18)));

    System.out.println(nathanielPaul.getName() +" ("+ nathanielPaul.getJobTitle() +")\t"+
    formatter.format(nathanielPaul.getSalaryRate()) + "/hr\t" + formatter.format(nathanielPaul.computePay(26)));

    System.out.println(eleanorRyan.getName() +" ("+ eleanorRyan.getJobTitle() +")\t"+
    formatter.format(eleanorRyan.getSalaryRate()) + "/hr\t" + formatter.format(eleanorRyan.computePay(42)));
  }
}
