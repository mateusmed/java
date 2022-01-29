import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Main {


    public String requestOne() throws InterruptedException {

        Thread.sleep(1000);

        return "1";
    }

    public String requestTwo() throws Exception {



        throw new Exception("erro na chamada 2");

//        Thread.sleep(2000);
//
//        return "2";
    }

    public String requestThree() throws InterruptedException {

        Thread.sleep(3000);

        return "3";
    }


    private void noAsyncCall() throws Exception{

        String one = requestOne();
        String two = requestTwo();
        String three = requestThree();

        System.out.println(one + two + three);
    }

    private String asyncCall() throws Exception{

        CompletableFuture<String> c1 = CompletableFuture.supplyAsync(() -> {
            try {
                return requestOne();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });

        CompletableFuture<String> c2 = CompletableFuture.supplyAsync(() -> {
            try {

                return requestTwo();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new CompletionException(e);
            }
        });

        CompletableFuture<String> c3 = CompletableFuture.supplyAsync(() -> {
            try {
                return requestThree();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });

        CompletableFuture.allOf(c1, c2, c3);

        String one = c1.get();
        String two = c2.get();
        String three = c3.get();

        return one + two + three;
    }


//    CompletableFuture<String> c1 = CompletableFuture.supplyAsync(() -> "OK");

    public static void main(String[] args) {
        try{

            long startTime = System.currentTimeMillis();

            Main myMain = new Main();

            String myMessage = myMain.asyncCall();
            System.out.println(myMessage);

            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println(elapsedTime);

        }catch (Exception e){

            System.out.println("ocorreu um erro em alguma das requisições asyncronas " + e.getMessage());
            e.getMessage();
            e.printStackTrace();
        }

    }
}
