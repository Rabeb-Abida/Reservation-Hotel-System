package org.example;

public class ReservationService {

    public void reserver(Room room, int jour) throws InvalidDaysException{

        if (jour <= 0 ){
            throw new InvalidDaysException("le nombre de jours doivent etre supeurieur à 0"); // personnel exception
        } else if (room.isReserve()) {
            throw  new IllegalStateException("la chambre est déja reservé");
        }else
            throw new IllegalStateException("la reservation est confirmeé par jour" + jour+ "jours");

    }

}

