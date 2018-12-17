public class Average {
    public static final int FIRST_COEFFICIENT = 100_000;
    public static final int SECOND_COEFFICIENT = 10_000;
    public static final int THIRD_COEFFICIENT = 1_000;
    public static final int FOUTH_COEFFICIENT = 100;
    public static final int FIVES_COEFFICIENT = 10;

    public static double calculateArithmetic(int n){
        double AverageValue;

        int FirstDischarge = n / FIRST_COEFFICIENT;
        int SecondDischarge = (n - FIRST_COEFFICIENT) / SECOND_COEFFICIENT;
        int ThirdDischarge = (n - FirstDischarge * FIRST_COEFFICIENT  - SecondDischarge * SECOND_COEFFICIENT) / THIRD_COEFFICIENT;
        int FouthDiscahrge = ((n - FirstDischarge * FIRST_COEFFICIENT  - SecondDischarge * SECOND_COEFFICIENT) - ThirdDischarge * THIRD_COEFFICIENT)/FOUTH_COEFFICIENT;
        int FivesDischarge = (((n - FirstDischarge * FIRST_COEFFICIENT  - SecondDischarge * SECOND_COEFFICIENT) - ThirdDischarge * THIRD_COEFFICIENT) - FouthDiscahrge * FOUTH_COEFFICIENT) / FIVES_COEFFICIENT;
        int SixthDischarge = ((((n - FirstDischarge * FIRST_COEFFICIENT  - (SecondDischarge * SECOND_COEFFICIENT)) - (ThirdDischarge * THIRD_COEFFICIENT)) - (FouthDiscahrge * FOUTH_COEFFICIENT)) - (FivesDischarge * FIVES_COEFFICIENT));

        return AverageValue = (FirstDischarge + SecondDischarge + ThirdDischarge + FouthDiscahrge + FivesDischarge + SixthDischarge)/6;
    }

    public static double calculateGeometrical(int n){
        double AverageValue;

        int FirstDischarge = n / FIRST_COEFFICIENT;
        int SecondDischarge = (n - FIRST_COEFFICIENT) / SECOND_COEFFICIENT;
        int ThirdDischarge = (n - FirstDischarge * FIRST_COEFFICIENT  - SecondDischarge * SECOND_COEFFICIENT) / THIRD_COEFFICIENT;
        int FouthDiscahrge = ((n - FirstDischarge * FIRST_COEFFICIENT  - SecondDischarge * SECOND_COEFFICIENT) - ThirdDischarge * THIRD_COEFFICIENT)/FOUTH_COEFFICIENT;
        int FivesDischarge = (((n - FirstDischarge * FIRST_COEFFICIENT  - SecondDischarge * SECOND_COEFFICIENT) - ThirdDischarge * THIRD_COEFFICIENT) - FouthDiscahrge * FOUTH_COEFFICIENT) / FIVES_COEFFICIENT;
        int SixthDischarge = ((((n - FirstDischarge * FIRST_COEFFICIENT  - (SecondDischarge * SECOND_COEFFICIENT)) - (ThirdDischarge * THIRD_COEFFICIENT)) - (FouthDiscahrge * FOUTH_COEFFICIENT)) - (FivesDischarge * FIVES_COEFFICIENT));

        return AverageValue = Math.pow((FirstDischarge * SecondDischarge * ThirdDischarge * FouthDiscahrge * FivesDischarge * SixthDischarge),6);
    }
}
