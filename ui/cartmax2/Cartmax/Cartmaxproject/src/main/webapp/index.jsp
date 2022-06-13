<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xmlns:context = "http://www.springframework.org/schema/context"
   xmlns:mvc="http://www.springframework.org/schema/mvc"  
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context-3.0.xsd
   http://www.springframework.org/schema/mvc  
   http://www.springframework.org/schema/mvc/spring-mvc.xsd">  
  
  <context:component-scan base-package="com.example.Controller"/>
   <mvc:annotation-driven/>
   
   <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver" name="viewResolver">
   <property name="prefix" value="/WEB-INF/jsp/"></property>
   <property name="suffix" value=".jsp"></property>
   </bean>
   </beans>
