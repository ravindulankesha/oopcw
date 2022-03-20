package coursework;
import java.io.*;
import java.util.*;

public class Formula1Driver extends Driver implements Serializable,ChampionshipManager{

    //Declaring getters and setters
    private String team_name;
    private Integer number_of_races;
    private Integer totalpoints;
    private Integer count;
    int sum=0;
    ArrayList<Integer> positions_awarded= new ArrayList<Integer>();
    ArrayList<Integer> points= new ArrayList<Integer>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotalpoints() {
        return totalpoints;
    }

    public void setTotalpoints(Integer totalpoints) {
        this.totalpoints = totalpoints;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public Integer getNumber_of_races() {
        return number_of_races;
    }

    public void setNumber_of_races(Integer number_of_races) {
        this.number_of_races = number_of_races;
    }

    //Implementing the methods for the menu
    public Formula1Driver formula1Driver() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driver's name: ");
        super.setName(input.nextLine());
        System.out.println("Enter the driver's location: ");
        super.setLocation(input.nextLine());
        System.out.println("Enter the driver's team name(Ferrari,Lamborghini,Chevrolet,Ford): ");
        this.setTeam_name(input.nextLine());
        System.out.println("Enter the number of races participated: ");
        this.setNumber_of_races(input.nextInt());
        input.nextLine();
        if (getNumber_of_races()!=0) {
            for (int i = 0; i < getNumber_of_races() ; i++) {
                System.out.print("Enter the position awarded for the race no." + (i + 1) + ": ");
                int number= input.nextInt();
                positions_awarded.add(i, number);
                input.nextLine();
                if (number== 1) {
                    points.add(i,25);
                } else if (number == 2) {
                    points.add(i,18);
                } else if (number == 3) {
                    points.add(i,15);
                } else if (number == 4) {
                    points.add(i,12);
                } else if (number == 5) {
                    points.add(i,10);
                } else if (number == 6) {
                    points.add(i,8);
                } else if (number == 7) {
                    points.add(i,6);
                } else if (number == 8) {
                    points.add(i,4);
                } else if (number == 9) {
                    points.add(i,2);
                } else if (number == 10) {
                    points.add(i,1);
                } else {
                    points.add(i,0);
                }
                sum += points.get(i);
                setTotalpoints(sum);
            }
        }
    return this;}

