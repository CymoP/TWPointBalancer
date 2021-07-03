package input;

import util.BiHashMap;
import util.Mode;

import java.util.*;

public class InputReader {

    /**
     * Gathers the user input from the command line for balancing the village.
     *
     * @param pointTableMap Building point table map
     * @return The user input.
     */
    public static Map<String, Integer> getUserBuildingInput(BiHashMap<String, Integer, Integer> pointTableMap) {
        Map<String, Integer> inputBuildInfoMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (String key : pointTableMap.getKeyList()) {
            System.out.println("Are " + key + " Levels Flexible? Y/N");
            String buildingFlex = scanner.nextLine();

            if (buildingFlex.equalsIgnoreCase("N")) {
                System.out.println("Enter " + key + " Level");
                int buildingLevel = scanner.nextInt();
                scanner.nextLine();
                System.out.println(key + " Level = " + buildingLevel);
                inputBuildInfoMap.put(key, buildingLevel);
            } else {
                inputBuildInfoMap.put(key, -1);
            }
        }
        return inputBuildInfoMap;
    }

    /**
     * Returns the static point table as per user input.
     *
     * @param pointTableMap Building point table map
     * @param userInputMap  User input map
     * @return Static point total
     */
    public static int getStaticPointTotal(BiHashMap<String, Integer, Integer> pointTableMap, Map<String, Integer> userInputMap) {
        int staticPointTotal = 0;

        for (Map.Entry<String, Integer> entry : userInputMap.entrySet()) {
            if (entry.getValue() != -1) {
                int buildingLevel = entry.getValue();
                int buildingPoints = pointTableMap.get(entry.getKey(), buildingLevel);

                staticPointTotal += buildingPoints;
            }
        }
        return staticPointTotal;
    }

    /**
     * Returns the list of flexible buildings as per user input.
     *
     * @param userInputMap Map of user inputs
     * @return list of flexible buildings
     */
    public static List<String> getFlexibleBuildingsList(Map<String, Integer> userInputMap) {
        List<String> flexibleBuildingsList = new LinkedList<>();

        for (Map.Entry<String, Integer> entry : userInputMap.entrySet()) {
            if (entry.getValue() == -1) {
                flexibleBuildingsList.add(entry.getKey());
            }
        }
        return flexibleBuildingsList;
    }

    /**
     * Gets the target points for the complete village.
     *
     * @return The target points for the complete village
     */
    public static int getTargetPoints() {
        int targetPoints;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the target point value for the village?");

        targetPoints = scanner.nextInt();
        return targetPoints;
    }

    /**
     * Returns the mode for the given cycle.
     *
     * @return The mode for the given cycle
     */
    public static Mode getMode() {
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which mode would you like? Church/Watchtower?");

        input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "CHURCH":
            case "C":
                return Mode.CHURCH;
            case "WATCHTOWER":
            case "WT":
                return Mode.WATCHTOWER;
            default:
                return null;
        }
    }
}
