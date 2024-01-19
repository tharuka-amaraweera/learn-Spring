# Spring ApplicationContext

- use when we are creating an `enterprise-level application or web application` (not for simple applications likeBeanFactory)
- whatever features provided by BeanFactory are also provided by ApplicationContext.


## ApplicationContext Features
- provide enterprise-specific functionalities
- Publishing events to registered listeners by resolving property files.
- Methods for accessing application components.
- Supports Internationalization.
- Loading File resources in a generic fashion.

`it is because of these additional features, developers prefer to use ApplicationContext over BeanFactory. `

## Types of Application containers
1. AnnotationConfigApplicationContext container
2. AnnotationConfigWebApplicationContext
3. XmlWebApplicationContext
4. FileSystemXmlApplicationContext
5. ClassPathXmlApplicationContext

### 1. AnnotationConfigApplicationContext
- introduced in Spring 3.0
- accepts classes annotated with **@Configuration, @Component, and JSR-330 compliant classes**
- constructor accepts one or more classes.
  - Ex: in the below declaration, two Configuration classes, 
    - Appconfig and AppConfig1 are passed as arguments
- beans defined in later classes `(AppConfig1)` will override the same type and name beans in earlier classes`(AppConfig)` when passed as arguments.
  -  Ex: AppConfig and AppConfig1 have the same bean declaration. The bean defined in AppConfig1 overrides the bean in AppConfig.

```
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig1.class);
```
- Add the following to the properties file in the IDE to `allow the spring to override beans`

for AnnotationConfigWebApplicationContext , XmlWebApplicationContext &FileSystemXmlApplicationContext read more

### 5. AnnotationConfigApplicationContext
- used to load XML-based Spring Configuration files from the classpath.
- The following code shows how to create a container and use the XML as metadata information to load the beans.
```
ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext/student-bean-config.xml");
StudentService studentService = context.getBean("studentService", StudentService.class);
```
## Implementation
1. Create Student class & AppConfig class 
   - AppConfig is the configuration class that contains all the Java beans configured using Java Based Configuration.
2. Now the Main Application class at the root contains the creation of a container.
3. The SpringApplication.run() method in the Main Application class
   - by default this method in the main class is provided when the SpringBoot project is created
   - It creates the container, creates beans, manages dependency injection and life cycle of those beans.
   - This is done using `@SpringBootApplication annotation.`
