# Spring Dependency Injection

- Ensures loosely coupling between classes
  - Loose coupling between classes can be possible by defining `interfaces` for common functionality.
  - and the injector will instantiate the objects of required implementation. 
  - The task of instantiating objects is done by the container according to the configurations specified by the developer.

## 2 Types of DI
1. Setter Dependency Injection (SDI)
2. Constructor Dependency Injection (CDI)

## SDI Vs CDI
<table>
<tr>
<th>Setter DI</th>
<th>Constructor DI</th>
</tr>
<tr>
<td>Use <b>property</b> tag in the bean-config file</td>
<td>Use <b>constructor-arg</b> tag in the bean-config file</td>
</tr>
<tr>
<td>done by the container calling setter methods on beans after invoking a no-argument constructor or no-argument static factory method to instantiate the bean.</td>
<td>done by the container invoking a constructor with a number of arguments, each representing a dependency.</td>
</tr>
<tr>
<td>Poor readability as it adds a lot of boiler plate codes</td>
<td>Good readability as it is separately present in the code</td>
</tr>
<tr>
<td>The bean must include getter and setter methods for the properties.</td>
<td>The bean class must declare a matching constructor with arguments. 
<br><br>Otherwise BeanCreationException will be thrown.</td>
</tr>
<tr>
<td>Requires addition of @Autowired annotation, above the setter in the code and hence, it increases the coupling between the class and the DI container.</td>
<td>Best in the case of loose coupling with the DI container as it is not even required to add @Autowired annotation in the code.(Implicit constructor injections for single constructor scenarios after spring 4.0)</td>
</tr>
<tr>
<td>Circular dependencies or partial dependencies result with Setter DI because object creation happens before the injections.</td>
<td>No scope for circular or partial dependency because dependencies are resolved before object creation itself.</td>
</tr>
<tr>
<td>Preferred option when properties are less and mutable objects can be created.</td>
<td>Preferred option when properties on the bean are more and immutable objects (eg: financial processes) are important for application.</td>
</tr>
</table>