import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        inputConsole();
    }
    private static void inputConsole(){
        double weight = 250;

        double weight_milligrams = Converter.convertToMilligrams(weight);
        double weight_grams = Converter.convertToGramms(weight);
        double weight_ton = Converter.convertToToN(weight);

        Printer.print("Масса в киллограммах:", weight);
        Printer.print("Масса в граммах:", weight_grams);
        Printer.print("Масса в миллиграммах:", weight_milligrams);
        Printer.print("Масса в тоннах:", weight_ton);


        int numberA = 3;
        int numberB = 3;
        int numberC = 3;
        boolean resultOfCompare = Comparator.compareNumbers(numberA, numberB, numberC);

        System.out.println(resultOfCompare);


        double radius1 = 8;
        double radius2 = 6;
        double resultOfSquare = Circle.calculationSquareCircle(radius1, radius2);

        Printer.print("Площадь круга:", resultOfSquare);


        int numberOfSequence = 1234;
        int resultOfSequence = Sequence.checkSequence(numberOfSequence);
        if(resultOfSequence == 1){
            System.out.println("Положительная последовательность");
        }
        else if(resultOfSequence == 0){
            System.out.println("Отрицательная последовательность");
        }else{
            System.out.println("Не является послежовательностью");
        }


        int sixDigitNumber = 654321;
        double ArithmeticResult = Average.calculateArithmetic(sixDigitNumber);
        double GeomiricalResult = Average.calculateGeometrical(sixDigitNumber);

        Printer.print("Арифметическое среднее цифр: ", ArithmeticResult);
        Printer.print("Шеометрическое среднее цифр: ", GeomiricalResult);


        int sevenDigitNumber = 1234567;
        int resultOfReverse = BackNumber.reverse(sevenDigitNumber);

        Printer.print("Перевёрнутое число: ", resultOfReverse);

        int number1 = 6;
        int number2 = 8;

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println(number1);
        System.out.println(number2);

    }
}
