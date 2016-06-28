package com.byteslounge.slickrepo.utils

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class ClassUtilsTest extends FlatSpec with Matchers {

  "The Class Utils" should "assert that two instances are of the same class" in {
    val one: Int = 3;
    val other: Int = 4;
    val result = ClassUtils.sameClass(one, other)
    result should equal (true)
  }

  it should "assert that two instances are not of the same class" in {
    val one: Int = 3;
    val other: Long = 4;
    val result = ClassUtils.sameClass(one, other)
    result should equal (false)
  }

  it should "assert that a given reference is null" in {
    val result = ClassUtils.isNull(null)
    result should equal (true)
  }

  it should "assert that a given non-null reference is not null" in {
    val one: Int = 3
    val result = ClassUtils.isNull(one)
    result should equal (false)
  }

}