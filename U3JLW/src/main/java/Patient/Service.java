package Patient;

public class Service {
    private static Service service;
    private PatientArchive patientArchive= PatientArchive.getInt();


    private Service(){}

    public static Service getInt(){
        if(service==null){
            service=new Service();
        }
        return service;
    }

    public void getByDiagnoses(String diagnoses){
        boolean exists=false;
        for(Patient patient:PatientArchive.getInt().getPatientArrayList()){
            if(patient.getDiagnosis().equals(diagnoses)) {
                System.out.println(patient.toString());
                exists=true;
            }
        }if(!exists){
            System.out.println("Не существует!");
        }
    }

    public void getByCardNumber(long from,long  to){
        boolean exists=false;
        for(Patient patient:PatientArchive.getInt().getPatientArrayList()){
            if(patient.getNumberOfCard()>=from & patient.getNumberOfCard()<=to) {
                System.out.println(patient.toString());
                exists=true;
            }

        } if(!exists){
            System.out.println("Не существует!");
        }
    }
}
