package Polinom;

import java.util.ArrayList;

public class Polinom {
    private ArrayList<Integer> coefficents = new ArrayList<>();

    public Polinom(int...args){
        for(int arg:args){
            coefficents.add(arg);
        }
    }

    public Polinom(ArrayList<Integer> integer){
        for(Integer i:integer){
            coefficents.add(i);
        }
    }

    public Polinom(int r, int i){

    }

    public ArrayList<Integer> getCoefficents() {
        return coefficents;
    }

    public Polinom sum(Polinom polinom){
        int Maxsize = this.coefficents.size()>=polinom.coefficents.size() ? this.coefficents.size() : polinom.coefficents.size();
        int Minsize = this.coefficents.size()>=polinom.coefficents.size() ? polinom.coefficents.size() : this.coefficents.size();
        ArrayList<Integer> newArr=new ArrayList<>(Maxsize);
        for(int i=0;i<Minsize;i++){
            newArr.add(i,polinom.coefficents.get(i)+this.coefficents.get(i));
        }
        for(int i=Minsize;i<Maxsize;i++){
            newArr.add(i,this.coefficents.get(i));
        }
        Polinom polinom1= new Polinom(newArr);
        return polinom1;
    }

    @Override
    public String toString() {
        String toString="Polinom{ ";
        for(int i=0;i<coefficents.size();i+=2){
            toString+=coefficents.get(i)+"+"+coefficents.get(i+1)+ "i";
            toString+=", ";
        }
        toString+=" }";
        return toString;
    }


//    @Override
//    public String toString() {
//        return "Polinom{" +
//                "coefficents=" + coefficents +
//                '}';
//    }
}
