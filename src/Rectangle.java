import java.util.Scanner;

public class Rectangle {
    static double side1,side2;

    public static double areaCalculator(double num1,double num2){
        side1 = num1 + num2;
        return side1;
    }
    public static double perimeterCalculator(double num1,double num2){
        side2 = (num1 + num2)*2;
        return side2;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
     //    double side1 = 0,side2=0;

        System.out.println("Введите длину прямоугольника");
        double num1 = in.nextDouble();
        System.out.println("Введите 2 длину прямоугольника");
        double num2 = in.nextDouble();
        System.out.println("Площадь прямоугольника: "+side1);
        System.out.println("Периметра прямоугольника: "+side2);



    }

//    public void viewResult(){
//        System.out.println("Площадь прямоугольника: "+side1);
//        System.out.println("Периметра прямоугольника: "+side2);

//    }
}







