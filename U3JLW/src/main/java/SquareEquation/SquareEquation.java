package SquareEquation;

public class SquareEquation {
    private double a;
    private double b;
    private double c;

    public SquareEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] Roots(){
        double discriminate=b*b-4*a*c;
        double roots[]={0,0};
        if(discriminate>=0){
            roots[0]=(-b+Math.sqrt(discriminate))/2*a;
            roots[1]=(-b-Math.sqrt(discriminate))/2*a;
        }
        else {
            roots=null;
            System.out.println("Нет корней");
        }
        return roots;
    }

    public double[] pointOfExstr(){
        double aDiv=this.a*2;
        double bDiv=this.b;
        double[]coordinate=new double[2];
        coordinate[0]=-b/(2*a);
        coordinate[1]=a*coordinate[0]*coordinate[0]+b*coordinate[0]+c;
        return coordinate;
    }

    public void intervals(){
        if(a>0){
            System.out.println("(..., "+this.pointOfExstr()[0]+") убывает ("+this.pointOfExstr()[0]+" ,...) - возрастает" );
        }
        else {
            System.out.println("(..., "+this.pointOfExstr()[0]+") возрастает ("+this.pointOfExstr()[0]+" ,...) - убывает" );
        }
    }

    @Override
    public String toString() {
        return "SquareEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
