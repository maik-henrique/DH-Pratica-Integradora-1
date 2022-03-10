public class Main {

    public static final String[] CITIES = {"Londes", "Madrid", "Nueva York", "Buenos Aires", "Asuncíon", "São Paulo",
            "Lima", "Santiado de Chile", "Lisboa", "Tokio"};

    public static final int[][] TEMPERATURES = {
            {-2, 33},
            {-3, 32},
            {-8, 27},
            {4, 37},
            {6, 42},
            {5, 43},
            {0, 39},
            {-7, 26},
            {-1, 31},
            {-10, 35}
    };

    private static void searchTemperatures() {
        int coldestCityIndex = 0, hottestCityIndex = 0;

        for (int i = 0; i < CITIES.length; i++) {
            if (TEMPERATURES[i][0] < TEMPERATURES[coldestCityIndex][0]) {
                coldestCityIndex = i;
            }

            if (TEMPERATURES[i][1] > TEMPERATURES[hottestCityIndex][1]) {
                hottestCityIndex = i;
            }
        }

        System.out.println(String.format("Cidade mais fria: %s com %d graus", CITIES[coldestCityIndex], TEMPERATURES[coldestCityIndex][0]));
        System.out.println(String.format("Cidade mais quente: %s com %d graus", CITIES[hottestCityIndex], TEMPERATURES[hottestCityIndex][1]));
    }

    public static void main(String[] args) {
        searchTemperatures();
    }
}
