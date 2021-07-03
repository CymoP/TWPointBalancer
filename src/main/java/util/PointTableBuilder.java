package util;

public class PointTableBuilder {

    private static BiHashMap<String, Integer, Integer> pointTableMap;

    private PointTableBuilder() {
    }

    public static BiHashMap<String, Integer, Integer> buildPointTableMap() {
        pointTableMap = new BiHashMap<>();

        addHeadquartersPoints();
        addBarracksPoints();
        addStablesPoints();
        addWorkshopPoints();
        addAcademyPoints();
        addSmithyPoints();
        addStatuePoints();
        addMarketPoints();
        addTimberPoints();
        addClayPoints();
        addIronPoints();
        addFarmPoints();
        addWarehousePoints();
        addHidingPlacePoints();
        addWallPoints();

        return pointTableMap;
    }

    private static void addHeadquartersPoints() {
        pointTableMap.put("Headquarters", 0, 0);
        pointTableMap.put("Headquarters", 1, 10);
        pointTableMap.put("Headquarters", 2, 12);
        pointTableMap.put("Headquarters", 3, 14);
        pointTableMap.put("Headquarters", 4, 17);
        pointTableMap.put("Headquarters", 5, 21);
        pointTableMap.put("Headquarters", 6, 25);
        pointTableMap.put("Headquarters", 7, 30);
        pointTableMap.put("Headquarters", 8, 36);
        pointTableMap.put("Headquarters", 9, 43);
        pointTableMap.put("Headquarters", 10, 52);
        pointTableMap.put("Headquarters", 11, 62);
        pointTableMap.put("Headquarters", 12, 74);
        pointTableMap.put("Headquarters", 13, 89);
        pointTableMap.put("Headquarters", 14, 107);
        pointTableMap.put("Headquarters", 15, 128);
        pointTableMap.put("Headquarters", 16, 154);
        pointTableMap.put("Headquarters", 17, 185);
        pointTableMap.put("Headquarters", 18, 222);
        pointTableMap.put("Headquarters", 19, 266);
        pointTableMap.put("Headquarters", 20, 319);
        pointTableMap.put("Headquarters", 21, 383);
        pointTableMap.put("Headquarters", 22, 460);
        pointTableMap.put("Headquarters", 23, 552);
        pointTableMap.put("Headquarters", 24, 662);
        pointTableMap.put("Headquarters", 25, 795);
        pointTableMap.put("Headquarters", 26, 954);
        pointTableMap.put("Headquarters", 27, 1145);
        pointTableMap.put("Headquarters", 28, 1374);
        pointTableMap.put("Headquarters", 29, 1648);
        pointTableMap.put("Headquarters", 30, 1978);
    }

    private static void addBarracksPoints() {
        pointTableMap.put("Barracks", 0, 0);
        pointTableMap.put("Barracks", 1, 16);
        pointTableMap.put("Barracks", 2, 19);
        pointTableMap.put("Barracks", 3, 23);
        pointTableMap.put("Barracks", 4, 28);
        pointTableMap.put("Barracks", 5, 33);
        pointTableMap.put("Barracks", 6, 40);
        pointTableMap.put("Barracks", 7, 48);
        pointTableMap.put("Barracks", 8, 57);
        pointTableMap.put("Barracks", 9, 69);
        pointTableMap.put("Barracks", 10, 83);
        pointTableMap.put("Barracks", 11, 99);
        pointTableMap.put("Barracks", 12, 119);
        pointTableMap.put("Barracks", 13, 143);
        pointTableMap.put("Barracks", 14, 171);
        pointTableMap.put("Barracks", 15, 205);
        pointTableMap.put("Barracks", 16, 247);
        pointTableMap.put("Barracks", 17, 296);
        pointTableMap.put("Barracks", 18, 355);
        pointTableMap.put("Barracks", 19, 426);
        pointTableMap.put("Barracks", 20, 511);
        pointTableMap.put("Barracks", 21, 613);
        pointTableMap.put("Barracks", 22, 736);
        pointTableMap.put("Barracks", 23, 883);
        pointTableMap.put("Barracks", 24, 1060);
        pointTableMap.put("Barracks", 25, 1272);
    }

