# SDI with Map
- This is done by the container calling setter methods on beans after invoking a no-argument constructor or no-argument static factory method to instantiate the bean. 
- We need to use <property> sub-element of <bean> tag for setter injection.
```
<bean id="beanId" class="BeanClass"> 
<property name="secondBean" ref="SecondBean"/> 
<property name="message" value="This is message."/> 
</bean>

```

- Through setter injection using <property> tag, we can provide values like Strings, Primitives, Collections, etc. based on our requirement. 
- In this example, we will see setter injection using Map. 
- While we are using the map, we need to use `<map>` and `<entry>` tags to set the values to it

```
<bean id="beanId" class="BeanClass"> 
		<property name="name" value="geeks" /> 
		<property name="name2"> 
			<map> 
				<entry key="key1" value="value1"/> 
				<entry key ="key2" value-ref="DataSource"/> 
			</map> 
		</property> 
</bean>

```
## Implementation
1. Create InfoBean.java
2. create applicationContext.xml:
3. create InfoBeanTest.java