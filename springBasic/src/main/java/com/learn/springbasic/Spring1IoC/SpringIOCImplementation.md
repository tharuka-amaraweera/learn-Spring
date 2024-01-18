# Spring IOC Example Explenation

- we have one interface named Sim and it has some abstract methods calling() and data().
- we have created another two classes Airtel and Jio which implement the Sim interface and override the interface methods.
- now call these methods inside the main method. So by implementing the Run time polymorphism concept
```
public class Mobile {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating instance of Sim interface
        // inside main() method
        // with reference to Jio class constructor
        // invocation
        Sim sim = new Jio();
 
        // Sim sim = new Airtel();
 
        sim.calling();
        sim.data();
    }
}
```
- But what happens if in the future another new Sim Vodafone came and we need to change again to the child class name in the code, like this
```
Sim sim = new Vodafone();
```
- Without doing changes in source code how to make this configurable?
- ## Here Spring IoC comes into the picture
  - Here we use **ApplicationContext** to implement an IoC container
  - we have to create an XML file and name the file 
    - Ex: “beans.xml“ (beansConfiguration.xml)
  -  In the beans.xml file, we have created beans.
    - inside the id -> pass unique id
    - inside the classn-> pass the class name which you want to create the object / bean
    - 