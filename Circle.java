public class Circle {
    public static double calculationSquareCircle(double r1, double r2){
        double FirstSquare = Math.PI * r1 * r1;
        double SecondSquare = Math.PI * r2 * r2;

        return FirstSquare-SecondSquare;
    }
}
