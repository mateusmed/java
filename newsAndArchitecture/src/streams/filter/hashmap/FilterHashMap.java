package streams.filter.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterHashMap {


    private Stream<String> stringListToStream(String prefixArray){

        String[] prefixList = prefixArray.split(",");

        return Arrays.stream(prefixList);
    }

    public Map<String, String> filterPropertiesByPrefixListOne(Map<String, String> map, String prefixArray){

        Map<String, String> sysPropMap = new HashMap<>();

        Stream<String> array = stringListToStream(prefixArray);

        //loop por fora do stream
        array.forEach(item -> {
            sysPropMap.putAll(map.entrySet()
                    .stream()
                    .filter(property -> property.getKey().startsWith(item))
                    .collect(Collectors.toMap(Map.Entry::getKey,
                            Map.Entry::getValue)));
        });

        return sysPropMap;
    }


    //TODO objetivo colocar o loop de prefix pra dentro do streem encadeadamente
    public Map<String, String> filterPropertiesByPrefixListTwo(Map<String, String> map, String prefixArray){

        Stream<String> array = stringListToStream(prefixArray);

        array.forEach(item -> {
            System.out.println("prefix " + item);
        });

        map.entrySet().stream()
            .forEach((item) -> {
                System.out.println("map " + item);
            });


        return null;
    }


    public Map<String, String> filterByPrefixKeyOne(Map<String, String> map, String prefix){

        return map.entrySet()
                .stream()
                .filter(sysProp -> sysProp.getKey().startsWith(prefix))
                .collect(Collectors.toMap(item -> item.getKey(),
                                          item -> item.getValue()));

    }

    public Map<String, String> filterByPrefixKeyTwo(Map<String, String> map, String prefix){

        return map.entrySet()
                .stream()
                .filter(sysProp -> sysProp.getKey().startsWith(prefix))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }



    public Map<String, String> getProperties(){

        Map<String, String> propertyMap = new HashMap<>();

        propertyMap.put("screen.1.button.value", "button 1 label");
        propertyMap.put("screen.2.button.value", "button 2 label");
        propertyMap.put("screen.3.button.value", "button 3 label");
        propertyMap.put("header.title.value", " my title");

        return propertyMap;
    }


}
