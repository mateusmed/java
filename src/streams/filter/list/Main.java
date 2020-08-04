package streams.filter.list;

public class Main {

    public FilterList filter;

    public Main() {
        filter = new FilterList();
    }

    public void streamFilter(){

        System.out.println("=========== stream filter ==========");

        System.out.println("--- test one ---");
        System.out.println(filter.getFemaleStyleOne(filter.getListPerson()));
        System.out.println("----------------");

        System.out.println("--- test two ---");
        System.out.println(filter.getFemaleStyleTwo(filter.getListPerson()));
        System.out.println("----------------");

        System.out.println("--- test three ---");
        System.out.println(filter.getFemaleStyleThree(filter.getListPerson()));
        System.out.println("----------------");

        System.out.println("--- test four ---");
        System.out.println(filter.getFemaleStyleThree(filter.getListPerson()));
        System.out.println("----------------");

        System.out.println("=========== ========== ==========");
    }

    //usando java 14
    public static void main(String[] args) {

        Main main = new Main();
        main.streamFilter();
    }
}
