import java.io.*;
import java.io.Serializable;
public class Fuckaround1 {
    public static void main(String[] args) {
        Circle[] circles = new Circle[15];
        Square[] squares = new Square[15];
        int i = 0;
        int j = 0;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("circlessquares.dat copy")); ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("squares"));ObjectOutputStream output2 = new ObjectOutputStream(new FileOutputStream("circles"))){
            Object s = input.readObject();
            do{
                if(s instanceof Circle){
                    circles[i+1] = (Circle) s;
                }else {
                    squares[j+1] = (Square) s;
                }
            }while (s != null);
            for(int q = 0;q<circles.length;q++){
                System.out.println(circles[q]);
                System.out.println(squares[q]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
}
class Circle implements Serializable {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public String toString() {
        return  "Circle: " + radius;
    }
}

class Square implements Serializable{
    private double side;

    public Square(double side){
        this.side = side;
    }

    public String toString() {
        return  "Square: " + side;
        }
    }
}
