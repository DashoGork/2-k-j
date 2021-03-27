package Patient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PatientArchive {
    private ArrayList<Patient> patientArrayList = new ArrayList<>();
    private static PatientArchive patientArchive;

    private PatientArchive(){}

    public static PatientArchive getInt(){
        if(patientArchive==null){
            patientArchive = new PatientArchive();
            patientArchive.initPatientArchive();
        }
        return patientArchive;
    }

    private void initPatientArchive(){
        String[]subinf;
        try {
            File fileCrewMember=new File("C:\\patient");
            FileReader fileReader = new FileReader(fileCrewMember);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String information=bufferedReader.readLine();
            while (information != null) {
                subinf=information.split(",");
                patientArrayList.add(new Patient(Integer.valueOf(subinf[0]),subinf[1],subinf[2],subinf[3],subinf[4],subinf[5],Long.valueOf(subinf[6]),subinf[7]));
                information = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Patient> getPatientArrayList() {
        return patientArrayList;
    }

    public void showAllPatients(){
        for(Patient patient:patientArrayList){
            System.out.println(patient.toString());
        }
    }
}