    private static void addStablesPoints() {
        pointTableMap.put("Stables", 0, 0);
        pointTableMap.put("Stables", 1, 20);
        pointTableMap.put("Stables", 2, 24);
        pointTableMap.put("Stables", 3, 29);
        pointTableMap.put("Stables", 4, 35);
        pointTableMap.put("Stables", 5, 41);
        pointTableMap.put("Stables", 6, 50);
        pointTableMap.put("Stables", 7, 60);
        pointTableMap.put("Stables", 8, 72);
        pointTableMap.put("Stables", 9, 86);
        pointTableMap.put("Stables", 10, 103);
        pointTableMap.put("Stables", 11, 124);
        pointTableMap.put("Stables", 12, 149);
        pointTableMap.put("Stables", 13, 178);
        pointTableMap.put("Stables", 14, 214);
        pointTableMap.put("Stables", 15, 257);
        pointTableMap.put("Stables", 16, 308);
        pointTableMap.put("Stables", 17, 370);
        pointTableMap.put("Stables", 18, 444);
        pointTableMap.put("Stables", 19, 532);
        pointTableMap.put("Stables", 20, 639);
    }

    private static void addWorkshopPoints() {
        pointTableMap.put("Workshop", 0, 0);
        pointTableMap.put("Workshop", 1, 24);
        pointTableMap.put("Workshop", 2, 29);
        pointTableMap.put("Workshop", 3, 35);
        pointTableMap.put("Workshop", 4, 41);
        pointTableMap.put("Workshop", 5, 50);
        pointTableMap.put("Workshop", 6, 60);
        pointTableMap.put("Workshop", 7, 72);
        pointTableMap.put("Workshop", 8, 86);
        pointTableMap.put("Workshop", 9, 103);
        pointTableMap.put("Workshop", 10, 124);
        pointTableMap.put("Workshop", 11, 149);
        pointTableMap.put("Workshop", 12, 178);
        pointTableMap.put("Workshop", 13, 214);
        pointTableMap.put("Workshop", 14, 257);
        pointTableMap.put("Workshop", 15, 308);
    }

    private static void addAcademyPoints() {
        pointTableMap.put("Academy", 0, 0);
        pointTableMap.put("Academy", 1, 512);
    }

    private static void addSmithyPoints() {
        pointTableMap.put("Smithy", 0, 0);
        pointTableMap.put("Smithy", 1, 19);
        pointTableMap.put("Smithy", 2, 23);
        pointTableMap.put("Smithy", 3, 27);
        pointTableMap.put("Smithy", 4, 33);
        pointTableMap.put("Smithy", 5, 39);
        pointTableMap.put("Smithy", 6, 47);
        pointTableMap.put("Smithy", 7, 57);
        pointTableMap.put("Smithy", 8, 68);
        pointTableMap.put("Smithy", 9, 82);
        pointTableMap.put("Smithy", 10, 98);
        pointTableMap.put("Smithy", 11, 118);
        pointTableMap.put("Smithy", 12, 141);
        pointTableMap.put("Smithy", 13, 169);
        pointTableMap.put("Smithy", 14, 203);
        pointTableMap.put("Smithy", 15, 244);
        pointTableMap.put("Smithy", 16, 293);
        pointTableMap.put("Smithy", 17, 351);
        pointTableMap.put("Smithy", 18, 422);
        pointTableMap.put("Smithy", 19, 506);
        pointTableMap.put("Smithy", 20, 607);
    }

    private static void addStatuePoints() {
        pointTableMap.put("Statue", 0, 0);
        pointTableMap.put("Statue", 1, 24);
    }

