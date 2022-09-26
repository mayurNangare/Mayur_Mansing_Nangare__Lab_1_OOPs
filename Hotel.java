import java.util.List;

public class Hotel {
	private int totalfloor;
	private int totalroom;
	private List<Room> rooms;
	private Booking booking;
	
	public Hotel(int totalfloor,int totalroom ) {
		this.totalroom = totalroom;
		this.totalfloor = totalfloor;

	}

	// Methods--------------------------------------------------------------------------------------------
	
	public int getTotalroom() {
		return totalroom;
	}

	public int getTotalfloor() {
		return totalfloor;
	}


	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	} 
	
	public List<Room> getRooms() {
		return rooms;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

}
