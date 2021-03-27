import java.util.ArrayList;
import java.util.Scanner;

public class U1JLW {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numbArray=new ArrayList<>();

        System.out.println("Задание: 3.\tЧисла, которые делятся на 3 или на 9.\nВведите целые числа в строку через пробел");
        String enterString =scanner.nextLine();

        try{
            for(String part:enterString.split(" ")){
                numbArray.add(Integer.parseInt(part));
            }
            for(Integer number:numbArray){
                if(number%3==0 | number%9==0) System.out.print(number+" ");
            }
        } catch(NumberFormatException e){
            System.out.println("Что-то не то введено! Прерываю выполнение.");
        }


    }
}
