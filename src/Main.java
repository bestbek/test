import io.zensoft.core.annotation.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        Employee employee = new Employee();
        Class aClass = employee.getClass();
//        MyAnnotation myAnnotation = (MyAnnotation) aClass.getAnnotation(MyAnnotation.class);
//        ArrayList<Person> people = new ArrayList<>();
//
//        Collections.sort(people, new ReverseAgeComparator<>(new AgeComparator()));
//
//        Collections.sort(people);

        List<? super A> aaa = new ArrayList<Object>();
        aaa.add(new Person());
        aaa.add(new Employee());
        aaa.add(new A());

        List<? extends A> extend = new ArrayList<Person>();
        System.out.println(aaa.toString());
        System.out.println();
//        List<? super Integer> numbers = new ArrayList<Number>();

//        numbers.add(1);

//        SortedSet<String> set = new TreeSet<>(Arrays.asList("Z","B", "C", "A", "A"));
//        set.forEach(s -> System.out.println(s));
    }

//    public static void aa(int a, Employee employee) {
//        System.out.println();
//    }

    public static double aa(int zz, Employee z ) {
        return 1;
    }

    public static Double aa(Employee aaa, int a) {
        return null;
    }
    static final class aa {

    }
     public <Employee> Employee run(Employee a) {
        return a;
     }

}