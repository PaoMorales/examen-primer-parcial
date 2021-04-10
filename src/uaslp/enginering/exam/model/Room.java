package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private RoomStatus roomStatus;
    private String string;

    public Room(int number, RoomStatus roomStatus, String string) {
        this.number = number;
        this.roomStatus = roomStatus;
        this.string = string;
    }

    public int getNumber() {
        return number;
    }

    public RoomStatus getStatus() {
        return roomStatus;
    }

}
