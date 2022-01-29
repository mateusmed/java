package streams.filter.list;

import entity.Gender;
import entity.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterList {



    private boolean filterByGender(Person person, Gender gender){
        if(person.getGender().equals(gender)){
            return true;
        }
        return false;
    }

    private boolean filterByFemale(Person person){
        if(person.getGender().equals(Gender.FEMALE)){
            return true;
        }
        return false;
    }

    // se tiver os {} significa que é necessário determinar o retorno
    public List<Person> getFemaleStyleOne(List<Person> personList){

        List<Person> personFemale = personList.stream()
                .filter( (person) -> {
                    return person.getGender().equals(Gender.FEMALE);
                })
                .collect(Collectors.toList());

        return personFemale;
    }

    // sem {} sem explicitar o retorno
    // filter esperando uma função bolleana
    public List<Person> getFemaleStyleTwo(List<Person> personList){

        List<Person> personFemale = personList.stream()
                .filter( (person) -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        return personFemale;
    }


//    O operador :: foi adicionado ao Java 8 e faz parte de expressões
//    que referenciam métodos (Method Reference Expressions).
//    As referências a métodos (Method References) funcionam como complemento aos lambdas.

    public List<Person> getFemaleStyleThree(List<Person> personList){

        return personList.stream()
                         .filter(this::filterByFemale)
                         .collect(Collectors.toList());
    }


//    se precisar passar mais de um parametro de deve explicitar o retorno
    public List<Person> getFemaleStyleFour(List<Person> personList){

        List<Person> personFemale = personList.stream()
                .filter((person) -> { return this.filterByGender(person, Gender.FEMALE);})
                .collect(Collectors.toList());

        return personFemale;
    }


    public List<Person> getListPerson(){

        return List.of(new Person("Peter Parker", 22, Gender.MALE),
                       new Person("Albert Einstein", 70, Gender.MALE),
                       new Person("Christina Aguilera", 66, Gender.FEMALE));
    }


}
