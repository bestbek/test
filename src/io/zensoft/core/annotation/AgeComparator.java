package io.zensoft.core.annotation;

import java.util.Comparator;

/**
 * Created by Myktybek on 2/11/17.
 */
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person left, Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
