package pl.adamowski.beerhub.models;

public class Beer {


    private String name;
    private String brewery;
    private String style;
    private double lat;
    private double lon;

    public Beer() {
    }


    public Beer(String brewery, String name, String style, double lat, double lon) {
        this.name = name;
        this.brewery = brewery;
        this.style = style;
        this.lat=lat;
        this.lon=lon;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String toString() {
        return "Beer{" +
                "Name='" + name + '\'' +
                ", brewery='" + brewery + '\'' +
                ", style=" + style +
                '}';
    }

}
