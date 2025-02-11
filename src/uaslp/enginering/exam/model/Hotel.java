package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room>rooms;
    private String name;


    public Hotel(String name) {
        this.name = name;
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room){
        if (room!=null){
            rooms.add(room);
        }
    }
}
