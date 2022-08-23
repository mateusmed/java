package streams.filter.hashmap;


import java.util.Map;

public class Main {

    private FilterHashMap filterHashMap;

    public Main() {
        filterHashMap = new FilterHashMap();
    }

    public void filterHashMap(){

        System.out.println("=========== filterHashMap ===========");

        Map<String, String> properties = filterHashMap.getProperties();

        System.out.println("--- test one ---");
        System.out.println(filterHashMap.filterByPrefixKeyOne(properties,
                                                             "screen"));
        System.out.println("----------------");

        System.out.println("--- test two ---");
        System.out.println(filterHashMap.filterByPrefixKeyTwo(properties,
                                                             "screen"));
        System.out.println("----------------");

        System.out.println("--- test three ---");
        System.out.println(filterHashMap.filterPropertiesByPrefixListOne(properties,
                                                            "screen,header"));
        System.out.println("----------------");

        System.out.println("--- test Four ---");
        System.out.println(filterHashMap.filterPropertiesByPrefixListTwo(properties,
                                                            "screen,header"));
        System.out.println("----------------");

        System.out.println("=========== ==================== ===========");

    }

    public static void main(String[] args) {

        Main main = new Main();
        main.filterHashMap();

    }
}
