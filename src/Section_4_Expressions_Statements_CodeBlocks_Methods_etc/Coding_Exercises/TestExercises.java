package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;


import java.awt.geom.Area;

public class TestExercises {
    public static void main(String[] args) {

        ExerciseSeparator separator = new ExerciseSeparator();
        int separator_length = 20;

        // ***** Testing *****

        // 1. PositiveNegativeZero
        PositiveNegativeZero pos_neg_zero = new PositiveNegativeZero();
        pos_neg_zero.checkNumber(5);
        pos_neg_zero.checkNumber(-10);
        pos_neg_zero.checkNumber(0);
        separator.separate_exercises(separator_length);

        // N.B. - Instead of creating an instance of the class to access its methods, can call directly on the class (see below);

        // 2. SpeedConverter
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);

//        ---- Alternative: ----
//        SpeedConverter speed_conv = new SpeedConverter();
//        speed_conv.printConversion(1.5);
//        speed_conv.printConversion(10.25);
//        speed_conv.printConversion(-5.6);
//        speed_conv.printConversion(25.42);
//        speed_conv.printConversion(75.114);

        separator.separate_exercises(separator_length);

        // 3. MegaBytesConverter
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        separator.separate_exercises(separator_length);

        // 4. BarkingDog
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
        separator.separate_exercises(separator_length);

        // 5. LeapYearCalculator
        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.println(LeapYearCalculator.isLeapYear(2000));
        separator.separate_exercises(separator_length);

        // 6. DecimalComparator
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // INCORRECT, should be true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        separator.separate_exercises(separator_length);

        // 7. EqualSumChecker
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
        separator.separate_exercises(separator_length);

        // 8. TeenNumberChecker
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));

        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
        separator.separate_exercises(separator_length);

        // 9. AreaCalculator
        System.out.println(AreaCalculator.area(5));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5, 4));
        System.out.println(AreaCalculator.area(-1, 4));
        separator.separate_exercises(separator_length);

        // 10. MinutesToYearsAndDaysCalculator
        MinutesToYearsAndDaysCalculator.printYearsAndDays(525_600);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(1_051_200);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(561_600);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(-1_000);
        separator.separate_exercises(separator_length);

        // 11. EqualityPrinter
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);
        EqualityPrinter.printEqual(-1, -1, -1);
        separator.separate_exercises(separator_length);

        // 12. PlayingCat
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
        separator.separate_exercises(separator_length);
    }
}
