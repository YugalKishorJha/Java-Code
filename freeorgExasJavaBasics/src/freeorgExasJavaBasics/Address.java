package freeorgExasJavaBasics;
public class Address {

	String houseNo;;
	int streetNo;
	int buildingNo;
	
	
	public Address(String houseNo, int streetNo, int buildingNo) {
		this.houseNo = houseNo;
		this.streetNo = streetNo;
		this.buildingNo = buildingNo;
	}


	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetNo=" + streetNo + ", buildingNo=" + buildingNo + "]";
	}
	
	

}
