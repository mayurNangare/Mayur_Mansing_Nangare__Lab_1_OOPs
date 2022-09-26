import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Driver {

	public static void main(String[] args) {


		Hotel hotel = new Hotel(2,7);
	    
		Room room101 = new Room(101,"Single",false,"1","AC");
		Room room102 = new Room(102,"Double",false,"1","AC");
		Room room103 = new Room(103,"Double",false,"1","nonAC");
		Room room201 = new Room(201,"Single",false,"2","AC");
		Room room202 = new Room(202,"Single",false,"2","nonAC");
		Room room203 = new Room(203,"Double",false,"2","AC");
		Room room204 = new Room(204,"Triple",false,"2","AC");
		
		hotel.setRooms(Arrays.asList(room101,room102,room103,room201,room202,room203,room204));
		
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.println("");
			System.out.println("type of room -> Single or Double or Triple");
			String input1 = in.next();
			
			System.out.println("AC or nonAC");
			String input2 = in.next();
			
			System.out.println("which floor -> any or 1 or 2 ");
			String input3 = in.next();
			
			BookingReq req = new BookingReq(input1,input2,input3);
			
			List<Room> rooms=hotel.getRooms();
			boolean isRoomAvailable =true;

			for(Room room:rooms) {

				if ((req.getFloor().equals(room.getFloor()) && req.getOccupancy().equals(room.getOccupancy()))) {

					if(room.isRoomBookingStatus()==false && req.getFacilityName().equals(room.getAc())) {
						Booking booking = new Booking(room.getRoomNum(),room.getFloor(),room.getOccupancy(),room.getAc());
						hotel.setBooking(booking);;
						Booking book = hotel.getBooking();
						System.out.println("Room number: "+book.getRoomNum()+", floor no: " +book.getFloor()+", "+book.getAc()+", "+ book.getOccupancy()+" Occupancy, estimated cost:- "+ book.RoomPrice(room.getOccupancy(),room.getAc()));
						room.setRoomBookingStatus(true);
						isRoomAvailable =true;
						break;
						}

					else {
						isRoomAvailable =false;
					}
				}

				else if(req.getFloor().equals("any")) {
					if ((req.getOccupancy().equals(room.getOccupancy()))) {
						if(room.isRoomBookingStatus()==false && req.getFacilityName().equals(room.getAc())) {
							Booking booking = new Booking(room.getRoomNum(),room.getFloor(),room.getOccupancy(),room.getAc());
							hotel.setBooking(booking);;
							Booking book = hotel.getBooking();
							System.out.println("Room number ="+ book.getRoomNum()+", floor no = "+book.getFloor()+", "+book.getAc()+"," +
												" "+ book.getOccupancy()+" Occupancy, estimated cost = "+ book.RoomPrice(room.getOccupancy(),room.getAc()));
							room.setRoomBookingStatus(true);
							isRoomAvailable =true;
							break;
							}

						else {
							isRoomAvailable =false;
						}
					}
				}

				else {
					isRoomAvailable =false;
				}
				
			}
			if(isRoomAvailable==false) {
				System.out.println("Sorry, Currently " + req.getOccupancy() + "room is not available");}
		}
	}
}
	