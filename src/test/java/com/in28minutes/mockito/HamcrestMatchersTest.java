package com.in28minutes.mockito;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {

    @Test
    public void test(){
        List<Integer> scores = Arrays.asList(99 , 100 , 101, 105);
        //scores has 4 items
        assertThat(scores , hasSize(4));
        assertThat(scores , hasItems(100, 101));

        //everyItem : >90
        assertThat(scores , everyItem(greaterThan(90)));
        //everyItem : < 200
        assertThat(scores , everyItem(lessThan(200)));

        //String
        String str = "";
        assertThat(str, is(emptyString()));
        assertThat(null, is(nullValue()));

        Integer[] marks = {1, 2, 3};
        assertThat(marks, arrayContaining(1 , 2 , 3));
        assertThat(marks, arrayContainingInAnyOrder(3 , 2 , 1));
        //assertThat(marks, arrayContainingInAnyOrder( 2 , 1));

    }

}
