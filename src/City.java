public class City {

    private final String name;
    private final int maxTemperature;
    private final int minTemperature;

    public City(String name, int minTemperature, int maxTemperature) {
        this.name = name;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public String getName() {
        return name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }
}
