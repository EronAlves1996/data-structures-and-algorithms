package com.eronalves.exercisestests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.eronalves.tamasiaexs.IsEven;
import com.eronalves.tamasiaexs.IsMultiple;

/**
 * PrimerTests
 */
public class PrimerTests {

  @Test
  public void testIsMultiple() {
    assertTrue(IsMultiple.isMultiple(25, 5));
    assertFalse(IsMultiple.isMultiple(26, 5));
  }

  @Test
  public void testIsEven() {
    assertTrue(IsEven.isEven(20));
    assertFalse(IsEven.isEven(15));
  }
}
