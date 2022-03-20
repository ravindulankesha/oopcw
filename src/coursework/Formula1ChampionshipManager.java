package coursework;
import java.io.*;
import java.util.ArrayList;

public class Formula1ChampionshipManager extends GraphicalInterface implements Serializable{
    public static void menu(String option) throws IOException, ClassNotFoundException {
        switch (option) {
            case "P":
                drivers.add(new Formula1Driver().formula1Driver());
                System.out.println("Successfully added a driver");
                break;
            case "V":
                new Formula1Driver().view_Driver(drivers);
                break;
            case "C":
                drivers.add(new Formula1Driver().create_Driver());
                System.out.println("Successfully created a new driver");
                break;
            case "D":
                new Formula1Driver().delete_Driver(drivers);
                break;
            case "T":
                new Formula1Driver().change_Team(drivers);
                break;
            case "S":
                new Formula1Driver().view_Statistics(drivers);
                break;
            case "Q":
                new Formula1Driver().ascending(drivers);
                System.out.println();
                break;
            case "K":
                new Formula1Driver().descending(drivers);
                System.out.println();
                break;
            case "A":
                new Formula1Driver().race(drivers);
                break;
            case "I":
                new Formula1Driver().text_Write(drivers);
                break;
            case "J":
                //Loading from a file
                try{FileInputStream filein = new FileInputStream("state.ser");
                ObjectInputStream objectin = new ObjectInputStream(filein);
                ArrayList<Formula1Driver> dList = (ArrayList<Formula1Driver>) objectin.readObject();
                drivers = dList;
                objectin.close();
                filein.close();}
                catch (IOException | ClassNotFoundException i){
                    i.printStackTrace();
                }
                System.out.println("Successfully loaded from previous state");
                break;
            case "O":
                new Formula1Driver().first_Positions(drivers);
                System.out.println();
                break;
            case "Z":
                new Formula1Driver().random(drivers);
                break;
            default:
                //Storing the data enetered so far to a file
                try{FileOutputStream fileout=new FileOutputStream("state.ser");
                ObjectOutputStream objectout = new ObjectOutputStream(fileout);
                objectout.writeObject(drivers);
                objectout.close();
                fileout.close();}
                catch(IOException e){
                    e.printStackTrace();
                }
                System.out.println("You have stopped");
        }
    }
}

