package output;

import util.Mode;

import java.util.Map;
import java.util.Objects;

public class GenerateOutput {

    private GenerateOutput() {
    }

    public static void generateOutput(int targetPointTotal, int staticPointTotal, Mode mode, Map<String, Integer> resultMap) {
        if (resultMap != null && !resultMap.isEmpty()) {
            if (Objects.requireNonNull(mode).equals(Mode.CHURCH)) {
                GenerateOutput.iterateOverPermutationsChurch(resultMap, staticPointTotal, targetPointTotal);
            } else if (Objects.requireNonNull(mode).equals(Mode.WATCHTOWER)) {
                GenerateOutput.iterateOverPermutationsWatchTower(resultMap, staticPointTotal, targetPointTotal);
            } else {
                System.out.println("No mode set");
            }
        } else {
            System.out.println("Result map empty");
        }
    }

    /**
     * Outputs all permutations for all church levels.
     *
     * @param permutationsMap  All permutations of buildings as per input criteria
     * @param staticPointTotal Given static point total for the set buildings
     * @param targetPointTotal Given target point total for complete build
     */
    private static void iterateOverPermutationsChurch(Map<String, Integer> permutationsMap, int staticPointTotal, int targetPointTotal) {
        int staticPointTotalChurchOne = staticPointTotal + 10;
        int staticPointTotalChurchTwo = staticPointTotal + 12;
        int staticPointTotalChurchThree = staticPointTotal + 14;
        int pointDifferenceNoChurch = targetPointTotal - staticPointTotal;
        int pointDifferenceChurchOne = targetPointTotal - staticPointTotalChurchOne;
        int pointDifferenceChurchTwo = targetPointTotal - staticPointTotalChurchTwo;
        int pointDifferenceChurchThree = targetPointTotal - staticPointTotalChurchThree;

        for (Map.Entry<String, Integer> entry : permutationsMap.entrySet()) {
            if (entry.getValue() == pointDifferenceNoChurch) {
                System.out.println("Church Zero = " + entry);
            }

            if (entry.getValue() == pointDifferenceChurchOne) {
                System.out.println("Church One = " + entry);
            }

            if (entry.getValue() == pointDifferenceChurchTwo) {
                System.out.println("Church Two = " + entry);
            }

            if (entry.getValue() == pointDifferenceChurchThree) {
                System.out.println("Church Three = " + entry);
            }
        }
    }

    /**
     * Outputs all permutations for all watchtower levels.
     *
     * @param permutationsMap  All permutations of buildings as per input criteria
     * @param staticPointTotal Given static point total for the set buildings
     * @param targetPointTotal Given target point total for complete build
     */
    private static void iterateOverPermutationsWatchTower(Map<String, Integer> permutationsMap, int staticPointTotal, int targetPointTotal) {
        int staticPointTotalWTOne = staticPointTotal + 42;
        int staticPointTotalWTTwo = staticPointTotal + 50;
        int staticPointTotalWTThree = staticPointTotal + 60;
        int staticPointTotalWTFour = staticPointTotal + 73;
        int staticPointTotalWTFive = staticPointTotal + 87;
        int staticPointTotalWTSix = staticPointTotal + 105;
        int staticPointTotalWTSeven = staticPointTotal + 125;
        int staticPointTotalWTEight = staticPointTotal + 150;
        int staticPointTotalWTNine = staticPointTotal + 181;
        int staticPointTotalWTTen = staticPointTotal + 217;
        int staticPointTotalWTEleven = staticPointTotal + 260;
        int staticPointTotalWTTwelve = staticPointTotal + 312;
        int staticPointTotalWTThirteen = staticPointTotal + 374;
        int staticPointTotalWTFourteen = staticPointTotal + 449;
        int staticPointTotalWTFifteen = staticPointTotal + 539;
        int staticPointTotalWTSixteen = staticPointTotal + 647;
        int staticPointTotalWTSeventeen = staticPointTotal + 777;
        int staticPointTotalWTEighteen = staticPointTotal + 932;
        int staticPointTotalWTNineteen = staticPointTotal + 1118;
        int staticPointTotalWTTwenty = staticPointTotal + 1342;
        int pointDifferenceNoWT = targetPointTotal - staticPointTotal;
        int pointDifferenceWT = targetPointTotal - staticPointTotalWTOne;
        int pointDifferenceWTTwo = targetPointTotal - staticPointTotalWTTwo;
        int pointDifferenceWTThree = targetPointTotal - staticPointTotalWTThree;
        int pointDifferenceWTFour = targetPointTotal - staticPointTotalWTFour;
        int pointDifferenceWTFive = targetPointTotal - staticPointTotalWTFive;
        int pointDifferenceWTSix = targetPointTotal - staticPointTotalWTSix;
        int pointDifferenceWTSeven = targetPointTotal - staticPointTotalWTSeven;
        int pointDifferenceWTEight = targetPointTotal - staticPointTotalWTEight;
        int pointDifferenceWTNine = targetPointTotal - staticPointTotalWTNine;
        int pointDifferenceWTTen = targetPointTotal - staticPointTotalWTTen;
        int pointDifferenceWTEleven = targetPointTotal - staticPointTotalWTEleven;
        int pointDifferenceWTTwelve = targetPointTotal - staticPointTotalWTTwelve;
        int pointDifferenceWTThirteen = targetPointTotal - staticPointTotalWTThirteen;
        int pointDifferenceWTFourteen = targetPointTotal - staticPointTotalWTFourteen;
        int pointDifferenceWTFifteen = targetPointTotal - staticPointTotalWTFifteen;
        int pointDifferenceWTSixteen = targetPointTotal - staticPointTotalWTSixteen;
        int pointDifferenceWTSeventeen = targetPointTotal - staticPointTotalWTSeventeen;
        int pointDifferenceWTEighteen = targetPointTotal - staticPointTotalWTEighteen;
        int pointDifferenceWTNineteen = targetPointTotal - staticPointTotalWTNineteen;
        int pointDifferenceWTTwenty = targetPointTotal - staticPointTotalWTTwenty;

        for (Map.Entry<String, Integer> entry : permutationsMap.entrySet()) {
            if (entry.getValue() == pointDifferenceNoWT) {
                System.out.println("WT Zero = " + entry);
            }

            if (entry.getValue() == pointDifferenceWT) {
                System.out.println("WT One = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTTwo) {
                System.out.println("WT Two = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTThree) {
                System.out.println("WT Three = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTFour) {
                System.out.println("WT Four = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTFive) {
                System.out.println("WT Five = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTSix) {
                System.out.println("WT Six = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTSeven) {
                System.out.println("WT Seven = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTEight) {
                System.out.println("WT Eight = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTNine) {
                System.out.println("WT Nine = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTTen) {
                System.out.println("WT Ten = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTEleven) {
                System.out.println("WT Eleven = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTTwelve) {
                System.out.println("WT Twelve = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTThirteen) {
                System.out.println("WT Thirteen = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTFourteen) {
                System.out.println("WT Fourteen = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTFifteen) {
                System.out.println("WT Fifteen = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTSixteen) {
                System.out.println("WT Sixteen = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTSeventeen) {
                System.out.println("WT Seventeen = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTEighteen) {
                System.out.println("WT Eighteen = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTNineteen) {
                System.out.println("WT Nineteen = " + entry);
            }

            if (entry.getValue() == pointDifferenceWTTwenty) {
                System.out.println("WT Twenty = " + entry);
            }
        }
    }

}
