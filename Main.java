// Todo: think about how to add Track, Jeep

import javax.sound.midi.Soundbank;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;

public class Main {

 /*   static public Drive[] getEngines(){
        Drive[] engines = new Drive[20];
        engines[0] = new Car();
        engines[1] = new Minivan();
        engines[2] = new Minivan();
        engines[3] = new Minivan();
        engines[4] = new ParquetJeep();
        engines[5] = new ParquetJeep();
        engines[6] = new FrameJeep();
        engines[7] = new FrameJeep();
        engines[8] = new Track();
        engines[9] = new Track();
        engines[10] = new Pajero();

        engines[11] = new Bike();
        engines[12] = new Bike();
        engines[13] = new Bike();
        engines[14] = new Bike();
        engines[15] = new Bike();

        engines[16] = new Train();
        engines[17] = new Train();
        engines[18] = new Train();
        engines[19] = new Train();

        // TODO: Add Track;

        // TODO: Add Jeep;

        return engines;

    }*/

/*    public static ArrayList<Drive> getEngines(){
        ArrayList<Drive> engines = new ArrayList<>();
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
    }*/

    public static LinkedList<Drive> getEngines(){
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


    public static void main(String[] args){

        int myData = 12345;
        Integer myAlternativeData = 12345;

        Integer result = myData + myAlternativeData + 12345;

        ArrayList<Integer> example = new ArrayList<>();

        try {
            for (Drive engine : getEngines()){
                engine.driveOn();
            }


            for (Drive engine : getEngines()){
                engine.driveOff();
            }
            throw new SQLException("SQL CODE..");

        }
        catch (IllegalAccessError ex) {
            // Some code
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            // Some code
            System.out.println(ex.getMessage());
        }
        finally {
            // Some code
        }
        for (Drive drive: getEngines()){
            drive.driveOn();

            int hash = drive.hashCode();
            System.out.println(hash);
        }

        for (Drive drive: getEngines()){

            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put(drive.toString(),drive.toString());
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
