package output;

import util.BiHashMap;
import util.KeyBuildingPointTableBuilder;
import util.Mode;

import java.util.Map;
import java.util.Objects;

public class GenerateOutput {

    private static final BiHashMap<String, Integer, Integer> pointTableMap = KeyBuildingPointTableBuilder.buildPointTableMap();

    private GenerateOutput() {
    }

    public static void generateOutput(int targetPointTotal, int staticPointTotal, Mode mode, Map<String, Integer> resultMap) {
        if (resultMap != null && !resultMap.isEmpty()) {
            if (Objects.requireNonNull(mode).equals(Mode.CHURCH)) {
                GenerateOutput.iterateOverPermutationsChurch(resultMap, staticPointTotal, targetPointTotal);
            } else if (Objects.requireNonNull(mode).equals(Mode.WATCHTOWER)) {
                GenerateOutput.iterateOverPermutationsWatchtower(resultMap, staticPointTotal, targetPointTotal);
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
        Map<Integer, Integer> churchPointMap = pointTableMap.get("Church");

        for (Map.Entry<Integer, Integer> church : churchPointMap.entrySet()) {
            for (Map.Entry<String, Integer> entry : permutationsMap.entrySet()) {
                int pointDifference = targetPointTotal - (staticPointTotal + church.getValue());
                if (entry.getValue() == pointDifference) {
                    System.out.println("Church " + church.getValue() + " = " + entry);
                }
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
    private static void iterateOverPermutationsWatchtower(Map<String, Integer> permutationsMap, int staticPointTotal, int targetPointTotal) {
        Map<Integer, Integer> watchtowerPointMap = pointTableMap.get("Watchtower");

        for (Map.Entry<Integer, Integer> watchtower : watchtowerPointMap.entrySet()) {
            for (Map.Entry<String, Integer> entry : permutationsMap.entrySet()) {
                int pointDifference = targetPointTotal - (staticPointTotal + watchtower.getValue());
                if (entry.getValue() == pointDifference) {
                    System.out.println("Watchtower " + watchtower.getKey() + " = " + entry);
                }
            }
        }
    }
}
