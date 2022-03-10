import java.util.List;

public class Main {

    private static void searchTemperatures(List<City> cities) {
        if (cities.isEmpty()) {
            return;
        }

        City hottestCity = cities.get(0), coldestCity = cities.get(0);

        for (City city: cities) {
            if (city.getMaxTemperature() > hottestCity.getMaxTemperature()) {
                hottestCity = city;
            }

            if (city.getMinTemperature() < coldestCity.getMinTemperature()) {
                coldestCity = city;
            }
        }

        System.out.println(String.format("Cidade mais fria: %s com %d graus", coldestCity.getName(), coldestCity.getMinTemperature()));
        System.out.println(String.format("Cidade mais quente: %s com %d graus", hottestCity.getName(), hottestCity.getMaxTemperature()));
    }

    public static void main(String[] args) {
        List<City> cities = List.of(
                new City("Londres", -2, 33),
                new City("Madrid", -3, 32),
                new City("Nueva York", -8, 27),
                new City("Buenos Aires", 4, 37),
                new City("Asúncion", 6, 42),
                new City("São Paulo", 5, 43),
                new City("Lima", 8, 39),
                new City("Santiado de Chile", -7, 26),
                new City("Lisboa", -1, 31),
                new City("Tokio", -10, 35)
        );

        searchTemperatures(cities);
    }
}
