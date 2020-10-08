import java.util.Scanner;

public class ShapesDemo {

    public static void main(String[] args) {

        boolean choose = true;
        Shape shape;
        Data data = new Data();

        System.out.println("Witaj w kalkulatorze pól i obwodów. Jaką figurę wybierasz (trójkąt, koło, kwadrat)");

        while (choose) {
            Scanner typedText = new Scanner(System.in);
            String choosenShape = typedText.nextLine().toLowerCase();

            switch (choosenShape) {
                case "trójkąt":
                    System.out.println("Podaj bok a");
                    data.insertData();
                    double a = data.getInsertData();
                    System.out.println("Podaj bok b");
                    data.insertData();
                    double b = data.getInsertData();
                    System.out.println("Podaj bok c");
                    data.insertData();

                    double c = data.getInsertData();
                    System.out.println("Podaj wysokość h");
                    data.insertData();
                    double h = data.getInsertData();

                    shape = new Triangle(a, b, h, c);

                    System.out.println("Pole wynosi: " + shape.calculateArea());
                    System.out.println("Obwód wynosi: " + shape.calculateCircuit());
                    if(!(a + b > c && b + c > a && c + a > b))
                        System.out.println("Ale to nie jest trójkąt");
                    choose = false;
                    break;
                case "koło":
                    System.out.println("Podaj promień r");
                    data.insertData();
                    double r = data.getInsertData();

                    shape = new Circle(r);

                    System.out.println("Pole wynosi: " + shape.calculateArea());
                    System.out.println("Obwód wynosi: " + shape.calculateCircuit());
                    choose = false;
                    break;

                case "kwadrat":
                    System.out.println("Podaj bok a");
                    data.insertData();
                    a = data.getInsertData();
                    System.out.println("Podaj bok b");
                    data.insertData();
                    b = data.getInsertData();

                    shape = new Square(a, b);

                    System.out.println("Pole wynosi: " + shape.calculateArea());
                    System.out.println("Obwód wynosi: " + shape.calculateCircuit());
                    choose = false;
                    break;
                default:
                    System.out.println("Błędnie wpisana figura");
                    choose = true;
                    break;
            }
        }
        System.out.println("Koniec.");
    }
}
