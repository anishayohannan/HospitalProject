package hospitalAssignmnt;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospitalmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalhospcharge=0;

		Patient Patient1=new Patient("Arya","fever","A101",1);
		Patient Patient2=new Patient("Archana","cold","A102",5);
		Patient Patient3=new Patient("Akash","stomachpain","A103",6);
		Patient Patient4=new Patient("Alina","backpain","A104",8);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("fever", 10);
		map.put("cold", 20);
		map.put("stomachpain", 15);
		map.put("backpain", 10);
		
		
		HospitalDetails AABHospital=new HospitalDetails("AABhospital","Chennai",230,7);
		System.out.println("Hospital name is "+AABHospital.getHospitalname());
		Boolean ismutli=AABHospital.ismultispeciality();
		System.out.println("Multispeciality "+AABHospital.ismultispeciality());
		
		System.out.println(ismutli);
		if(ismutli)
		{
			totalhospcharge=totalhospcharge+100;
		}
		else
		{
			totalhospcharge=totalhospcharge+50;
		}
		
		ArrayList<Patient> PatientList=new ArrayList<Patient>();
		PatientList.add(Patient1);
		PatientList.add(Patient2);
		PatientList.add(Patient3);
		PatientList.add(Patient4);
		for(Patient p:PatientList)
		{
//		System.out.println(p.getName());
//		System.out.println(p.getIllness());
//		System.out.println(p.getPatientid());
//		System.out.println(p.getNoofdaysadmitted());
//		System.out.println();
		if(map.containsKey(p.getIllness()))
		{
			int illnesscharge=map.get(p.getIllness());
			//totalhospcharge=+totalhospcharge+Double.valueOf(map.get(p.getIllness()).toString());
			totalhospcharge=totalhospcharge+illnesscharge;	
		}
		else
		{
			totalhospcharge=totalhospcharge+5;
		}
		if(p.isadmitted())
		{
			
		}
		totalhospcharge=totalhospcharge+(p.getNoofdaysadmitted()*10);
		
		double patientcharge=(totalhospcharge*10)/100;
		double insurancecharge=(totalhospcharge*90)/100;
		System.out.println("patientshare="+patientcharge);
		System.out.println("insurance share="+insurancecharge);
		
		}
		
	}
		
	

}
