# Spring IOC

- core of spring framework
- manage entire lifecycle of Objects / Beans (creates, Configure, manage dependencies)
- It gets the information about the objects from a 
  - configuration file(XML) or Java Code or Java Annotations and Java POJO class.

## 2 types of IoC Containers
- BeanFactory
- ApplicationContext

( if you want to use an IoC container in spring whether we need to use a BeanFactory or ApplicationContext. )

## relationship of BeanFactory & ApplicationContext
- BeanFactory is the most **basic version** of IoC containers
- ApplicationContext **extends** the features of BeanFactory

## main features of Spring IoC
- Creating Object for us, 
- Managing our objects, 
- Helping our application to be configurable, 
- Managing dependencies
