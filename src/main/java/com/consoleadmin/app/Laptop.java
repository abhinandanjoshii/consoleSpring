package com.consoleadmin.app;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    //initialise value in the xml properties
    //xml also wants sequence
    // or can specify index.
    //    <beans xmlns="http://www.springframework.org/schema/beans"
    //    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    //    xsi:schemaLocation="
    //    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    //
    //<!--	<bean id="alien1" class="com.consoleAbhi.Alien" scope="singleton">  -->
    //
    //	<bean id="alien1" class="com.consoleAbhi.Alien" >
    //<!--		<constructor-arg value="21"></constructor-arg>
    //            <constructor-arg ref="lap1"></constructor-arg> -->
    //
    //<!--		<constructor-arg type="com.consoleAbhi.Laptop" ref="lap1"/>
    //		<constructor-arg type="int" value="21"/> -->
    //
    //<!--		<constructor-arg index="1" ref="lap1"/>
    //		<constructor-arg index="0" value="21"/> -->
    //
    //		<constructor-arg name="lap" ref="lap1"/>
    //		<constructor-arg name="age" value="21"/>
    //            when 2 ref in constructer
    //
    //
    //<!--		<property name="lap" ref="lap1"></property>	-->
    //	</bean>
    //
    //
    //	<bean id="lap1" class="com.telusko.Laptop">
    //	</bean>
    //
    //	<bean id="lap2" class="com.telusko.Laptop">
    //	</bean>
    //
    //</beans>
    public Laptop(){
        System.out.println("Laptop Object Created");
    }

    public void compile()
    {
        System.out.println("Compiling");
    }

}
