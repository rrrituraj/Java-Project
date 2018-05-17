package com.tcs.Java8;

import java.util.Collections;
import java.util.List;

/**
 * Created by RITURAJ on 20-07-2017.
 */
public class MyStudentClass implements StudentInterface {
    @Override
    public Integer getMax(List<Integer> intList) {
        Integer max= Collections.max(intList);
        return max;
    }
}
