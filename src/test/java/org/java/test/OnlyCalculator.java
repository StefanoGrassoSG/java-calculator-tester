package org.java.test;


import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectPackages("org.java.test")
@IncludeClassNamePatterns(".*CalculatorTest")
@ExcludeClassNamePatterns(".*TicketTest")

public class OnlyCalculator {
}