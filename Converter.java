public class Converter {
    public static final int MILLIGRAMS = 1_000_000;
    public static final int GRAMS = 1000;
    public static final double TON = 0.001;

    public static double convertToMilligrams(double w){
        return w*MILLIGRAMS;
    }
    public static double convertToGramms(double w){
        return w*GRAMS;
    }
    public static double convertToToN(double w){
        return w*TON;
    }
}
