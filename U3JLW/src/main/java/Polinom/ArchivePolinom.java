package Polinom;

import SquareEquation.SquareEquation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivePolinom {
    private ArrayList<Polinom> polinomArrayList = new ArrayList<>();
    private static ArchivePolinom squareEquationArchive;

    private ArchivePolinom(){}

    public static ArchivePolinom getInt(){
        if(squareEquationArchive==null){
            squareEquationArchive = new ArchivePolinom();
            squareEquationArchive.initArchivePolinom();
        }
        return squareEquationArchive;
    }

    private void initArchivePolinom(){
        String[]subinf;
        try {
            File fileCrewMember=new File("C:\\complex");
            FileReader fileReader = new FileReader(fileCrewMember);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String information=bufferedReader.readLine();
            ArrayList<Integer> newCoff=new ArrayList<>();
            while (information != null) {
                if(information.equals("")) return;
                subinf=information.split(";");
                newCoff.clear();
                for(String s: subinf){
                    String subsubinf[]=s.split(",");
                    newCoff.add(Integer.valueOf(subsubinf[0]));
                    newCoff.add(Integer.valueOf(subsubinf[1]));
                }
                polinomArrayList.add(new Polinom(newCoff));
                information = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Polinom> getPolinomsArray() {
        return polinomArrayList;
    }

    public void showAllPolinoms(){
        for(Polinom sq:polinomArrayList){
            System.out.println(sq.toString());
        }
    }
}
