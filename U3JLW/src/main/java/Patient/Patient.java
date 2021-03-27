package Patient;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String middlename;
    private String adress;
    private String number;
    private long numberOfCard;
    private String diagnosis;

    public Patient(int id, String name, String surname, String middlename, String adress, String number, long numberOfCard, String diagnosis) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.adress = adress;
        this.number = number;
        this.numberOfCard = numberOfCard;
        this.diagnosis = diagnosis;
    }

    public Patient(int id, String name, String surname, String adress, long numberOfCard, String diagnosis) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.numberOfCard = numberOfCard;
        this.diagnosis = diagnosis;
    }

    public Patient(String name, String surname, String diagnosis) {
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumberOfCard(long numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public long getNumberOfCard() {
        return numberOfCard;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", adress='" + adress + '\'' +
                ", number='" + number + '\'' +
                ", numberOfCard=" + numberOfCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
