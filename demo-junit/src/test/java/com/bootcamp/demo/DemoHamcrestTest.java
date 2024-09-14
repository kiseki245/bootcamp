package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import java.util.List;

import org.junit.jupiter.api.Test;

// import com.junit.App;

// !!! assertThat
public class DemoHamcrestTest {
  
  @Test
  void test(){
    // MatcherAssert.assertThat(1 + 2, Matchers.equalTo(3));
    assertThat(App.sum(1, 2), is(equalTo(3)));
    
  }

  @Test
  void testList(){
    List<String> strings = List.of("abc", "ijk", "xyz");
    assertThat(strings, hasSize(3));
    // !!! contains() -> contains all with ordering
    assertThat(strings, contains("abc", "ijk", "xyz"));
    assertThat(strings, not(contains("abc", "xyz", "ijk")));
    // !!! containsAnyOrder() -> contains all with ordering
    assertThat(strings, containsInAnyOrder("abc", "xyz", "ijk"));
    // !!! hasItem
   //  assertThat(strings, hasItem("abc", "xyz"));
    // !!! isEmpty
    assertThat(strings, is(not(empty())));

  }

  // @Test
  // void testArray(){
  //   String[] arr = new String[] {"apple", "banana", "orange"};
  //   assertThat(arr, arrayContaining("apple", "banana", "orange"));
    
  // }

}
