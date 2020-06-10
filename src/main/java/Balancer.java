import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Balancer {
    public static void main(String[] args) {

        BiHashMap<String, Integer, Integer> pointTableMap = PointTableBuilder.buildPointTableMap();

        int hq = 319;
        int barracks = 1272;
        int stables = 639;
        int academy = 512;
        int smithy = 607;
        int statue = 24;
        int market = 460;
        int timber = 1187;
        int clay = 1187;
        int iron = 1187;
        int farm = 989;
        int warehouse = 1187;
        int wall = 256;
        int staticPointTotal = hq + barracks + stables + academy + smithy + statue + market + timber + clay + iron + farm + warehouse + wall;
        int staticPointTotalChurchOne = staticPointTotal + 10;
        int staticPointTotalChurchTwo = staticPointTotal + 12;
        int staticPointTotalChurchThree = staticPointTotal + 14;
        int targetPointTotal = 9874;
        int pointDifferenceNoChurch = targetPointTotal - staticPointTotal;
        int pointDifferenceChurchOne = targetPointTotal - staticPointTotalChurchOne;
        int pointDifferenceChurchTwo = targetPointTotal - staticPointTotalChurchTwo;
        int pointDifferenceChurchThree = targetPointTotal - staticPointTotalChurchThree;

        String inputWorkshop = "Workshop";
        String inputHidingPlace = "Hiding Place";
        boolean churchZeroBalanced = false;
        boolean churchOneBalanced = false;
        boolean churchTwoBalanced = false;
        boolean churchThreeBalanced = false;

        Map<String, Integer> permutationsMap = new LinkedHashMap<>();

        for (int i = 1; i <= pointTableMap.get(inputWorkshop).size(); i++) {
            for (int j = 1; j <= pointTableMap.get(inputHidingPlace).size(); j++) {
                Integer workshopPoints = pointTableMap.get(inputWorkshop, i);
                Integer hidingPlacePoints = pointTableMap.get(inputHidingPlace, j);

                permutationsMap.put("Workshop Level = " + i + " Hiding Place Level = " + j, workshopPoints + hidingPlacePoints);
            }
        }

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
            }
            else {
                inputBuildInfoMap.put(key, -1);
            }
        }

        return inputBuildInfoMap;
    }
}
