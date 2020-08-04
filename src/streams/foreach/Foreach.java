package streams.foreach;

import java.util.Arrays;
import java.util.stream.Stream;

public class Foreach {

    public void foreachArray(){

        String keys = "teste1,teste2,teste3";

        String[] splited = keys.split(",");

        Stream<String> array = Arrays.stream(splited);

        array.forEach(item -> {
            System.out.println("my item " + item);
        });
    }

}
