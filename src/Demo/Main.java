package Demo;

public class Main {
    public static void main(String[] args) {

import java.util.Scanner;

        public class VariablesDemo {
            public static void main(String[] args) {

                Scanner scanner = new Scanner (System.in);

                System.out.println("Enter your first name: ");
                String firstName = scanner.nextLine();

                System.out.println("Enter your middle name: ");
                String middleName = scanner.nextLine();

                System.out.println("Enter your last name: ");
                String lastName = scanner.nextLine();
                System.out.println("My full name is: " + firstName + " " + middleName  + " " + lastName );



            }
        }





import java.util.Scanner;

        public class TrianglePerimeter {
            public static void main(String[] args) {
                double sideA;
                double sideB;
                double sideC;
                Scanner scanner = new Scanner (System.in);

                System.out.println("Enter sideA: ");
                sideA = scanner.nextDouble();
                System.out.println("Enter sideB: ");
                sideB = scanner.nextDouble();
                System.out.println("Enter sideC: ");
                sideC = scanner.nextDouble();
                System.out.println("The perimeter of the triangle is: " + (sideA+sideB+sideC));
            }

        }

import java.util.Scanner;

        public class TriangleSurface {
            public static void main(String[] args) {
                double side;
                double height;

                Scanner scanner = new Scanner (System.in);
                System.out.println("Enter side of triangle: ");
                side = scanner.nextDouble();

                System.out.println("Enter height of triangle: ");
                height = scanner.nextDouble();

                double surface = side*height/2;

                System.out.println("The triangle surface is: " + surface);
            }
        }


    }
}
