package com.spacex.discover;

import com.spacex.discover.astro.*;
import com.spacex.discover.starships.CivilStarShip;
import com.spacex.discover.starships.Starship;
import com.spacex.discover.starships.StarshipType;
import com.spacex.discover.starships.WarStarShip;

import java.util.Scanner;

public class UniverseConquest {

    public static void main(String... args) {

        // Programmation Orientée Objet
        // Création d'objets

        StellarSystem solarSystem = new StellarSystem("Solar System");

        TerrestrialPlanet mercury = new TerrestrialPlanet("Mercury", 5);
        mercury.diameterKm = 4880L;
        solarSystem.planets.add(mercury);
        mercury.distanceFromStar = 57.9f;

        TerrestrialPlanet venus = new TerrestrialPlanet("Venus", 12);
        venus.diameterKm = 12104L;
        solarSystem.planets.add(venus);
        venus.distanceFromStar = 108.2f;

        TerrestrialPlanet earth = new TerrestrialPlanet("Earth", 22);
        earth.diameterKm = 12742L;
        solarSystem.planets.add(earth);
        earth.distanceFromStar = 149.6f;

        TerrestrialPlanet mars = new TerrestrialPlanet("Mars", 45);
        mars.diameterKm = 6779L;
        solarSystem.planets.add(mars);
        mars.distanceFromStar = 227.9f;

        GasGiant jupiter = new GasGiant("Jupiter");
        jupiter.diameterKm = 139820L;
        solarSystem.planets.add(jupiter);
        jupiter.distanceFromStar = 778.3f;

        GasGiant saturn = new GasGiant("Saturn");
        saturn.diameterKm = 116460L;
        solarSystem.planets.add(saturn);
        saturn.distanceFromStar = 1427.0f;

        IceGiant uranus = new IceGiant("Uranus");
        uranus.diameterKm = 50724L;
        solarSystem.planets.add(uranus);
        uranus.distanceFromStar = 2877.38f;

        IceGiant neptune = new IceGiant("Neptune");
        neptune.diameterKm = 49244L;
        solarSystem.planets.add(neptune);
        neptune.distanceFromStar = 4497.07f;

        for (Planet nextPlanet : solarSystem.planets) {
            System.out.println("The next Planet is : " + nextPlanet.name);
        }

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

        /*
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.hydrogenRate = 83f;
        atmosphereUranus.heliumRate = 15f;
        atmosphereUranus.methaneRate = 2.5f;
        atmosphereUranus.sodiumRate = 0.0f;

        uranus.atmosphere = atmosphereUranus;

        System.out.println("\nThe atmosphere of " + uranus.name + " consists of:");
        if (uranus.atmosphere.hydrogenRate != null) {
            System.out.println(uranus.atmosphere.hydrogenRate + "% hydrogen");
        }
        if (uranus.atmosphere.heliumRate != null) {
            System.out.println(uranus.atmosphere.heliumRate + "% helium");
        }
        if (uranus.atmosphere.methaneRate != null) {
            System.out.println(uranus.atmosphere.methaneRate + "% methane");
        }
        if (uranus.atmosphere.sodiumRate != null) {
            System.out.println(uranus.atmosphere.sodiumRate + "% sodium\n");
        }

        */
        Atmosphere atmosphereMars = new Atmosphere();
        atmosphereMars.atmosphericCompositionMap.put("CO2", 95f);
        atmosphereMars.atmosphericCompositionMap.put("N2", 3f);
        atmosphereMars.atmosphericCompositionMap.put("AR", 1.5f);
        atmosphereMars.atmosphericCompositionMap.put("NO", 0.013f);

        mars.atmosphere = atmosphereMars;


        System.out.println("The atmosphere of Mars consists of :");
        for (String key : atmosphereMars.atmosphericCompositionMap.keySet()) {
            System.out.println(atmosphereMars.atmosphericCompositionMap.get(key) + "% de " + key);
        }

        // Docking starships

        WarStarShip frigate516 = new WarStarShip(StarshipType.FRIGATE);
        frigate516.crewMemberCount = 9;

        /*

        Starship outComingStarShip = mars.dockStarShip(frigate516);

        if (outComingStarShip == null) {
            System.out.println("No starship is currently docked.");

        } else {
            System.out.println("A " + outComingStarShip.type + " starship must undock first.");
        }

        WarStarShip cruiser61 = new WarStarShip(StarshipType.CRUISER);
        cruiser61.crewMemberCount = 42;

        outComingStarShip = mars.dockStarShip(cruiser61);

        if (outComingStarShip == null) {
            System.out.println("No starship is currently docked.");

        } else {
            System.out.println("A " + outComingStarShip.type.name + " starship must undock first.");
        }

        */


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

        WarStarShip cruiser12 = new WarStarShip(StarshipType.CRUISER);
        cruiser12.armor = 156;
        cruiser12.shieldResistanceTime = 2;

        CivilStarShip worldStarShip = new CivilStarShip(StarshipType.WORLDSHIP);
        worldStarShip.armor = 4784;
        worldStarShip.shieldResistanceTime = 30;

        cruiser12.enableShield();
        worldStarShip.enableShield();

        cruiser12.attack(worldStarShip, "photonics lasers", 3);

        worldStarShip.disableShield();

        System.out.println("Shield Resistance of the " + worldStarShip.type + " : " + worldStarShip.shieldResistanceTime);
        System.out.println("Armor Capacity of the " + worldStarShip.type + " : " + worldStarShip.armor + "\n");

        mars.dockStarShips(worldStarShip, cruiser12);


        // Abstract Method

        WarStarShip hunter556 = new WarStarShip(StarshipType.FIGHTER);
        earth.dockStarShips(hunter556);
        System.out.println("\nHunter drops " + hunter556.loadCargo(20) + " tons of cargo\n");

        WarStarShip frigate2144 = new WarStarShip(StarshipType.FRIGATE);
        frigate2144.crewMemberCount = 100;
        earth.dockStarShips(frigate2144);
        System.out.println("\nFrigate drops " + frigate2144.loadCargo(45) + " tons of cargo");
        System.out.println("Frigate drops " + frigate2144.loadCargo(12) + " tons of cargo");

        WarStarShip frigate2146 = new WarStarShip(StarshipType.FRIGATE);
        frigate2146.crewMemberCount = 14;
        earth.dockStarShips(frigate2146);
        System.out.println("\nFrigate drops " + frigate2146.loadCargo(30) + " tons of cargo");

        CivilStarShip worldShip554 = new CivilStarShip(StarshipType.WORLDSHIP);
        earth.dockStarShips(worldShip554);
        System.out.println("\nWorldShip drops " + worldShip554.loadCargo(1560) + " tons of cargo");
        System.out.println("WorldShip drops " + worldShip554.loadCargo(600) + " tons of cargo");


        // Scanner

        CivilStarShip cargo = new CivilStarShip(StarshipType.FREIGHTER);
        CivilStarShip worldShip = new CivilStarShip(StarshipType.WORLDSHIP);

        WarStarShip hunter = new WarStarShip(StarshipType.FIGHTER);
        WarStarShip frigate = new WarStarShip(StarshipType.FRIGATE);
        WarStarShip cruiser = new WarStarShip(StarshipType.CRUISER);



        Scanner sc = new Scanner(System.in);

        String startAgain = "yes";

        do {

            System.out.println("\nWhat type of Starship do you want to use ?");
            System.out.println("Cargo, WorldShip, Hunter, Frigate or Cruiser :");
            String selectedTypeOfStarship = sc.nextLine();

            System.out.println("\nWhich Planet do you want to visit ?");
            String selectedPlanet = sc.nextLine();

            System.out.println("\nHow much tonnage do you want to load ?");
            int selectedTonnage = sc.nextInt();
            sc.nextLine();


            Starship userStarship = switch (selectedTypeOfStarship) {
                case "Cargo" -> cargo;
                case "WorldShip" -> worldShip;
                case "Hunter" -> hunter;
                case "Frigate" -> frigate;
                case "Cruiser" -> cruiser;

                default -> null;
            };


            Planet userPlanet = null;

            for (Planet nextPlanet : solarSystem.planets) {
                if (nextPlanet.name.equalsIgnoreCase(selectedPlanet)) {
                    userPlanet = nextPlanet;
                    break;
                }
            }

            if (userPlanet instanceof GasGiant || userPlanet instanceof IceGiant) {
                System.out.println("The Planet you hac selected isn't a terrestrial Planet, start again...");
                continue;
            }

            TerrestrialPlanet userTerrestrialPlanet = (TerrestrialPlanet) userPlanet;

            /*

            TerrestrialPlanet userPlanet = switch (selectedPlanet) {
                case "Mercury" -> mercury;
                case "Venus" -> venus;
                case "Earth" -> earth;
                case "Mars" -> mars;

                default -> null;
            };

            */


            if (!userTerrestrialPlanet.isDockAvailable(userStarship)) {

                System.out.println("No dock available on this planet...");

            } else {

                userTerrestrialPlanet.dockStarShips(userStarship);
                userStarship.loadCargo(selectedTonnage);

            }

            System.out.println("Do you want to start again ?");
            startAgain = sc.nextLine();


        } while (startAgain.equalsIgnoreCase("yes"));








    }
}