    private static void addMarketPoints() {
        pointTableMap.put("Market", 0, 0);
        pointTableMap.put("Market", 1, 10);
        pointTableMap.put("Market", 2, 12);
        pointTableMap.put("Market", 3, 14);
        pointTableMap.put("Market", 4, 17);
        pointTableMap.put("Market", 5, 21);
        pointTableMap.put("Market", 6, 25);
        pointTableMap.put("Market", 7, 30);
        pointTableMap.put("Market", 8, 36);
        pointTableMap.put("Market", 9, 43);
        pointTableMap.put("Market", 10, 52);
        pointTableMap.put("Market", 11, 62);
        pointTableMap.put("Market", 12, 74);
        pointTableMap.put("Market", 13, 89);
        pointTableMap.put("Market", 14, 107);
        pointTableMap.put("Market", 15, 128);
        pointTableMap.put("Market", 16, 154);
        pointTableMap.put("Market", 17, 185);
        pointTableMap.put("Market", 18, 222);
        pointTableMap.put("Market", 19, 266);
        pointTableMap.put("Market", 20, 319);
        pointTableMap.put("Market", 21, 383);
        pointTableMap.put("Market", 22, 460);
        pointTableMap.put("Market", 23, 552);
        pointTableMap.put("Market", 24, 662);
        pointTableMap.put("Market", 25, 795);
    }

    private static void addTimberPoints() {
        pointTableMap.put("Timber", 0, 0);
        pointTableMap.put("Timber", 1, 6);
        pointTableMap.put("Timber", 2, 7);
        pointTableMap.put("Timber", 3, 9);
        pointTableMap.put("Timber", 4, 10);
        pointTableMap.put("Timber", 5, 12);
        pointTableMap.put("Timber", 6, 15);
        pointTableMap.put("Timber", 7, 18);
        pointTableMap.put("Timber", 8, 21);
        pointTableMap.put("Timber", 9, 26);
        pointTableMap.put("Timber", 10, 31);
        pointTableMap.put("Timber", 11, 37);
        pointTableMap.put("Timber", 12, 45);
        pointTableMap.put("Timber", 13, 53);
        pointTableMap.put("Timber", 14, 64);
        pointTableMap.put("Timber", 15, 77);
        pointTableMap.put("Timber", 16, 92);
        pointTableMap.put("Timber", 17, 111);
        pointTableMap.put("Timber", 18, 133);
        pointTableMap.put("Timber", 19, 160);
        pointTableMap.put("Timber", 20, 192);
        pointTableMap.put("Timber", 21, 230);
        pointTableMap.put("Timber", 22, 276);
        pointTableMap.put("Timber", 23, 331);
        pointTableMap.put("Timber", 24, 397);
        pointTableMap.put("Timber", 25, 477);
        pointTableMap.put("Timber", 26, 572);
        pointTableMap.put("Timber", 27, 687);
        pointTableMap.put("Timber", 28, 824);
        pointTableMap.put("Timber", 29, 989);
        pointTableMap.put("Timber", 30, 1187);
    }

    private static void addClayPoints() {
        pointTableMap.put("Clay", 0, 0);
        pointTableMap.put("Clay", 1, 6);
        pointTableMap.put("Clay", 2, 7);
        pointTableMap.put("Clay", 3, 9);
        pointTableMap.put("Clay", 4, 10);
        pointTableMap.put("Clay", 5, 12);
        pointTableMap.put("Clay", 6, 15);
        pointTableMap.put("Clay", 7, 18);
        pointTableMap.put("Clay", 8, 21);
        pointTableMap.put("Clay", 9, 26);
        pointTableMap.put("Clay", 10, 31);
        pointTableMap.put("Clay", 11, 37);
        pointTableMap.put("Clay", 12, 45);
        pointTableMap.put("Clay", 13, 53);
        pointTableMap.put("Clay", 14, 64);
        pointTableMap.put("Clay", 15, 77);
        pointTableMap.put("Clay", 16, 92);
        pointTableMap.put("Clay", 17, 111);
        pointTableMap.put("Clay", 18, 133);
        pointTableMap.put("Clay", 19, 160);
        pointTableMap.put("Clay", 20, 192);
        pointTableMap.put("Clay", 21, 230);
        pointTableMap.put("Clay", 22, 276);
        pointTableMap.put("Clay", 23, 331);
        pointTableMap.put("Clay", 24, 397);
        pointTableMap.put("Clay", 25, 477);
        pointTableMap.put("Clay", 26, 572);
        pointTableMap.put("Clay", 27, 687);
        pointTableMap.put("Clay", 28, 824);
        pointTableMap.put("Clay", 29, 989);
        pointTableMap.put("Clay", 30, 1187);
    }

