import Patient.PatientArchive;
import Patient.Service;
import Polinom.ArchivePolinom;
import Polinom.Polinom;
import SquareEquation.ArchiveSquareEquation;
import SquareEquation.SquareEquation;

import java.security.Policy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        PatientArchive patientArchive=PatientArchive.getInt();
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Создать классы, спецификации которых приведены ниже. Определить кон¬структоры и методы set Тип (), get Тип (), toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.");
//        patientArchive.showAllPatients();
//        System.out.println("Введите диагноз");
//        String enterString =scanner.nextLine();
//        Service service= Service.getInt();
//        service.getByDiagnoses(enterString);
//        scanner.nextLine();
//        System.out.println("Введите диапозон");
//        System.out.println("От");
//        String enterString2 =scanner.nextLine();
//        System.out.println("До");
//        String enterString3 =scanner.nextLine();
//        service.getByCardNumber(Long.valueOf(enterString2),Long.valueOf(enterString3));
//        scanner.nextLine();
//
//        ArchiveSquareEquation archiveSquareEquation=ArchiveSquareEquation.getInt();
//        for(SquareEquation sq: archiveSquareEquation.getSquareEquationsArray()){
//            System.out.println(sq.toString());
//            System.out.println(sq.Roots()[0]+" "+sq.Roots()[1]);
//            System.out.println("("+sq.pointOfExstr()[0]+", "+sq.pointOfExstr()[1]+")");
//            sq.intervals();
//        }

        ArchivePolinom archivePolinom=ArchivePolinom.getInt();
        archivePolinom.showAllPolinoms();

        Polinom polinom11=archivePolinom.getPolinomsArray().get(0).sum(archivePolinom.getPolinomsArray().get(1));
        Polinom polinom12=archivePolinom.getPolinomsArray().get(1).sum(archivePolinom.getPolinomsArray().get(2));
        System.out.println(polinom11.toString());
        System.out.println(polinom12.toString());

    }
}
