import java.util.*;

public class Balancer {
    public static void main(String[] args) {

        BiHashMap<String, Integer, Integer> pointTableMap = PointTableBuilder.buildPointTableMap();
        Map<String, Integer> permutationsMap = new LinkedHashMap<>();
        Map<String, Integer> permutationsMapExtended = new LinkedHashMap<>();
        int targetPointTotal = getTargetPoints();
        Map<String, Integer> userInputMap = getUserBuildingInput(pointTableMap);
        List<String> flexibleBuildingsList = new LinkedList<>();

        boolean multipleBuildings = false;
        int staticPointTotal = 0;

        for (Map.Entry<String, Integer> entry : userInputMap.entrySet()) {
            if (entry.getValue() == -1) {
                flexibleBuildingsList.add(entry.getKey());
            } else {
                int buildingLevel = entry.getValue();
                int buildingPoints = pointTableMap.get(entry.getKey(), buildingLevel);

                staticPointTotal += buildingPoints;
            }
        }

        int staticPointTotalChurchOne = staticPointTotal + 10;
        int staticPointTotalChurchTwo = staticPointTotal + 12;
        int staticPointTotalChurchThree = staticPointTotal + 14;
        int pointDifferenceNoChurch = targetPointTotal - staticPointTotal;
        int pointDifferenceChurchOne = targetPointTotal - staticPointTotalChurchOne;
        int pointDifferenceChurchTwo = targetPointTotal - staticPointTotalChurchTwo;
        int pointDifferenceChurchThree = targetPointTotal - staticPointTotalChurchThree;

        for (String building : flexibleBuildingsList) {
            for (int i = 1; i <= pointTableMap.get(building).size(); i++) {
                Integer buildingPoints = pointTableMap.get(building, i);
                permutationsMap.put(building + " Level = " + i, buildingPoints);

                if (multipleBuildings) {
                    for (Map.Entry<String, Integer> entry : permutationsMap.entrySet()) {
                        String entryKey = entry.getKey();
                        Integer entryValue = entry.getValue();


                        if (!entryKey.contains(building)) {
                            permutationsMapExtended.put(entryKey + " " + building + " Level = " + i, entryValue + buildingPoints);
                        }

                    }
                }
            }

            multipleBuildings = true;
        }

        iterateOverPermutations(permutationsMap, pointDifferenceNoChurch, pointDifferenceChurchOne, pointDifferenceChurchTwo, pointDifferenceChurchThree);
        iterateOverPermutations(permutationsMapExtended, pointDifferenceNoChurch, pointDifferenceChurchOne, pointDifferenceChurchTwo, pointDifferenceChurchThree);
    }

    private static void iterateOverPermutations(Map<String, Integer> permutationsMap, int pointDifferenceNoChurch, int pointDifferenceChurchOne, int pointDifferenceChurchTwo, int pointDifferenceChurchThree) {
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
        int targetPointTotal = scanner.nextInt();

        return targetPointTotal;
    }
}