    private static void addIronPoints() {
        pointTableMap.put("Iron", 0, 0);
        pointTableMap.put("Iron", 1, 6);
        pointTableMap.put("Iron", 2, 7);
        pointTableMap.put("Iron", 3, 9);
        pointTableMap.put("Iron", 4, 10);
        pointTableMap.put("Iron", 5, 12);
        pointTableMap.put("Iron", 6, 15);
        pointTableMap.put("Iron", 7, 18);
        pointTableMap.put("Iron", 8, 21);
        pointTableMap.put("Iron", 9, 26);
        pointTableMap.put("Iron", 10, 31);
        pointTableMap.put("Iron", 11, 37);
        pointTableMap.put("Iron", 12, 45);
        pointTableMap.put("Iron", 13, 53);
        pointTableMap.put("Iron", 14, 64);
        pointTableMap.put("Iron", 15, 77);
        pointTableMap.put("Iron", 16, 92);
        pointTableMap.put("Iron", 17, 111);
        pointTableMap.put("Iron", 18, 133);
        pointTableMap.put("Iron", 19, 160);
        pointTableMap.put("Iron", 20, 192);
        pointTableMap.put("Iron", 21, 230);
        pointTableMap.put("Iron", 22, 276);
        pointTableMap.put("Iron", 23, 331);
        pointTableMap.put("Iron", 24, 397);
        pointTableMap.put("Iron", 25, 477);
        pointTableMap.put("Iron", 26, 572);
        pointTableMap.put("Iron", 27, 687);
        pointTableMap.put("Iron", 28, 824);
        pointTableMap.put("Iron", 29, 989);
        pointTableMap.put("Iron", 30, 1187);
    }

    private static void addFarmPoints() {
        pointTableMap.put("Farm", 0, 0);
        pointTableMap.put("Farm", 1, 5);
        pointTableMap.put("Farm", 2, 6);
        pointTableMap.put("Farm", 3, 7);
        pointTableMap.put("Farm", 4, 9);
        pointTableMap.put("Farm", 5, 10);
        pointTableMap.put("Farm", 6, 12);
        pointTableMap.put("Farm", 7, 15);
        pointTableMap.put("Farm", 8, 18);
        pointTableMap.put("Farm", 9, 21);
        pointTableMap.put("Farm", 10, 26);
        pointTableMap.put("Farm", 11, 31);
        pointTableMap.put("Farm", 12, 37);
        pointTableMap.put("Farm", 13, 45);
        pointTableMap.put("Farm", 14, 53);
        pointTableMap.put("Farm", 15, 64);
        pointTableMap.put("Farm", 16, 77);
        pointTableMap.put("Farm", 17, 92);
        pointTableMap.put("Farm", 18, 111);
        pointTableMap.put("Farm", 19, 133);
        pointTableMap.put("Farm", 20, 160);
        pointTableMap.put("Farm", 21, 192);
        pointTableMap.put("Farm", 22, 230);
        pointTableMap.put("Farm", 23, 276);
        pointTableMap.put("Farm", 24, 331);
        pointTableMap.put("Farm", 25, 397);
        pointTableMap.put("Farm", 26, 477);
        pointTableMap.put("Farm", 27, 572);
        pointTableMap.put("Farm", 28, 687);
        pointTableMap.put("Farm", 29, 824);
        pointTableMap.put("Farm", 30, 989);
    }

