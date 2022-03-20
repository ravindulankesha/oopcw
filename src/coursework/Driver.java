package coursework;
import java.io.Serializable;

public abstract class Driver implements Serializable, ChampionshipManager{
    private String name;
    private String location;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

