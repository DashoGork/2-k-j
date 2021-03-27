package SquareEquation;

import Patient.Patient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchiveSquareEquation {
    private ArrayList<SquareEquation> squareEquationsArray = new ArrayList<>();
    private static ArchiveSquareEquation squareEquationArchive;

    private ArchiveSquareEquation(){}

    public static ArchiveSquareEquation getInt(){
        if(squareEquationArchive==null){
            squareEquationArchive = new ArchiveSquareEquation();
            squareEquationArchive.initSquareEquationArchive();
        }
        return squareEquationArchive;
    }

    private void initSquareEquationArchive(){
        String[]subinf;
        try {
            File fileCrewMember=new File("C:\\sq");
            FileReader fileReader = new FileReader(fileCrewMember);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String information=bufferedReader.readLine();
            while (information != null) {
                if(information.equals("")) return;
                subinf=information.split(",");
                squareEquationsArray.add(new SquareEquation(Double.valueOf(subinf[0]),Double.valueOf(subinf[1]),Double.valueOf(subinf[2])));
                information = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<SquareEquation> getSquareEquationsArray() {
        return squareEquationsArray;
    }

    public void showAllEquations(){
        for(SquareEquation sq:squareEquationsArray){
            System.out.println(sq.toString());
        }
    }
}
