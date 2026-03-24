package Debug;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class Vehicle{
    String vehicle_no;
    int arrival_time;
    Vehicle(String vehicle_no,int arrival_time){
        this.vehicle_no=vehicle_no;
        this.arrival_time=arrival_time;
    }
}
class parkingLot{

    int capcity;
    int maxwaitingtime;
    Set<String>parkedvehciles;
    Queue<Vehicle>waitingqueue;
    ArrayList<String>timeoutvechicle;

    parkingLot(int capcity,int maxwaitingtime) {
        this.capcity = capcity;
        this.maxwaitingtime = maxwaitingtime;
        parkedvehciles = new LinkedHashSet();
        waitingqueue = new LinkedList<>();
        timeoutvechicle = new ArrayList<>();
    }
        void arrive(String vehicle_No,int time){
            checkTimeout(time);

            if(parkedvehciles.size()<capcity){
                parkedvehciles.add(vehicle_No);
                System.out.println(vehicle_No+" Parked at time "+time);
            }

            else{
                waitingqueue.add(new Vehicle(vehicle_No,time));
                System.out.println(vehicle_No+" added to waiting queue at time "+ time);
            }
        }

        void exit (String vehicleNo,int time){

        }

        void status(){
          for(String l:timeoutvechicle){
              System.out.print(l);
          }
        }

        void checkTimeout(int currentTime){

        }
}
public class selfdividingnumber {
    public static void main(String[] args){
       parkingLot lot=new parkingLot(2,5);
       lot.arrive("TN01",0);
       lot.arrive("TN02", 1);
       lot.arrive("TN03", 2);

       lot.status();

       lot.exit("TNO1",4);

       lot.status();

    }
}
