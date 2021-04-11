import java.util.*;

public class Balancer {

    private static Map<String, Integer> resultMap = new LinkedHashMap<>();

    public static void main(String[] args) {

        BiHashMap<String, Integer, Integer> pointTableMap = PointTableBuilder.buildPointTableMap();
        Map<String, Integer> userInputMap = getUserBuildingInput(pointTableMap);
        List<String> flexibleBuildingsList = new LinkedList<>();
        int staticPointTotal = 0;
        int targetPointTotal = getTargetPoints();

        for (Map.Entry<String, Integer> entry : userInputMap.entrySet()) {
            if (entry.getValue() == -1) {
                flexibleBuildingsList.add(entry.getKey());
            } else {
                int buildingLevel = entry.getValue();
                int buildingPoints = pointTableMap.get(entry.getKey(), buildingLevel);

                staticPointTotal += buildingPoints;
            }
        }

        computeResult(new LinkedHashMap<>(), flexibleBuildingsList, 0);
//        iterateOverPermutationsChurch(resultMap, staticPointTotal, targetPointTotal);
        iterateOverPermutationsWatchTower(resultMap, staticPointTotal, targetPointTotal);
    }

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

    private static Map<String, Integer> getUserBuildingInput(BiHashMap<String, Integer, Integer> pointTableMap) {
        Map<String, Integer> inputBuildInfoMap = new LinkedHashMap<>();

        for (String key : pointTableMap.getKeyList()) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Are " + key + " Levels Flexible? Y/N");
            String buildingFlex = scanner.nextLine();

            if (buildingFlex.equals("N") || buildingFlex.equals("n")) {
                System.out.println("Enter " + key + " Level");
                int buildingLevel = scanner.nextInt();
                System.out.println(key + " Level = " + buildingLevel);
                inputBuildInfoMap.put(key, buildingLevel);
            } else {
                inputBuildInfoMap.put(key, -1);
            }
        }

        return inputBuildInfoMap;
    }

    private static int getTargetPoints() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the target point value for the village?");

        return scanner.nextInt();
    }

    private static void computeResult(Map<String, Integer> oldMap, List<String> flexibleBuildingsList, int flexibleBuildingListIndex) {
        Map<String, Integer> newMap = new LinkedHashMap<>(oldMap);
        BiHashMap<String, Integer, Integer> pointTableMap = PointTableBuilder.buildPointTableMap();

        if (flexibleBuildingListIndex <= (flexibleBuildingsList.size() - 1)) {
            String currentBuilding = flexibleBuildingsList.get(flexibleBuildingListIndex);

            for (int i = 0; i <= pointTableMap.get(currentBuilding).size() - 1; i++) {
                Integer buildingPoints = pointTableMap.get(currentBuilding, i);
                newMap.put(currentBuilding + " Level = " + i, buildingPoints);

                if (!oldMap.isEmpty()) {
                    for (Map.Entry<String, Integer> entry : oldMap.entrySet()) {
                        String entryKey = entry.getKey();
                        Integer entryValue = entry.getValue();

                        if (!entryKey.contains(currentBuilding)) {
                            newMap.put(entryKey + " " + currentBuilding + " Level = " + i, entryValue + buildingPoints);
                        }
                    }
                }
            }
            computeResult(newMap, flexibleBuildingsList, ++flexibleBuildingListIndex);
        }
        else if (flexibleBuildingListIndex == (flexibleBuildingsList.size())){
            resultMap = newMap;
        }
    }
}
