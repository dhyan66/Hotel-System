import java.util.Scanner;
public class Hoteldemo{
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        String hotel1Name = kb.next();
        int totalRooms1 = kb.nextInt();
        String hotel2Name = kb.next();
        int totalRooms2 = kb.nextInt();
        int occupiedRooms1 = kb.nextInt();
        int occupiedRooms2 = kb.nextInt();
        Hotel one = new Hotel(hotel1Name,totalRooms1);
        Hotel two = new Hotel(hotel2Name,totalRooms2);
        double occupancyRate1 = one.occupancy(occupiedRooms1,totalRooms1);
        double occupancyRate2= two.occupancy(occupiedRooms2,totalRooms2);

        System.out.println(one.toString(hotel1Name,totalRooms1,occupancyRate1));
        System.out.println(two.toString(hotel2Name,totalRooms2,occupancyRate2));
        if(one.sameNumRooms(two)){
            System.out.println("Both hotels have the same number of rooms is false");
        }
        else{
            System.out.println("Both hotels have the same number of rooms is true");
        }
        if(occupancyRate1==occupancyRate2){
            System.out.println(hotel1Name+" and "+hotel2Name+" have the same occupancy rate.");
            return;
        }
        if(one.higherOccupancyhigherOccupancy(two)){
            System.out.println(hotel1Name+" has the highest occupancy rate.");
        }
        else{
            System.out.println(hotel2Name+" has the highest occupancy rate.");
        }

    }
}