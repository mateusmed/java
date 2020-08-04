package streams.lambda;

import java.util.function.Function;

public class Lambda {


    public void funcionalFunction(){
        // <tipo_entrada, tipo_retorno>
        Function<Integer, Integer> myFunction = (x) -> x*3 + 2;

        Integer result = myFunction.apply(1);
        System.out.println(result);
    }


}
