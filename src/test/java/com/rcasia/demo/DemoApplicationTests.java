package com.rcasia.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DemoApplicationTests {

  @Test
  void trivialTest() {
    assertEquals(1, 1);
  }

  @ParameterizedTest
  @CsvSource({ "1", "2", "3" })
  void testNumbers(int i) {
    assertEquals(i, 3);
  }

}
