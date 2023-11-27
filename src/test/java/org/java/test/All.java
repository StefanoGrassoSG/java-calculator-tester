package org.java.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({CalculatorTest.class, TicketTest.class})
public class All {
}