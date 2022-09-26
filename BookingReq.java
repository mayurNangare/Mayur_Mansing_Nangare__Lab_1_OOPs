public class BookingReq {
	private String occupancy;
	private String facilityName;
	private String floor;

	
	public BookingReq(String occupancy, String facilityName, String floor) {
		this.occupancy = occupancy;
		this.facilityName = facilityName;
		this.floor=floor;
	}
	// Methods--------------------------------------------------------------------------------------------

	public String getOccupancy() {
		return occupancy;
	}

	public String getFacilityName() {
		return facilityName;
	}
	
	public String getFloor() {
		return floor;
	}
	
}