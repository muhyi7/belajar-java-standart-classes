package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 8;

        Long LongValue = intValue.longValue();
        Double DoubleValue = LongValue.doubleValue();
        Short ShortValue = DoubleValue.shortValue();

        String contoh = "100.10";

        Double contohInt = Double.valueOf(contoh);
        System.out.println(contohInt);

    }
}
