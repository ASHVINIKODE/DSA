import java.util.Scanner;

public class areaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = scan.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = scan.nextInt();
        int Area, Perimeter;
        Area = length * breadth;
        Perimeter = 2 * (length + breadth);
        System.out.println("Area of the rectangle is:" + Area);
        System.out.println("Perimeter of the rectangle is:" + Perimeter);
    }
}
