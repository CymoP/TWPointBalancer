package services;

import util.BiHashMap;
import util.PointTableBuilder;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PermutationsMapComputator {

    private static Map<String, Integer> permutationsMap;

    /**
     * Creates the permutations map.
     *
     * @param oldMap                    Previous Permutations Map
     * @param flexibleBuildingsList     List of flexible buildings as per user input
     * @param flexibleBuildingListIndex Index of the current building to be parsed
     * @return the permutation map
     */
    public static Map<String, Integer> createPermutationsMap(Map<String, Integer> oldMap, List<String> flexibleBuildingsList, int flexibleBuildingListIndex) {
        computeResult(oldMap, flexibleBuildingsList, flexibleBuildingListIndex);
        return permutationsMap;
    }

    /**
     * Recursive method to compute the permutations map for the given user input.
     *
     * @param oldMap                    Previous Permutations Map
     * @param flexibleBuildingsList     List of flexible buildings as per user input
     * @param flexibleBuildingListIndex Index of the current building to be parsed
     */
    private static void computeResult(Map<String, Integer> oldMap, List<String> flexibleBuildingsList, int flexibleBuildingListIndex) {
        Map<String, Integer> newMap = new LinkedHashMap<>(oldMap);
        BiHashMap<String, Integer, Integer> pointTableMap = PointTableBuilder.buildPointTableMap();

        iterateOverFlexibleBuildingList(oldMap, flexibleBuildingsList, flexibleBuildingListIndex, newMap, pointTableMap);
    }

    private static void iterateOverFlexibleBuildingList(Map<String, Integer> oldMap, List<String> flexibleBuildingsList, int flexibleBuildingListIndex, Map<String, Integer> newMap, BiHashMap<String, Integer, Integer> pointTableMap) {
        if (checkFlexibleBuildingsAvailable(flexibleBuildingsList, flexibleBuildingListIndex)) {
            String currentBuilding = flexibleBuildingsList.get(flexibleBuildingListIndex);

            for (int level = 0; level <= pointTableMap.get(currentBuilding).size() - 1; level++) {
                Integer buildingPoints = pointTableMap.get(currentBuilding, level);
                newMap.put(currentBuilding + " Level = " + level, buildingPoints);

                parseOldMapWithCurrentBuilding(oldMap, newMap, currentBuilding, level, buildingPoints);
            }
            computeResult(newMap, flexibleBuildingsList, ++flexibleBuildingListIndex);
        } else if (checkFlexibleBuildingsListHasBeenParsed(flexibleBuildingsList, flexibleBuildingListIndex)) {
            permutationsMap = newMap;
        }
    }

    private static boolean checkFlexibleBuildingsListHasBeenParsed(List<String> flexibleBuildingsList, int flexibleBuildingListIndex) {
        return flexibleBuildingListIndex == (flexibleBuildingsList.size());
    }

    private static boolean checkFlexibleBuildingsAvailable(List<String> flexibleBuildingsList, int flexibleBuildingListIndex) {
        return flexibleBuildingListIndex <= (flexibleBuildingsList.size() - 1);
    }

    private static void parseOldMapWithCurrentBuilding(Map<String, Integer> oldMap, Map<String, Integer> newMap, String currentBuilding, int level, Integer buildingPoints) {
        if (!oldMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : oldMap.entrySet()) {
                addNewPermutation(newMap, currentBuilding, level, buildingPoints, entry.getKey(), entry.getValue());
            }
        }
    }

    private static void addNewPermutation(Map<String, Integer> newMap, String currentBuilding, int level, Integer buildingPoints, String entryKey, Integer entryValue) {
        if (!entryKey.contains(currentBuilding)) {
            newMap.put(entryKey + " " + currentBuilding + " Level = " + level, entryValue + buildingPoints);
        }
    }
}
