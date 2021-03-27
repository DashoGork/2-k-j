import info.DataAndName;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * <b>ЛБ2</b>.
 * @autor Okrut
 */
public class U2JLW {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numbArray=new ArrayList<>();
        int average=0, numberOf=0;

        /**
         * @exception Task1 могут быть введены не целые числа - NumberFormatException
         */
        try{
            System.out.println("3.\tВывести на консоль те числа, длина которых больше средней, а также длину." +
                    " \nВведите целые числа в строку через пробел");
            String enterString =scanner.nextLine();
            for(String part:enterString.split(" ")){
                average+=part.length();
                numbArray.add(Integer.parseInt(part));
                numberOf++;
            }

            average=average/numberOf;
            System.out.println("Средняя длинна"+average);
            for(String part:enterString.split(" ")){
                if(part.length()>=average) System.out.println(part+" " + part.length());
            }
         } catch(NumberFormatException e){
            System.out.println("Что-то не то введено! Прерываю выполнение.");
        }

        scanner.nextLine();
        /**
         * @exception Task2 могут быть введены не целые числа - NumberFormatException
         */
        try{
            System.out.println("Ввести с консоли п -размерность матрицы а [ п ][ п ]. Задать значения элементов матрицы в интервале значений от -п" +
                    " до п с помощью генератора случайных чисел. 3.\tНайти и вывести наибольшее число возрастающих элементов матрицы, идущих подряд." +
                    "\nВведите размерность");
            Integer size =scanner.nextInt();
            int array[][]=new int[size][size];
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    array[i][j]=(int)(Math.random()*(2*size+1))-size;
                    System.out.print(array[i][j]+"   ");
                }
                System.out.println();
            }
            int max=0;
            int number=0;
            for(int i=0;i<size;i++){
                for(int j=0;j<size-1;j++){
                    if(array[i][j]<array[i][j+1]){
                        number++;
                        if(max < number){
                            max = number;}
                    }
                    else
                        number=0;
                    }
                }
            System.out.println(max);
       }catch (NumberFormatException e){
            System.out.println("Что-то не то введено! Прерываю выполнение.");
        }

        DataAndName.seeDateAndName();
    }





}
