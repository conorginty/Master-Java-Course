package Section_5_Control_Flow_Statements.Coding_Exercises;

public class TestExercises {
    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(NumberPalindrome.isPalindrome(123));
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(104));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(-12));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(33571));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(SharedDigit.hasSharedDigit(12, 23));
        System.out.println(SharedDigit.hasSharedDigit(9, 99));
        System.out.println(SharedDigit.hasSharedDigit(15, 55));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(LastDigitChecker.hasSameDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameDigit(9, 99, 999));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        ExerciseSeparator.separate_exercises(20);

        AllFactors.printFactors(6);
        AllFactors.printFactors(32);
        AllFactors.printFactors(10);
        AllFactors.printFactors(-1);
        ExerciseSeparator.separate_exercises(20);

        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println("-----");
        System.out.println(NumberToWords.reversedNum(-121));
        System.out.println(NumberToWords.reversedNum(1212));
        System.out.println(NumberToWords.reversedNum(1234));
        System.out.println(NumberToWords.reversedNum(100));
        System.out.println("-----");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        ExerciseSeparator.separate_exercises(20);

        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));
        ExerciseSeparator.separate_exercises(20);

        System.out.println(LargestPrime.getLargestPrimeFactor(21));
        System.out.println(LargestPrime.getLargestPrimeFactor(217));
        System.out.println(LargestPrime.getLargestPrimeFactor(0));
        System.out.println(LargestPrime.getLargestPrimeFactor(45));
        System.out.println(LargestPrime.getLargestPrimeFactor(-1));
        ExerciseSeparator.separate_exercises(20);

        DiagonalStar.printSquareStar(5);
        System.out.println("-----");
        DiagonalStar.printSquareStar(8);
        ExerciseSeparator.separate_exercises(20);

//        InputCalculator.inputThenPrintSumAndAverage();
        ExerciseSeparator.separate_exercises(20);

        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("-----");
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
        ExerciseSeparator.separate_exercises(20);
    }
}
