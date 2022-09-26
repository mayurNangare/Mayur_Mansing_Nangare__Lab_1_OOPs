class Booking{
	private int roomNum;
	private String floor;
	private String occupancy;
	private String ac;

	static int singleOccupancyRatePerDay = 2000;
	static int doubleOccupancyRatePerDay = 3000;
	static int tripleOccupancyRatePerDay = 4000;
	static int airConditionerPerNight = 1000;

	public Booking(int roomNum, String floor, String occupancy,String ac) {
		this.roomNum = roomNum;
		this.floor = floor;
		this.occupancy = occupancy;
		this.ac = ac;
	}


	// Methods--------------------------------------------------------------------------------------------

	
	public int getRoomNum() {
		return roomNum;
	}
	public String getFloor() {
		return floor;
	}
	public String getOccupancy() {
		return occupancy;
	}
	
	public String getAc() {
		return ac;
	}
	
	
	
	public int RoomPrice(String occupancy, String AC) {
		int totalCharges;
		if(AC.equals("AC"))
			totalCharges=airConditionerPerNight;
		else
			totalCharges=0;
		switch(occupancy) {
		case "Single": return singleOccupancyRatePerDay+totalCharges;
		case "Double": return doubleOccupancyRatePerDay+totalCharges;
		case "Triple": return tripleOccupancyRatePerDay+totalCharges;
		}
		return 0;
	}

}