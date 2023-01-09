// Todo: think about how to add Cars.Track, Cars.Jeep

import Transports.*;
import Transports.Cars.FrameJeep;
import Transports.Cars.Pajero;
import Transports.Cars.ParquetJeep;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

 /*   static public Transports.Drive[] getEngines(){
        Transports.Drive[] engines = new Transports.Drive[20];
        engines[0] = new Cars.Car();
        engines[1] = new Cars.Minivan();
        engines[2] = new Cars.Minivan();
        engines[3] = new Cars.Minivan();
        engines[4] = new Transports.Cars.ParquetJeep();
        engines[5] = new Transports.Cars.ParquetJeep();
        engines[6] = new Transports.Cars.FrameJeep();
        engines[7] = new Transports.Cars.FrameJeep();
        engines[8] = new Cars.Track();
        engines[9] = new Cars.Track();
        engines[10] = new Transports.Cars.Pajero();

        engines[11] = new Transports.Bike();
        engines[12] = new Transports.Bike();
        engines[13] = new Transports.Bike();
        engines[14] = new Transports.Bike();
        engines[15] = new Transports.Bike();

        engines[16] = new Cars.Train();
        engines[17] = new Cars.Train();
        engines[18] = new Cars.Train();
        engines[19] = new Cars.Train();

        return engines;

    }*/

/*    public static ArrayList<Transports.Drive> getEngines(){
        ArrayList<Transports.Drive> engines = new ArrayList<>();
        engines.add(new Cars.Car());
        engines.add(new Cars.Minivan());
        engines.add(new Cars.Minivan());
        engines.add(new Cars.Minivan());
        engines.add(new Transports.Cars.ParquetJeep());
        engines.add(new Transports.Cars.ParquetJeep());
        engines.add(new Transports.Cars.FrameJeep());
        engines.add(new Transports.Cars.FrameJeep());
        engines.add(new Cars.Track());
        engines.add(new Cars.Track());
        engines.add(new Transports.Cars.Pajero());

        engines.add(new Transports.Bike());
        engines.add(new Transports.Bike());
        engines.add(new Transports.Bike());
        engines.add(new Transports.Bike());
        engines.add(new Transports.Bike());

        engines.add(new Cars.Train());
        engines.add(new Cars.Train());
        engines.add(new Cars.Train());
        engines.add(new Cars.Train());

        return engines;
    }*/

    public static LinkedList<Drive> getEngines() {
        LinkedList<Drive> engines = new LinkedList<>();
        engines.add(new Car());
        engines.add(new Minivan());
        engines.add(new Minivan());
        engines.add(new Minivan());
        engines.add(new ParquetJeep());
        engines.add(new ParquetJeep());
        engines.add(new FrameJeep());
        engines.add(new FrameJeep());
        engines.add(new Track());
        engines.add(new Track());
        engines.add(new Pajero());

        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());

        engines.add(new Train());
        engines.add(new Train());
        engines.add(new Train());
        engines.add(new Train());

        return engines;
    }


    public static void main(String[] args) {

        int myData = 12345;
        Integer myAlternativeData = 12345;

        Integer result = myData + myAlternativeData + 12345;

        ArrayList<Integer> example = new ArrayList<>();

        try {
            for (Drive engine : getEngines()) {
                engine.driveOn();
            }


            for (Drive engine : getEngines()) {
                engine.driveOff();
            }
            throw new SQLException("SQL CODE..");

        } catch (IllegalAccessError ex) {
            // Some code
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            // Some code
            System.out.println(ex.getMessage());
        } finally {
            // Some code
        }
        for (Drive drive : getEngines()) {
            drive.driveOn();

            int hash = drive.hashCode();
            System.out.println(hash);
        }

        for (Drive drive : getEngines()) {

            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(drive.toString(), drive.toString());
            System.out.println(hashMap);
        }

        HashSet<String> wonderWorld2022 = new HashSet<>();
        wonderWorld2022.add("Yellowstone National Park");
        wonderWorld2022.add("Galapagos Islands");
        wonderWorld2022.add("The Forbidden City");
        wonderWorld2022.add("Antarctica");
        wonderWorld2022.add("The Great Alley of Sphinxes");
        wonderWorld2022.add("Northern lights");
        wonderWorld2022.add("Colosseum");
    }
}
