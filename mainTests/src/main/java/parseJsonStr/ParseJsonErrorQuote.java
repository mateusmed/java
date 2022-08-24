package parseJsonStr;

import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseJsonErrorQuote {

    public void test(){

        try {
            String wrongJson = "{\"atr\": \"ok\", \"atr2\": \"value whith\" teste32 \"another\" value with another\" test \"}";

            //Corresponde a caracteres alfanuméricos: [a-zA-Z0-9_]
            String regex = "([\\: ]\\\"[\\w ]*\\\"[\\w ]*\\\"[\\w ]*\\\")";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(wrongJson);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }

            /**
             {"attributeOne": "valueOne", "attributeTwo": "valueTwo with this another word "here" test ", "attributeTree": "ok "notok" another "not ok""}

                todo pensar em recursão para casos além do nível dois no mesmo contexto
             **/


//            JSONObject obj = new JSONObject(jsonStr);

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
