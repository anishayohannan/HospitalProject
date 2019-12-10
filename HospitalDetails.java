package hospitalAssignmnt;

public class HospitalDetails {
	private String hospitalname;
	private String location;
	private int noofdept;
	private int noofbeds;
	HospitalDetails(String hospitalname,String location,int noofdept,int noofbeds )
	{
	this.hospitalname=hospitalname;
	this.location=location;
	this.noofdept=noofdept;
	this.noofbeds=noofbeds;
	}
	
	
	public String getHospitalname() {
		return hospitalname;
	}
	public String getLocation() {
		return location;
	}
	public int getNoofdept() {
		return noofdept;
	}
	public int getNoofbeds() {
		return noofbeds;
	}
	
	
	public boolean ismultispeciality() {
		return noofdept>5?true:false;
	}
		
	

}

