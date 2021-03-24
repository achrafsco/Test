package com.yoann.calcul;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class CalculsTest {

	@Test
	void test() {
		if (new File("C:\\Users\\test\\Desktop\\apache-tomcat-9.0.14-windows-x64\\apache-tomcat-9.0.14\\logs\\catalina.2021-03-24.log").exists())
		{
			System.out.println("Found file for tomcat logs");
		}
		else
		{
			fail("Not yet implemented");
		}
	}

}
