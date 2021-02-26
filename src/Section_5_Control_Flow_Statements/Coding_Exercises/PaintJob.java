package Section_5_Control_Flow_Statements.Coding_Exercises;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // width: represents the width of the wall
        // height: represents the width of the wall
        // areaPerBucket: represents area that can be covered with 1 bucket of paint
        // extraBuckets: represents the bucket count that Bob has at home

        boolean valid_params = width >= 0 && height >= 0 && areaPerBucket >= 0 && extraBuckets > 0;

        if (!valid_params) {
            return -1;
        }

        double wallArea = height * width;
        double areaThatCanBeCoveredAlready = areaPerBucket * extraBuckets;
        double areaLeftToCover = wallArea - areaThatCanBeCoveredAlready;

        if (areaLeftToCover <= 0) {
            return 0;
        }

        int count = 0;
        while (areaLeftToCover > 0) {
            count++;
            areaLeftToCover -= areaPerBucket;
        }
        return count;
    }

    // OVERLOADED METHOD
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        // width: represents the width of the wall
        // height: represents the width of the wall
        // areaPerBucket: represents area that can be covered with 1 bucket of paint

        boolean valid_params = width >= 0 && height >= 0 && areaPerBucket >= 0;

        if (!valid_params) {
            return -1;
        }

        double wallArea = height * width;

        if (wallArea == 0) {
            return 0;
        }

        int count = 0;
        while (wallArea > 0) {
            count++;
            wallArea -= areaPerBucket;
        }
        return count;
    }
}
