package org.example;

public class Main {
    public static void main(String[] args) throws InvalidDaysException {

        Room room1 = new Room(101, false);
        ReservationService service = new ReservationService();


        try{
            service.reserver(room1,3);
        }catch (InvalidDaysException e){
         System.out.println("Erreur de validation: " +e.getMessage());
        }catch (IllegalStateException e){
         System.out.println("Erreur de métier: " +e.getMessage());
        }
        finally {
            System.out.println("fin processus de réservation");
        }
    }
}