    private static void addWarehousePoints() {
        pointTableMap.put("Warehouse", 0, 0);
        pointTableMap.put("Warehouse", 1, 6);
        pointTableMap.put("Warehouse", 2, 7);
        pointTableMap.put("Warehouse", 3, 9);
        pointTableMap.put("Warehouse", 4, 10);
        pointTableMap.put("Warehouse", 5, 12);
        pointTableMap.put("Warehouse", 6, 15);
        pointTableMap.put("Warehouse", 7, 18);
        pointTableMap.put("Warehouse", 8, 21);
        pointTableMap.put("Warehouse", 9, 26);
        pointTableMap.put("Warehouse", 10, 31);
        pointTableMap.put("Warehouse", 11, 37);
        pointTableMap.put("Warehouse", 12, 45);
        pointTableMap.put("Warehouse", 13, 53);
        pointTableMap.put("Warehouse", 14, 64);
        pointTableMap.put("Warehouse", 15, 77);
        pointTableMap.put("Warehouse", 16, 92);
        pointTableMap.put("Warehouse", 17, 111);
        pointTableMap.put("Warehouse", 18, 133);
        pointTableMap.put("Warehouse", 19, 160);
        pointTableMap.put("Warehouse", 20, 192);
        pointTableMap.put("Warehouse", 21, 230);
        pointTableMap.put("Warehouse", 22, 276);
        pointTableMap.put("Warehouse", 23, 331);
        pointTableMap.put("Warehouse", 24, 397);
        pointTableMap.put("Warehouse", 25, 477);
        pointTableMap.put("Warehouse", 26, 572);
        pointTableMap.put("Warehouse", 27, 687);
        pointTableMap.put("Warehouse", 28, 824);
        pointTableMap.put("Warehouse", 29, 989);
        pointTableMap.put("Warehouse", 30, 1187);
    }

    private static void addHidingPlacePoints() {
        pointTableMap.put("Hiding Place", 0, 0);
        pointTableMap.put("Hiding Place", 1, 5);
        pointTableMap.put("Hiding Place", 2, 6);
        pointTableMap.put("Hiding Place", 3, 7);
        pointTableMap.put("Hiding Place", 4, 9);
        pointTableMap.put("Hiding Place", 5, 10);
        pointTableMap.put("Hiding Place", 6, 12);
        pointTableMap.put("Hiding Place", 7, 15);
        pointTableMap.put("Hiding Place", 8, 18);
        pointTableMap.put("Hiding Place", 9, 21);
        pointTableMap.put("Hiding Place", 10, 26);
    }

    private static void addWallPoints() {
        pointTableMap.put("Wall", 0, 0);
        pointTableMap.put("Wall", 1, 8);
        pointTableMap.put("Wall", 2, 10);
        pointTableMap.put("Wall", 3, 12);
        pointTableMap.put("Wall", 4, 14);
        pointTableMap.put("Wall", 5, 17);
        pointTableMap.put("Wall", 6, 20);
        pointTableMap.put("Wall", 7, 24);
        pointTableMap.put("Wall", 8, 29);
        pointTableMap.put("Wall", 9, 34);
        pointTableMap.put("Wall", 10, 41);
        pointTableMap.put("Wall", 11, 50);
        pointTableMap.put("Wall", 12, 59);
        pointTableMap.put("Wall", 13, 71);
        pointTableMap.put("Wall", 14, 86);
        pointTableMap.put("Wall", 15, 103);
        pointTableMap.put("Wall", 16, 123);
        pointTableMap.put("Wall", 17, 148);
        pointTableMap.put("Wall", 18, 177);
        pointTableMap.put("Wall", 19, 213);
        pointTableMap.put("Wall", 20, 256);
    }
}
