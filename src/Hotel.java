import java.text.DecimalFormat;
public class Hotel{
    String name;
    int totalRooms;
    int occupiedRooms;
    DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args){


    }
    Hotel() {

    }
    Hotel(String name,int totalRooms){
        totalRooms=0;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getOccupiedRooms() {
        return occupiedRooms;
    }

    public void setOccupiedRooms(int occupiedRooms) {
        this.occupiedRooms = occupiedRooms;
    }


    public String toString(String name, int totalRooms,double occupancyRate) {
        String formatedOccuRate = df.format(occupancyRate);

        return name + " has " + totalRooms + " rooms"+" with an occupancy rate of "+formatedOccuRate+"%";

    }
    public  double occupancy(int occupiedRooms,int totalRooms){
        double occupancyRate = (double)occupiedRooms/totalRooms*100;
        return occupancyRate;
    }
    public boolean sameNumRooms(Hotel s){
        return this.totalRooms==s.getTotalRooms();
    }
    public boolean higherOccupancyhigherOccupancy(Hotel s){
        if(occupancy(s.occupiedRooms,s.totalRooms)>occupancy(this.occupiedRooms,this.totalRooms)){
            return true;
        }
        return false;
    }
}