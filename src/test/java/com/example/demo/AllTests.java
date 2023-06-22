package com.example.demo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ EntityTest.class, HandlingUserAuthenticationApplicationTests.class })
public class AllTests {

}
