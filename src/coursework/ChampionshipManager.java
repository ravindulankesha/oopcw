package coursework;

import java.io.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public interface ChampionshipManager{
    public Formula1Driver formula1Driver();
    public Formula1Driver create_Driver();
    public Formula1Driver view_Driver(ArrayList<Formula1Driver> drivers);
    public Formula1Driver delete_Driver(ArrayList <Formula1Driver> drivers);
    public Formula1Driver change_Team(ArrayList <Formula1Driver> drivers);
    public Formula1Driver view_Statistics(ArrayList <Formula1Driver> drivers);
    public Formula1Driver ascending(ArrayList <Formula1Driver> drivers);
    public Formula1Driver descending (ArrayList <Formula1Driver> drivers);
    public Formula1Driver race (ArrayList <Formula1Driver> drivers);
    public Formula1Driver text_Write (ArrayList <Formula1Driver> drivers) throws FileNotFoundException, UnsupportedEncodingException;
    public Formula1Driver first_Positions (ArrayList <Formula1Driver> drivers);
    public Formula1Driver random (ArrayList <Formula1Driver> drivers);
}
