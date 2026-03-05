import java.util.Scanner;
public class RickshawFarejava {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
// 1. Distance and timeinput
System.out.println("Enter distance (km): ");
double distance = sc.nextDouble();
System.out.print("Enter time (minutes): ");
int time = sc.nextInt();
// 2.Conditions
System.out.println("Are you a local? (true/false): ");
boolean isLocal = sc.nextBoolean();
System.out.println("Is it night time?  (true/false): ");
boolean isnight = sc.nextBoolean();
// 3. basic fare calc
double basefare = 40.0;
double kmcharge= distance * 15.0;
double timecharge = time * 3.0;
double total = basefare + kmcharge +timecharge;
// 4. Using ternary operators
// Discount for locals on long distances (>10km)
total = (isLocal && distance >10) ? total * 0.8 : total;
// surcharge for night travel (40% increase)
total = (isnight) ? total * 1.4  : total;
//5. In nepali format (e.g., "Rs. 550")
System.out.println("distance:\t" + distance + " km");
System.out.println("Total fare:\tRs. " + (int)total);
sc.close();
}
}




