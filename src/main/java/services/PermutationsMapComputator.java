package services;

import util.BiHashMap;
import util.PointTableBuilder;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PermutationsMapComputator {

    private static Map<String, Integer> permutationsMap;

    /**
     * Recursive method to compute the permutations map for the given user input.
     *
     * @param oldMap                    Previous Permutations Map
     * @param flexibleBuildingsList     List of flexible buildings as per user input
     * @param flexibleBuildingListIndex Index of the current building to be parsed
     */
    public static void computeResult(Map<String, Integer> oldMap, List<String> flexibleBuildingsList, int flexibleBuildingListIndex) {
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
        } else if (flexibleBuildingListIndex == (flexibleBuildingsList.size())) {
            permutationsMap = newMap;
        }
    }

    public static Map<String, Integer> getPermutationsMap(){
        return permutationsMap;
    }
}
