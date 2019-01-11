package javaWeek_7.exercise7;

public class Transporter {

       public void check(Integer seats, Integer celebs){
           if(seats > celebs) {
               System.out.println("It is possible to transport all of celebrities.");
           }
           else {
               System.out.println("It is not possible to transport them.");
           }

        }

        public Integer getSeats(Integer vehicleOne, Integer vehicleTwo){
            Integer seats = vehicleOne * 1 + vehicleTwo * 5;
            return seats;

        }
}
