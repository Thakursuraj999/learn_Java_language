import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Hight of the Rectangle: ");
            double height = sc.nextDouble();
            System.out.print("Enter the Width od the Ractangle: ");
            double width = sc.nextDouble();
            double area = height * width;
            System.out.print("The area of the Rectangle is:"+ area + "cm²");
        }

    }
}