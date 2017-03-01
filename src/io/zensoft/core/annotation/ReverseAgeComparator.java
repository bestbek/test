package io.zensoft.core.annotation;

import java.util.Comparator;

/**
 * Created by Myktybek on 2/11/17.
 */
public class ReverseAgeComparator<T> implements Comparator<T> {

    private final Comparator<T> comparator;

    public ReverseAgeComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(T left, T right) {
        return comparator.compare(left, right) * -1;
    }

}
