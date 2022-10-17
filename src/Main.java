import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hotel Occupancy program
        int NumberOfFloors;
        double OccupancyRate;
        int VacantRooms;
        int TotalRooms=0;
        int TotalOccupied=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Hotel Occupancy\nEnter the number of floors in the hotel");
        NumberOfFloors = input.nextInt();

            if (NumberOfFloors < 1){
                System.out.println("Enter a value greater than one: ");
                NumberOfFloors = input.nextInt();
            }

        ArrayList<Integer> NumberOfRooms = new ArrayList<>(NumberOfFloors);
        ArrayList<Integer> OccupiedRooms = new ArrayList<>(NumberOfFloors);
        System.out.println("Enter the number of rooms in each floor:-");

        for (int i = 0; i < NumberOfFloors; i ++){
            System.out.printf("Room %d: " ,i + 1);
            int Input = input.nextInt();
            if (Input < 10 ){
                System.out.println("Enter a value greater than 10: ");
                Input =  input.nextInt();
            }
            NumberOfRooms.add(i, Input);
            System.out.printf("Rooms Occupied in floor %d: ", i+1);
            OccupiedRooms.add(i, input.nextInt());
        }
        for (int i: NumberOfRooms) {
            TotalRooms += i;
        }
        for (int j: OccupiedRooms) {
            TotalOccupied += j;
        }
        System.out.printf("The hotel have %d of rooms.\n", TotalRooms);
        System.out.printf("Rooms occupied: %d. \n",TotalOccupied);
        VacantRooms = TotalRooms - TotalOccupied;
        System.out.printf("Vacant rooms: %d.\n",VacantRooms);
        OccupancyRate = ((double)TotalOccupied / TotalRooms) * 100;
        System.out.printf("Occupancy rate: %f.\n", OccupancyRate);

    }
}