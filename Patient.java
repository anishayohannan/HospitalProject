package hospitalAssignmnt;

public class Patient {

	private String name;
	private String illness;
	private String patientid;
	private int noofdaysadmitted;
	
	public Patient(String name,String illness,String patientid,int noofdaysadmitted)
	{
		this.name=name;
		this.illness=illness;
		this.patientid=patientid;
		this.noofdaysadmitted=noofdaysadmitted;
		
	}

	public String getName() {
		return name;
	}

	public String getIllness() {
		return illness;
	}

	public String getPatientid() {
		return patientid;
	}

	public int getNoofdaysadmitted() {
		return noofdaysadmitted;
	}
	public boolean isadmitted()
	{
		return noofdaysadmitted>0;
	}
	
}
