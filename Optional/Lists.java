import Resources.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {


    public static void main(String[] args){

        //testListMap();
        testListFlatMap();
    }

    private static void testListMap() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("John", 30, "123456"));
        customerList.add(new Customer("Maria", 7, "123457"));
        customerList.add(new Customer("Kevin", 60, "123458"));
        customerList.add(new Customer("Aron", 45, "123459"));

        //Map Tests
        List<String> names = customerList.stream().map(Customer::getName).collect(Collectors.toList());
        names.stream().forEach(System.out::println);

        List<Integer> ages = customerList.stream().map(Customer::getAge).collect(Collectors.toList());
        ages.stream().forEach(System.out::println);
    }

    private static void testListFlatMap(){

        List<String> numbers = new ArrayList<String>();
        numbers.add("1, 2, 3, 4, 5");
        numbers.add("4, 4, 4");
        numbers.add("6, 6, 3, 1, 2, 3, 5, 6");

        // Made some manipulations to practice map/reduce
        double sumList = numbers.stream()
                .map(list -> Arrays.asList(list.split(",")))
                .map(list -> list.stream().map(String::strip))
                .map(list -> list.map(Integer::parseInt))
                .map(list -> list.map(e -> Math.pow(e, 2)))
                .map(list -> list.reduce(0.0, (x, y) -> x + y))
                .reduce(0.0, (x, y) -> x + y);

        System.out.println(sumList);

        double sumList2 = numbers.stream()
                        .map(list -> Arrays.asList(list.split(",")).stream()
                                        .map(numberStr -> numberStr.strip())
                                        .map(Integer::parseInt))
                        .flatMap(i -> i.map(j -> Math.pow(j, 2)))
                        .reduce(0.0, (x, y) -> x + y);

        System.out.println(sumList2);
    }
}