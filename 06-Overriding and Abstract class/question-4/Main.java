// Create class 2DFigure that contains data members, to represent dimensions and a method Calc_Area() to calculate corresponding area.
// Derive 2 classes Rectangle and Triangle from 2DFifure.
// Calculate corresponding areas.
// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-4> javac Main.java
// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-4> java Test
// Enter length of rectangle
// 3
// Enter breadth of rectangle
// 4
// Area of rectanle is 12.0
// Enter side of triangle
// 4
// Enter another side of triangle
// 6
// Area of triangle is 12.0
import java.io.*;

abstract class TwoDFigure {
    double a, b;

    TwoDFigure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calc() {
        return a * b;
    }

    abstract double calc1();
}

class Rectangle extends TwoDFigure {
    double a, b;

    Rectangle(int a, int b) {
        super(a, b);
    }

    double calc1() {
        return super.calc();
    }
}

class Triangle extends TwoDFigure {
    double a, b;

    Triangle(double a, double b) {
        super(a, b);
    }

    double calc1() {
        return 0.5 * super.calc();// 1/2 * base *height
    }
}

class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter length of rectangle");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter breadth of rectangle");
            int b = Integer.parseInt(br.readLine());
            Rectangle r = new Rectangle(a, b);
            System.out.println("Area of rectanle is " + r.calc1());
            System.out.println("Enter side of triangle");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter another side of triangle");
            b = Integer.parseInt(br.readLine());
            Triangle r1 = new Triangle(a, b);
            System.out.println("Area of triangle is " + r1.calc1());
        } catch (Exception e) {
            System.out.println("Exception Found was:-");
            e.printStackTrace();
        }
    }
}