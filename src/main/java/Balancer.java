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

        int staticPointTotalChurchOne = staticPointTotal + 10;
        int staticPointTotalChurchTwo = staticPointTotal + 12;
        int staticPointTotalChurchThree = staticPointTotal + 14;
        int pointDifferenceNoChurch = targetPointTotal - staticPointTotal;
        int pointDifferenceChurchOne = targetPointTotal - staticPointTotalChurchOne;
        int pointDifferenceChurchTwo = targetPointTotal - staticPointTotalChurchTwo;
        int pointDifferenceChurchThree = targetPointTotal - staticPointTotalChurchThree;

        computeResult(new LinkedHashMap<>(), flexibleBuildingsList, 0);
        iterateOverPermutations(resultMap, pointDifferenceNoChurch, pointDifferenceChurchOne, pointDifferenceChurchTwo, pointDifferenceChurchThree);
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
