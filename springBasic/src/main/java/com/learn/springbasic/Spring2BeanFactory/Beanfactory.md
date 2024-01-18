# Spring – BeanFactory
- BeanFactory interface is the simplest container providing an advanced configuration mechanism to 
  - instantiate, configure, and manage the life cycle of beans.
- BeanFactory represents a basic IoC container which is a **parent interface of ApplicationContext.**
- BeanFactory loads the bean definitions and dependency amongst the beans based on a 
  - configuration file(XML) or 
  - the beans can be directly returned when required using Java Configuration. 
- `BeanFactory does not support Annotation-based configuration whereas ApplicationContext does.`
- Recommend to use BeanFactory for lightweight  applications
  - like mobile & applets

# Implementation
1. Bean Definition: Create a Student POJO class.
2. XML Bean Configuration: Configure the Student bean in the bean-factory-demo.xml file.
3. Main Class (BeanFactoryDemo.java)