    public Formula1Driver create_Driver() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driver's name: ");
        super.setName(input.nextLine());
        System.out.println("Enter the driver's location: ");
        super.setLocation(input.nextLine());
        System.out.println("Enter the driver's team name(Ferrari,Lamborghini,Chevrolet,Ford): ");
        this.setTeam_name(input.nextLine());
        this.setNumber_of_races(0);
        this.setTotalpoints(0);
        return this;
    }

    public Formula1Driver view_Driver(ArrayList <Formula1Driver> drivers){
        String result = "";
        for (int j = 0; j < drivers.size(); j++) {
            result += "Name:" + drivers.get(j).getName() + "\nLocation: " +
                    drivers.get(j).getLocation() + "\nTeam:" +
                    drivers.get(j).getTeam_name() + "\nNumber of races participated: " +
                    drivers.get(j).getNumber_of_races() + "\nPositions for each race: " +
                    drivers.get(j).positions_awarded + "\nPoints for each race: " +
                    drivers.get(j).points + "\nTotal points: " +
                    drivers.get(j).getTotalpoints() + "\n";
        }
        System.out.println(result);
        return this;
    }

    public Formula1Driver change_Team(ArrayList <Formula1Driver> drivers){
        String team;
        Scanner input = new Scanner(System.in);
        String changed_driver;
        System.out.println("what is the name of the driver you want to change team:");
        changed_driver = input.nextLine();
        System.out.println("what is " + changed_driver + "'s new team?(Ferrari,Lamborghini,Chevrolet,Ford):");
        team = input.nextLine();
        for (int j = 0; j < drivers.size(); j++) {
            if (drivers.get(j).getName().equals(changed_driver)) {
                drivers.get(j).setTeam_name(team);
                System.out.println("Successfully changed driver " + changed_driver + " to the team " + team);
            }
        }
        return this;
    }

    public Formula1Driver delete_Driver(ArrayList <Formula1Driver> drivers){
        String deletion;
        Scanner input = new Scanner(System.in);
        System.out.println("what is the name of the driver you want to delete:");
        deletion = input.nextLine();
        for (int j = 0; j < drivers.size(); j++) {
            if (drivers.get(j).getName().equals(deletion)) {
                drivers.remove(j);
                System.out.println("Successfully deleted driver " + deletion);
            }
        }
        return this;
    }

    public Formula1Driver view_Statistics(ArrayList <Formula1Driver> drivers){
        String statistics;
        Scanner input = new Scanner(System.in);
        String viewed_driver;
        System.out.println("what is the name of the driver you want to view statistics of:");
        viewed_driver = input.nextLine();
        for (int j = 0; j < drivers.size(); j++) {
            if (drivers.get(j).getName().equals(viewed_driver)) {
                statistics = viewed_driver + ":-" + "\nLocation: " +
                        drivers.get(j).getLocation() + "\nTeam:" +
                        drivers.get(j).getTeam_name() + "\nNumber of races participated: " +
                        drivers.get(j).getNumber_of_races() + "\nPositions for each race: " +
                        drivers.get(j).positions_awarded + "\nPoints for each race: " +
                        drivers.get(j).points + "\nTotal points: " +
                        drivers.get(j).getTotalpoints();
                System.out.println(statistics);
            }
        }
        return this;
    }

    public Formula1Driver ascending(ArrayList <Formula1Driver> drivers){
        ArrayList<Formula1Driver> ordered_table2 = new ArrayList<>();
        ordered_table2 = drivers;
        Collections.sort(ordered_table2, new Comparator<Formula1Driver>() {
            @Override
            public int compare(Formula1Driver o1, Formula1Driver o2) {
                return o1.getTotalpoints().compareTo(o2.getTotalpoints());
            }
        });
        System.out.printf("%-10.10S", "name");
        System.out.printf("%-15.15S", "location");
        System.out.printf("%-15.15S", "team");
        System.out.printf("%-15.15S", "# of races ");
        System.out.printf("%-40.40S", "positions obtained");
        System.out.printf("%-45.45S", "points for each race");
        System.out.printf("%-6.6S", "total");
        System.out.println();
        for (int j = 0; j < ordered_table2.size(); j++) {
            System.out.printf("%-10.10S", ordered_table2.get(j).getName());
            System.out.printf("%-15.15S", ordered_table2.get(j).getLocation());
            System.out.printf("%-15.15S", ordered_table2.get(j).getTeam_name());
            System.out.printf("%-15.15S", ordered_table2.get(j).getNumber_of_races());
            System.out.printf("%-40.40S", ordered_table2.get(j).positions_awarded);
            System.out.printf("%-45.45S", ordered_table2.get(j).points);
            System.out.printf("%-6.6S", ordered_table2.get(j).getTotalpoints());
            System.out.println();
        }
        return this;
    }

    public Formula1Driver descending (ArrayList <Formula1Driver> drivers){
        ArrayList<Formula1Driver> ordered_table = new ArrayList<>();
        ordered_table = drivers;
        Collections.sort(ordered_table, new Comparator<Formula1Driver>() {

            public int compare(Formula1Driver o1, Formula1Driver o2) {
                return o2.getTotalpoints().compareTo(o1.getTotalpoints());
            }
        });
        System.out.printf("%-10.10S", "name");
        System.out.printf("%-15.15S", "location");
        System.out.printf("%-15.15S", "team");
        System.out.printf("%-15.15S", "# of races ");
        System.out.printf("%-40.40S", "positions obtained");
        System.out.printf("%-45.45S", "points for each race");
        System.out.printf("%-6.6S", "total");
        System.out.println();
        for (int j = 0; j < ordered_table.size(); j++) {
            System.out.printf("%-10.10S", ordered_table.get(j).getName());
            System.out.printf("%-15.15S", ordered_table.get(j).getLocation());
            System.out.printf("%-15.15S", ordered_table.get(j).getTeam_name());
            System.out.printf("%-15.15S", ordered_table.get(j).getNumber_of_races());
            System.out.printf("%-40.40S", ordered_table.get(j).positions_awarded);
            System.out.printf("%-45.45S", ordered_table.get(j).points);
            System.out.printf("%-6.6S", ordered_table.get(j).getTotalpoints());
            System.out.println();
        }
        return this;
    }

    public Formula1Driver race (ArrayList <Formula1Driver> drivers) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the date of the race");
        String date= input.nextLine();
        System.out.println("Enter the number of drivers who participated:");
        Integer participated_drivers = input.nextInt();
        input.nextLine();
        for (int i = 1; i < participated_drivers + 1; i++) {
            System.out.println("Enter the name of the driver who got position " + i + ":");
            String racer = input.nextLine();
            for (int j = 0; j < drivers.size(); j++) {
                if (drivers.get(j).getName().equals(racer)) {
                    drivers.get(j).setNumber_of_races(drivers.get(j).getNumber_of_races() + 1);
                    drivers.get(j).positions_awarded.add(drivers.get(j).getNumber_of_races() - 1, i);
                    if (i == 1) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 25);
                    } else if (i == 2) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 18);
                    } else if (i == 3) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 15);
                    } else if (i == 4) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 12);
                    } else if (i == 5) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 10);
                    } else if (i == 6) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 8);
                    } else if (i == 7) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 6);
                    } else if (i == 8) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 4);
                    } else if (i == 9) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 2);
                    } else if (i == 10) {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 1);
                    } else {
                        drivers.get(j).points.add(drivers.get(j).getNumber_of_races() - 1, 0);
                    }
                    drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+drivers.get(j).points.get(drivers.get(j).getNumber_of_races() - 1));
                }
            }
        }
        return this;
    }

    public Formula1Driver text_Write (ArrayList <Formula1Driver> drivers) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("Information", "UTF-8");
        for (int j = 0; j < drivers.size(); j++) {
            writer.println("Name:" + drivers.get(j).getName() + "\nLocation: " +
                    drivers.get(j).getLocation() + "\nTeam:" +
                    drivers.get(j).getTeam_name() + "\nNumber of races participated: " +
                    drivers.get(j).getNumber_of_races() + "\nPositions for each race: " +
                    drivers.get(j).positions_awarded + "\nPoints for each race: " +
                    drivers.get(j).points + "\nTotal points: " +
                    drivers.get(j).getTotalpoints());
        }
        writer.close();
        System.out.println("Successfully saved all the information in the file named Information");
        return this;
    }

    public Formula1Driver first_Positions (ArrayList <Formula1Driver> drivers) {
        for (int j = 0; j < drivers.size(); j++) {
            drivers.get(j).setCount(0);
            for (int i = 0; i < drivers.get(j).positions_awarded.size(); i++) {
                if (drivers.get(j).positions_awarded.get(i).equals(1)) {
                    drivers.get(j).setCount(drivers.get(j).getCount()+1);
                }
            }
        }
        ArrayList<Formula1Driver> ordered_table3 = new ArrayList<>();
        ordered_table3 = drivers;
        ordered_table3.sort(new Comparator<Formula1Driver>() {

            public int compare(Formula1Driver o1, Formula1Driver o2) {
                return o2.getCount().compareTo(o1.getCount());
            }
        });
        System.out.printf("%-10.10S", "name");
        System.out.printf("%-15.15S", "location");
        System.out.printf("%-15.15S", "team");
        System.out.printf("%-15.15S", "# of races ");
        System.out.printf("%-40.40S", "positions obtained");
        System.out.printf("%-45.45S", "points for each race");
        System.out.printf("%-6.6S", "total");
        System.out.println();
        for (int j = 0; j < ordered_table3.size(); j++) {
            System.out.printf("%-10.10S", ordered_table3.get(j).getName());
            System.out.printf("%-15.15S", ordered_table3.get(j).getLocation());
            System.out.printf("%-15.15S", ordered_table3.get(j).getTeam_name());
            System.out.printf("%-15.15S", ordered_table3.get(j).getNumber_of_races());
            System.out.printf("%-40.40S", ordered_table3.get(j).positions_awarded);
            System.out.printf("%-45.45S", ordered_table3.get(j).points);
            System.out.printf("%-6.6S", ordered_table3.get(j).getTotalpoints());
            System.out.println();}
        return this;
    }

    public Formula1Driver random (ArrayList <Formula1Driver> drivers) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int q=1; q<drivers.size()+1; q++){
            numbers.add(q);
            Collections.shuffle(numbers);
        }
        for (int j = 0; j < drivers.size(); j++) {
            drivers.get(j).positions_awarded.add(numbers.get(j));
            drivers.get(j).setNumber_of_races(drivers.get(j).getNumber_of_races()+1);
            System.out.println(drivers.get(j).getName()+" finished as position "+ numbers.get(j));
            if (numbers.get(j)==1){
                drivers.get(j).points.add(25);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+25);
            }
            if (numbers.get(j)==2){
                drivers.get(j).points.add(18);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+18);
            }
            if (numbers.get(j)==3){
                drivers.get(j).points.add(15);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+15);
            }
            if (numbers.get(j)==4){
                drivers.get(j).points.add(12);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+12);
            }
            if (numbers.get(j)==5){
                drivers.get(j).points.add(10);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+10);
            }
            if (numbers.get(j)==6){
                drivers.get(j).points.add(8);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+8);
            }
            if (numbers.get(j)==7){
                drivers.get(j).points.add(6);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+6);
            }
            if (numbers.get(j)==8){
                drivers.get(j).points.add(4);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+4);
            }
            if (numbers.get(j)==9){
                drivers.get(j).points.add(2);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+2);
            }
            if (numbers.get(j)==10){
                drivers.get(j).points.add(1);
                drivers.get(j).setTotalpoints(drivers.get(j).getTotalpoints()+1);
            }
            if (numbers.get(j)>10){
                drivers.get(j).points.add(0);
            }
        }
        System.out.println("Successfully finished a random race");
        return this;
    }

}
