package util;

public class KeyBuildingPointTableBuilder {

    private static BiHashMap<String, Integer, Integer> pointTableMap;

    public static BiHashMap<String, Integer, Integer> buildPointTableMap() {
        pointTableMap = new BiHashMap<>();

        addWatchtowerPoints();
        addChurchPoints();

        return pointTableMap;
    }

    private static void addWatchtowerPoints() {
        pointTableMap.put("Watchtower", 1, 42);
        pointTableMap.put("Watchtower", 2, 50);
        pointTableMap.put("Watchtower", 3, 60);
        pointTableMap.put("Watchtower", 4, 73);
        pointTableMap.put("Watchtower", 5, 87);
        pointTableMap.put("Watchtower", 6, 105);
        pointTableMap.put("Watchtower", 7, 125);
        pointTableMap.put("Watchtower", 8, 150);
        pointTableMap.put("Watchtower", 9, 181);
        pointTableMap.put("Watchtower", 10, 217);
        pointTableMap.put("Watchtower", 11, 260);
        pointTableMap.put("Watchtower", 12, 312);
        pointTableMap.put("Watchtower", 13, 374);
        pointTableMap.put("Watchtower", 14, 449);
        pointTableMap.put("Watchtower", 15, 539);
        pointTableMap.put("Watchtower", 16, 647);
        pointTableMap.put("Watchtower", 17, 777);
        pointTableMap.put("Watchtower", 18, 932);
        pointTableMap.put("Watchtower", 19, 1118);
        pointTableMap.put("Watchtower", 20, 1342);
    }

    private static void addChurchPoints() {
        pointTableMap.put("Church", 1, 10);
        pointTableMap.put("Church", 2, 12);
        pointTableMap.put("Church", 3, 12);
    }
}
