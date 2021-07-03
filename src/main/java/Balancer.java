import input.InputReader;
import output.GenerateOutput;
import services.PermutationsMapComputator;
import util.BiHashMap;
import util.Mode;
import util.PointTableBuilder;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Balancer {

    private static final BiHashMap<String, Integer, Integer> pointTableMap = PointTableBuilder.buildPointTableMap();

    public static void main(String[] args) {
        //Obtain User Input
        Map<String, Integer> userInputMap = InputReader.getUserBuildingInput(pointTableMap);
        int targetPointTotal = InputReader.getTargetPoints();
        int staticPointTotal = InputReader.getStaticPointTotal(pointTableMap, userInputMap);
        List<String> flexibleBuildingsList = InputReader.getFlexibleBuildingsList(userInputMap);
        Mode mode = InputReader.getMode();

        //Compute permutations map
        Map<String, Integer> resultMap = PermutationsMapComputator.createPermutationsMap(new LinkedHashMap<>(), flexibleBuildingsList, 0);

        //Generate output
        GenerateOutput.generateOutput(targetPointTotal, staticPointTotal, mode, resultMap);
    }
}
