package apprendreJava.universe;

public class UniverseConquest {

    public static void main(String... args){

        // Programmation Orientée Objet
        // Création d'objets

        TerrestrialPlanet mercury = new TerrestrialPlanet("Mercury");
        mercury.diameterKm = 4880L;

        TerrestrialPlanet venus = new TerrestrialPlanet("Venus");
        venus.diameterKm = 12104L;

        TerrestrialPlanet earth = new TerrestrialPlanet("Earth");
        earth.diameterKm = 12742L;

        TerrestrialPlanet mars = new TerrestrialPlanet("Mars");
        mars.diameterKm = 6779L;

        GasGiant jupiter = new GasGiant("Jupiter");
        jupiter.diameterKm = 139820L;

        GasGiant saturn = new GasGiant("Saturn");
        saturn.diameterKm = 116460L;

        IceGiant uranus = new IceGiant("Uranus");
        uranus.diameterKm = 50724L;

        IceGiant neptune = new IceGiant("Neptune");
        neptune.diameterKm = 49244L;

        System.out.println("\n" + jupiter.name + " is a planet with a diameter of " + jupiter.diameterKm + " kilometers.\n");

        /*

        Planet x = new Planet();

        System.out.println(x.name + " is a "+x.material+" Planet with a diameter of "+x.diameterKm+" kilometers.\n");

         */



        // Using instance methods

        int revolutionCount = neptune.revolution(-3542);
        System.out.println(neptune.name + " completed " + revolutionCount + " revolutions around its star.\n");

        int rotationCount = mars.rotation(-684);
        System.out.println(mars.name + " completed " + rotationCount + " rotations on its axis.\n");

        rotationCount = venus.rotation(1250);
        System.out.println(venus.name + " completed " + rotationCount + " rotations on its axis.\n");

        /*

        mars.dockStarShip(8);
        mars.dockStarShip("Frigate");

         */

        System.out.println("The number of humans who have stayed on " + mars.name +
                " is currently " + mars.totalVisitors);


        // Using an object as a property

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.hydrogenRate = 83f;
        atmosphereUranus.heliumRate = 15f;
        atmosphereUranus.methaneRate = 2.5f;

        uranus.atmosphere = atmosphereUranus;

        System.out.println("\nThe atmosphere of " + uranus.name + " consists of:");
        System.out.println(uranus.atmosphere.hydrogenRate + "% hydrogen");
        System.out.println(uranus.atmosphere.heliumRate + "% helium");
        System.out.println(uranus.atmosphere.methaneRate + "% methane\n");


        // Docking starships

        Starship frigate516 = new Starship();
        frigate516.crewMemberCount = 9;
        frigate516.type = "Frigate";

        Starship outComingStarShip = mars.dockStarShip(frigate516);

        if (outComingStarShip == null) {
            System.out.println("No starship is currently docked.");
        } else {
            System.out.println("A " + outComingStarShip.type + " starship must undock first.");
        }

        Starship cruiser61 = new Starship();
        cruiser61.crewMemberCount = 42;
        cruiser61.type = "Cruiser";

        outComingStarShip = mars.dockStarShip(cruiser61);

        if (outComingStarShip == null) {
            System.out.println("No starship is currently docked.");
        } else {
            System.out.println("A " + outComingStarShip.type + " starship must undock first.");
        }


        // Static properties

        System.out.println("\nThe shape of a planet is " + Planet.shape);
        System.out.println("The shape of " + uranus.name + " is also " + uranus.shape + "\n");


        // Static methods

        String resultMessage = Planet.expansion(10.5);
        System.out.println(resultMessage);

        resultMessage = Planet.expansion(14.5);
        System.out.println(resultMessage);


        // Constructors and static fields

        System.out.println("\nSo far, " + Planet.discoveredCount + " planets have been discovered.\n");


        // Heritage

        WarStarShip cruiser = new WarStarShip();
        cruiser.type = "Cruiser";
        cruiser.armor = 156;
        cruiser.shieldResistanceTime = 2;

        CivilStarShip worldStarShip = new CivilStarShip();
        worldStarShip.type = "World Starship";
        worldStarShip.armor = 4784;
        worldStarShip.shieldResistanceTime = 30;

        cruiser.enableShield();
        worldStarShip.enableShield();

        cruiser.attack(worldStarShip, "photonics lasers", 3);

        worldStarShip.disableShield();

        System.out.println("Shield Resistance of the " + worldStarShip.type + " : " + worldStarShip.shieldResistanceTime);
        System.out.println("Armor Capacity of the " + worldStarShip.type + " : " + worldStarShip.armor + "\n");

        mars.dockStarShip(worldStarShip);
        mars.dockStarShip(cruiser);

    }

}
