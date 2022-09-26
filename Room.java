class Room {
	private int roomNum;
	private String occupancy;
	private boolean roomBookingStatus;
	private String floor;
	private String ac;
	
	public Room(int roomNum,String occupancy,boolean roombookingStatus, String floor,String ac){
		this.roomNum = roomNum;
		this.occupancy= occupancy;
		this.roomBookingStatus = roombookingStatus;
		this.floor = floor;
		this.ac = ac;
	}


	// Methods--------------------------------------------------------------------------------------------

	public int getRoomNum() {
		return roomNum;
	}

	public String getOccupancy() {
		return occupancy;
	}

	public boolean isRoomBookingStatus() {
		return roomBookingStatus;
	}
	
	public void setRoomBookingStatus(boolean roomBookingStatus) {
		this.roomBookingStatus = roomBookingStatus;
	}

	public String getFloor() {
		return floor;
	}

	public String getAc() {
		return ac;
	}
	
}