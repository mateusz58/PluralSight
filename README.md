# Java Interview Questions #

- [Java Interview Questions](#java-interview-questions)
  - [General Questions](#general-questions)
    - [Regular expression](#regular-expression)
    - [Memory management](#memory-management)
    - [Clean code](#clean-code)
    - [Exercices](#exercices)
  - [File operations](#file-operations)
  - [OOP Questions](#oop-questions)
  - [Exceptions](#exceptions)
  - [Algorithms and Data Structures / Collections / Generics](#algorithms-and-data-structures--collections--generics)
    - [Algorithms complexions](#algorithms-complexions)
    - [Collection](#collection)
    - [Map](#map)
    - [Stack](#stack)
    - [Streams and Lambdas](#streams-and-lambdas)
      - [Execrices](#execrices)
    - [Concurrency](#concurrency)
      - [Threads](#threads)
    - [Design Patterns](#design-patterns)
      - [Creational patterns](#creational-patterns)
      - [Structural design patterns](#structural-design-patterns)
      - [Behavioral design patterns](#behavioral-design-patterns)
      - [Design pattern connection questions](#design-pattern-connection-questions)
    - [Spring boot design pattern](#spring-boot-design-pattern)
    - [Java EE](#java-ee)
    - [Spring](#spring)
      - [Spring core questions](#spring-core-questions)
      - [Spring beans questions:](#spring-beans-questions)
      - [Annotations:](#annotations)
      - [Spring configuration](#spring-configuration)
      - [Spring batch service](#spring-batch-service)
      - [Spring security](#spring-security)
      - [Spring WEB questions](#spring-web-questions)
        - [Spring MVC](#spring-mvc)
        - [Rest Controller questions:](#rest-controller-questions)
      - [Spring Data access](#spring-data-access)
        - [Spring JPA](#spring-jpa)
        - [Spring JDBC](#spring-jdbc)
        - [Hibernate](#hibernate)
        - [MongoDB](#mongodb)
      - [Logger](#logger)
      - [Spring code examples](#spring-code-examples)
    - [Generic WEB](#generic-web)
      - [Execices](#execices)
    - [SQL and relational database](#sql-and-relational-database)
      - [SQL Language](#sql-language)
      - [Testing:](#testing)
      - [Transactions general questions](#transactions-general-questions)
        - [Spring stransaction handling](#spring-stransaction-handling)
      - [Core questions:](#core-questions)
      - [Exercices](#exercices-1)
    - [Generic Questions](#generic-questions)
    - [Exercises](#exercises)
      - [Pangrams (Simple)](#pangrams-simple)
      - [Balanced Parentheses (Medium)](#balanced-parentheses-medium)
    - [Testing](#testing)
      - [Junit questions](#junit-questions)
      - [Core questions](#core-questions)
      - [Mockito](#mockito)
      - [Integration tests](#integration-tests)

## General Questions

* [what is the difference between Integer.parseInteger and Integer.valueOf?](https://stackoverflow.com/questions/508665/difference-between-parseint-and-valueof-in-java)
* [What is transient variable?](https://www.java67.com/2012/08/what-is-transient-variable-in-java.html)
* [What is binary search and when to use it?](https://www.javatpoint.com/binary-search-in-java)
* [What is the the difference between hot spot and hot swap?](https://stackoverflow.com/questions/16568253/difference-between-jvm-and-hotspot)
* [What is the difference between object from reference and variable](https://www.samouczekprogramisty.pl/referencja-sterta-garbage-collector/)
* [Why is not possible to use primitives as generic types ?](https://stackoverflow.com/questions/2721546/why-dont-java-generics-support-primitive-types)
* What other String based classes do you know?
    1. [String joiner](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/StringJoiner.html)
* [What are JAVA annotations and how to make them?](https://dzone.com/articles/how-annotations-work-java)
*
* When do we use Object variables and when literals?
* [What is the differecne between StringBuilder and StringBuffer?](https://www.samouczekprogramisty.pl/string-cache-i-stringbuilder-w-praktyce/)
* What is constructor chaining in JAVA?
* [Whats the point of using interface?](https://www.evernote.com/shard/s516/sh/46c7e6b7-756d-4827-a50a-a51c0c6c9805/4f286434c1d6829a2c3fce260e4d4694)
* [What is the difference between equals() and == in Java?](https://www.evernote.com/shard/s516/client/snv?noteGuid=a124eaee-231a-4966-806c-01ae611b4fbc&noteKey=d327986e5d2855cbe5579f4ad94fd547&sn=https%3A%2F%2Fwww.evernote.com%2Fshard%2Fs516%2Fsh%2Fa124eaee-231a-4966-806c-01ae611b4fbc%2Fd327986e5d2855cbe5579f4ad94fd547&title=How%2Bdo%2BI%2Bcompare%2Bstrings%2Bin%2BJava%253F)
* [Explain public static void main(String args[]) in Java](https://www.edureka.co/blog/interview-questions/java-interview-questions/#explain-public-static-void-main)
* [Explain JDK JRE and JVM](https://www.edureka.co/blog/interview-questions/java-interview-questions/#Jdk-Jre-and-Jvm)
* [Is Java *pass-by-value* or *pass-by-reference* ?](https://www.javaworld.com/article/2077424/learn-java-does-java-pass-by-reference-or-pass-by-value.html)
* Write a Java method to swap the values of two integer values (*Is it possible ?*):
```Java
public void swap(int x, int y) { /** code here **/ }
```
* What is a *primitive type* in Java ? What are the main *primitive types* ?
* [What is *auto-boxing/unboxing* ?](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)
* [What is *implicit casting* ? What is *explicit casting* ?](https://www.quora.com/What-is-the-difference-between-the-implicit-type-casting-and-explicit-type-casting-in-C++)
* If developing an e-commerce site, what is the recommend type to use for the *price* if performance is not an issue. What is performance is an issue ?
* Explain the usage of the following keywords: `strictfp`, `native`.
* Explain the usage of the following keyword: `final`.
* Can you give example of a `final` class from the Java Standard library ?
* What is the difference between `==` and `equals()` ?
* [Whats is a marker interface?](https://kodilla.com/pl/bootcamp-module/254/86/4606#151-singleton-zadanie-singleton-sluzacy-do-zapisywania-logow-z-wykonanych-operacji)
* [What is operator "?"](https://www.baeldung.com/java-ternary-operator)
* [What does List<?> mean in java generics?](https://stackoverflow.com/questions/1844770/what-does-list-mean-in-java-generics)
* [What is java reflection invocation?]()
* [What is the difference between component scan and enable autoconfiguration?](https://stackoverflow.com/questions/35005158/)


### Regular expression 
* [What ways of dealing with regular expression do you know?](https://stackoverflow.com/questions/19409708/pattern-matcher-vs-string-split-which-should-i-use)
* [Regular expression](https://www.samouczekprogramisty.pl/wyrazenia-regularne-w-jezyku-java/)


### Memory management
* [What are different types of garbage collector in JAVA?](https://javapapers.com/java/types-of-java-garbage-collectors/)
* * [What are the key memory segments inside JVM ? Explain **HEAP**, **STACK**.]()
* [What is a **Memory Leak** ? How can a memory leak appear in **garbage collected** language ?](https://www.baeldung.com/java-memory-leaks)

### Clean code
* [Name YAGNI statements](https://www.martinfowler.com/bliki/Yagni.html)
* [What are the SOLID statements?](https://scotch.io/bar-talk/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
* What final statement change respectfully for class method and variable?
* [KISS and DRY principles?](https://dzone.com/articles/software-design-principles-dry-and-kiss)

### Exercices

* [What is the output of following program?](https://pastebin.com/uuFJ1wYt)

## File operations

* [What kind of File library has the best performance?](https://itnext.io/using-java-to-read-really-really-large-files-a6f8a3f44649)

## OOP Questions

* Can we implement multiple interfaces?
* How would you solve a problem of multiple inheritance?
* What is a **constructor** ?
* What is the **default constructor** ?
* Explain the the concept of *Inheritance*. Why doesn't Java supports the concept of *Multiple Inheritance* ?
* What is **Polymorphism** ?
* What is **Overloading** ? What is **Overriding** ?
* What is the output if we execute the following code:
    - https://pastebin.com/VhP32mKj
* Can a `static` method be overwritten ?
* Explain the concept of *Encapsulation*.
* How would you encapsulate the following class:
    - https://pastebin.com/WjAsheJP
* What is *immutability* ?
* How can we write an **Immutable** class ?
* Explain of the concept of **Marker Inteface**.
* Explain the concept of **Serialization**.
* Explain how the keyword **transient** works.
* Explain the concept behind the **Cloneable** interface and how does it work.
* What is the output if we execute the following code:
    - https://pastebin.com/ks2Xp1JR
* What is the output if we execute the following code:
    - https://pastebin.com/EKqGFx9u
* What is a *Java Interface* ?
* Does an interface `extends` or `implements` another interface ?
* What is a *Java Abstract Class* ?
* Does a *Java Abstract Class* `extends` or `implements` another *Java Abstract Class* ?
* Explain the usage of the `default` keyword (Java 8 onwards).
* With the introduction of the `default` keyword are there any reasons to use *Abstract Classes* instead of *Interfaces* ?
* [What does the generic nature of the class Class\<T> mean? What is T?](https://stackoverflow.com/questions/9406025/what-does-the-generic-nature-of-the-class-classt-mean-what-is-t)
* [What is the good way of dealing with method overloading by implementing interface?](https://stackoverflow.com/questions/15843645/how-would-i-overload-method-in-an-interface)
* [What is the point of implementing static interface in java?](https://www.geeksforgeeks.org/static-method-in-interface-in-java/)
* [What is the pont of using static block?](http://namiekko.pl/2018/01/24/stale-w-javie-final-static-i-niemodyfikowalnosc/)

## Exceptions

* Error and Exception differences
* Handle java exceptions
* Difference betwwen checkded exception and unchecked
* Purpose of keywords final finally and finalize
* Difference betwwen throw and thorws
* Exception hierarchy
* Custom Exception
* Important methods of Java Exception Class
* [How to handle multiple exceptions on one block?](https://www.journaldev.com/629/java-catch-multiple-exceptions-rethrow-exception)
* [What is block try with resources and when do we use it?](https://www.samouczekprogramisty.pl/konstrukcja-try-with-resources-w-jezyku-java/)
* What are context managers?
* **Unchecked Exceptions** vs. **Checked Exceptions**.
* What are the differences between **Exceptions** and an **Errors** ? Are there any similitudes ?
* Name 3 **Unchecked Exceptions**.
* Name 3 **Checked Exceptions**.
* What are **Java Annotations** ?
* [Why is it recommended to use try with resources over try catch finally?](https://devcave.pl/effective-java/preferuj-try-with-resources)
* [Name some important methods of JAVA Exception Class](https://www.tutorialspoint.com/java/java_exceptions.htm)
* [what is run time exception?](http://www.speedypc.com/articles/runtime_exception.aspx)


## Algorithms and Data Structures / Collections / Generics

### Algorithms complexions

* Explain the **O(n) Notation** (Big O).

### Collection

* [What are the operations for which a **LinkedList** is more efficient than an **ArrayList** ?](https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java)
* What is the difference between **CopyOnWriteArrayList**, **Vector** and **ArrayList** ?
* Are there any **Immutable** Collection Classes ?
* [What is TreeSet and TreeMap and when to use it?](http://jsystems.pl/blog/artykul.html?id=145)
* [What is the difference between vecotr and arraylist in java?](https://javapapers.com/core-java/java-collection/difference-between-vector-and-arraylist-in-java/)

### Map
* [What is hashtable in java?](https://javapapers.com/core-java/java-hashtable/)
* What is map and name few classes that implement Map interface?
* [What is the best way to convert user defined object to hashmap?](https://www.mkyong.com/java/java-convert-object-to-map-example/)
* Explain how a **HashMap** is implemented. What is the relationship between *equals()* and *hashCode()*.
* How does a **WeakHashMap** works ? What are the main differences between a **WeakHashMap** and a **HashMap** ?
* What are the key differences between a **HashMap** and **ConcurrentHashMap** ?
* Explan the differecne between hashmap and Hashset
* Does a **Set** accepts `null` as an element ?

### Stack

* How does a **Stack** data-structure works ? Are there any standard Java Stack implementations ?
* Recursively calculate the sum of numbers from a `List<Integer>` (don't use for/do/while loops).
* Explain the concept of **Type Erasure**.
* Explain the following data structures: *List*, *Map*, *Queue*, *Set*.
* Name a few implementations for each interface:

| List<T>    | Set<T>     | Map<K,V>     | Queue<T>  |
| ------  | ------  | ------  | ------ |
|         |         |         |        |
|         |         |         |        |
|         |         |         |        |
|         |         |         |        |

* What is the output if we run the following code:
* What are *hash collisions* ?
* What is the difference between an `Iterator` and `ListIterator` ?
* What is a **RingBuffer** ?
* What happens if we run the following code:
    - https://pastebin.com/S5xaficT

### Streams and Lambdas

* [What is a **Functional Interface** ?](https://kodilla.com/pl/bootcamp-module/254/82/4606#submodule-338)
* [Can you please explain what is a **Predicate**, **Consumer**, **Function**, **Supplier** ?](https://kodilla.com/pl/bootcamp-module/254/82/4606#submodule-338)
* What is the difference between a **Stream** and an **Iterator** ?
* Using the `filter()` method write a method that returns only the positive numbers from a `List<Integer>`.
* What is a `parallelStream()` ? How is different from a standard `stream()` ?
* Find out the max element from a `List<Integer>` using the `reduce()` method.
* Find out the sum of elements from a `List<Integer>` using the `reduce()` method.
* [Whats is the difference between skip and limit in streams and what do we use for each method?](https://www.geeksforgeeks.org/stream-skip-method-java-examples/)
* [How to use if statements in streams java?](https://www.baeldung.com/java-8-streams-if-else-logic)

#### Execrices
* [What is the output if we run the following code:](https://pastebin.com/mVpK6UHm)
* [What is the output of following program?](https://pastebin.com/jpqG8LKZ)

### Concurrency

#### Threads

* What is a Thread ?
* Is the `++` operator thread-safe ?
* How can we implement a Thread ?
* How *synchronized* keyword works ?
* How is the method `thread.join()` working ?
* Explain the concept of **Thread Starvation** ?
* Explain the concept of **Thread Pool** ?
* What can you tell about the **Executor Interface** ?
* [What is a *Semaphore* in Java ?](https://www.baeldung.com/java-semaphore)
  * [Implementation](concurrency/src/main/java/core-java-concurrency-basic/src/main/java/com/baeldung/concurrent/semaphore/SemaPhoreDemo.java)
* What is the output if we execute the following code? :(https://pastebin.com/FpUJtVJJ)
* How can you ensure that N threads can access N resources without a deadlock?
* [What is thread life cycle?](https://www.baeldung.com/java-thread-lifecycle)
  * [New State implementation](concurrency/src/main/java/core-java-concurrency-basics-2/src/main/java/com/baeldung/concurrent/threadlifecycle/NewState.java)
  * [Blocked State](concurrency/core-java-concurrency-basics-2/src/main/java/concurrent/threadlifecycle/BlockedState.java)
  * [RunnableState](concurrency/core-java-concurrency-basics-2/src/main/java/concurrent/threadlifecycle/RunnableState.java)
  *  [TerminatedState](concurrency/core-java-concurrency-basics-2/src/main/java/concurrent/threadlifecycle/TerminatedState.java)
  *  [WaitingState](concurrency/core-java-concurrency-basics-2/src/main/java/concurrent/threadlifecycle/WaitingState.java)
  *  [TimedWaitingState](concurrency/core-java-concurrency-basics-2/src/main/java/concurrent/threadlifecycle/TimedWaitingState.java)
### Design Patterns


#### Creational patterns
* [Factory](https://refactoring.guru/design-patterns/factory-method)
* [Prototype](https://refactoring.guru/design-patterns/prototype)
* [Singleton](https://refactoring.guru/design-patterns/singleton)
* [Builder](https://refactoring.guru/design-patterns/builder)
  * [How to use builder pattern in lombok?](https://stackoverflow.com/questions/36909672/how-to-use-lombok-builder-annotation-on-methods)
* [Abstract factory](https://refactoring.guru/design-patterns/abstract-factory)

#### Structural design patterns
* [Decorator](https://refactoring.guru/design-patterns/decorator)
* [Adapter](https://refactoring.guru/design-patterns/adapter)
* [Bridge](https://refactoring.guru/design-patterns/bridge)
* [Flywieght](https://refactoring.guru/design-patterns/flyweight)
* [Proxy](https://refactoring.guru/design-patterns/proxy)
* [Composite](https://refactoring.guru/design-patterns/composite)
* [facade](https://refactoring.guru/design-patterns/facade)

#### Behavioral design patterns
* [Chain of responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)
* [Command](https://refactoring.guru/design-patterns/chain-of-responsibility)
* [Iterator](https://refactoring.guru/design-patterns/iterator)
* [Mediator](https://refactoring.guru/design-patterns/mediator)
* [Memento](https://refactoring.guru/design-patterns/memento)
* [State](https://refactoring.guru/design-patterns/state)
* [Strategy](https://refactoring.guru/design-patterns/strategy)
* [Template](https://refactoring.guru/design-patterns/template-method)
* [Visitor](https://refactoring.guru/design-patterns/visitor)

#### Design pattern connection questions
* Whats is the difference between proxy and adapter design pattern
* Most common usage of builder design pattern
* How can singleton design pattern help with concurreny?
* [How can you use Singleton Design Pattern in JavaFx ?](https://blog.axxg.de/javafx-stage-singleton/)


### Spring boot design pattern
* IOC
* Dependency injection
* Repository

### Java EE

* What is a Servlet ?
* What are the main methods of a HttpServlet ?
* What are the main bean scopes ? Explain the following annotations: `@RequestScoped`, `@SessionScoped`, `@ApplicationScoped`, `@Dependent`, `@Conversation` .
* What is the main difference between a Servlet and Filter ?

### Spring

#### Spring core questions

* [What is spring context?](https://dzone.com/articles/what-is-a-spring-context)
* [What is the difference between spring and spring boot?](https://dzone.com/articles/understanding-the-basics-of-spring-vs-spring-boot)
* [What is inversion of control?](https://stackoverflow.com/questions/3058/what-is-inversion-of-control)
* What is @SpringBoot annotation?:
  * [Stackoverflow source](https://stackoverflow.com/questions/36387265/disable-all-database-related-auto-configuration-in-spring-boot)
  * [Integration tests](https://konstructcomputers.blogspot.com/2018/10/slimming-down-spring-boot-app-for.html)
* [Explain component scan](https://www.greycampus.com/blog/programming/top-spring-interview-questions-and-answers)
* [What is application context?](https://stackoverflow.com/questions/9689131/what-does-application-context-in-spring-do)*check
* [How to switch *.properties file that you are referencing to?](http://prntscr.com/pi2ht5)
* What is Spring?
* List benefits of IOS?
* Explain Spring Boot architecture
* [Explain the concept of *Inversion of Control*. What is the **Spring IoC Container** and name types of IOC containers ?](http://www.javaexpress.pl/article/show/Spring__kontener_wstrzykiwania_zaleznosci)
* [Explain the concept of *Dependency Injection* (in Spring). and name a few kind of dependency injections](http://www.javaexpress.pl/article/show/Spring__kontener_wstrzykiwania_zaleznosci)
* What are the main advantages and disadvantages for *setter dependency injection* vs *constructor dependency injection* ?
* Explain working of `@Value` annotation and example of its usages:
    1. [Example of usages of Values annotation in Spring](http://prntscr.com/pfp4hj)
* Explain how the `@Async` annotations functions.
* What is **Spring Boot** ?
* What is **Spring Integration** ?
* What is **Spring Batch** ?
* What is spring boot stereotype? *check
* [Explain how bean works in spring boot](https://www.codingame.com/playgrounds/2096/playing-around-with-spring-bean-configuration) *check
* [Name the types of transaction management that Spring supports?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
* [What are the different features of Spring Framework?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
* [What is spring configuration file?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)

#### Spring beans questions:

  * [Define bean wiring](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
  * [Explain inner beans in spring](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
  * * Explain how the following Spring Annotations are working: `@Autowired`, `@Qualifier`, `@Required`.
  * What is the difference betwwen @Repository @RestController and @Service
  * [What do you understand by auto wiring and name the different modes of it?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
  * [What are the limitations with auto wiring?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
  * [What is the point of using ApplicationContext class?](https://kodilla.com/pl/bootcamp-module/254/85/4606#141-inversion-of-control-i-dependency-injection-zadanie-bean-forumuser)
  * [What is circular dependencies in spring?](https://www.baeldung.com/circular-dependencies-in-spring)
  * [How to create bean on some conditions in spring boot?](https://iamninad.com/conditional-bean-creation-in-spring-boot/)

  #### Annotations:

  * [What’s the difference between @Component, @Controller, @Repository & @Service annotations in Spring?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
  * [What is Qualifier annotation?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)


#### Spring configuration

* [How to manage and configure in spring boot?](https://docs.spring.io/spring-boot/docs/1.4.0.M3/reference/htmlsingle/#boot-features-testing-spring-boot-applications-detecting-config)
* What is spring @Configuration and @Autoconfiguration annotation? *check
* Explain the concept of **Spring Profiles**.
* [What is the difference between @Profile and @ActiveProfiles?](https://stackoverflow.com/questions/44055969/in-spring-what-is-the-difference-between-profile-and-activeprofiles)
*  [Explain the concept of ContextConfiguration](https://www.concretepage.com/spring-5/contextconfiguration-example-spring-test#XML)
* [What is the difference between @ComponentScan and @EnableAutoConfiguration in Spring Boot?](https://stackoverflow.com/questions/35005158/what-is-the-difference-between-componentscan-and-enableautoconfiguration-in-sp)


#### Spring batch service

* [What is batch processing when to use it and how to use it?](https://spring.io/guides/gs/batch-processing/) *check

#### Spring security

* What is spring security?
* [What is the difference between authentication and authorization](https://medium.com/datadriveninvestor/authentication-vs-authorization-716fea914d55)
* [What is the differecne between authenticated and fully authenticated](https://stackoverflow.com/questions/30953241/difference-between-isauthenticated-and-isfullyauthenticated)
* [How would you test basic authentication?](https://www.baeldung.com/spring-security-integration-tests)
* [What is csrf?](https://pl.wikipedia.org/wiki/Cross-site_request_forgery)
* [When do we need csrf?](https://stackoverflow.com/questions/2023395/rest-and-csrf-cross-site-request-forgery)
* What kind of authentication are known to you?
* [What is cors?](https://sekurak.pl/czym-jest-cors-cross-origin-resource-sharing-i-jak-wplywa-na-bezpieczenstwo/)
* What kind of authorization methods do you know name advantages and disadvantages of famous authorization method?
* [What are token and what kind of tokens are you familiar with?](https://i.imgur.com/HIXbBeB.png)
* [What is token structure?](https://i.imgur.com/qXrtWr8.png)
* [What is SSL?](https://pl.wikipedia.org/wiki/Transport_Layer_Security)

#### Spring WEB questions

##### Spring MVC


* [What do you mean by Spring MVC framework?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
* [Describe dispatcher servlet](https://www.edureka.co/blog/interview-questions/spring-interview-questions/))
* [Explain WebApplicationContext.](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)

##### Rest Controller questions:

* [ In Spring MVC framework, what is controller?](https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
* [What is the difference between @RequestParam and @PathVariable and when should we use each for Rest Controller?](https://prnt.sc/pev3zk)
* [What is Request Mapping used for?](https://www.baeldung.com/spring-requestmapping)
*

#### Spring Data access
* What are transactions?
* What is DAO support?
* What is ORM?
* What kind of ORM are you familiar with?

##### Spring JPA
* What is spring data jpa?

##### Spring JDBC

* What is the difference between jdbc and hibernate? *check
* When should we use jdbc and when should we use hibernate? *check
* What kind of jdbc operations can we do?
* Which classes are present in spring JDBC API?(https://www.edureka.co/blog/interview-questions/spring-interview-questions/)
*

##### Hibernate

* What is hibernate?
* Benefits of using hibernate?
* Hibernate architecture?
* Get and load differences?
* Advantages of Hibernate over JDBC?
* [How to load hibernate to postgresql through properties file?](http://prntscr.com/pih0dn)
* Explain how cache works in hibernate? * 2 levels of caching
* In what case should we use HQL?
* What are the ways by which Hibernate can be accessed using Spring?

##### MongoDB

#### Logger

* Whats is the difference between logger and appender?
* What kind of loggers are you familiar with?
* Why you shouldnt use system.out.println?


#### Spring code examples
* [How to export schema to SQL server via hibernate?]
* [Try to explain what is wrong in following code:](http://dolszewski.com/spring/spring-boot-application-properties-file/)

    - *https://pastebin.com/mL5BNGCj*




### Generic WEB

* What is API?
* What is REST?
* [Name all known to you HTTP methods](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods)
* [What are some common HTTP return decisions?](https://raw.githubusercontent.com/for-GET/http-decision-diagram/master/httpdd.png)
* What is **JWT** ? How does **JWT** works ?
* Where is recommended to store **JWT** tokens received from the Server on the client-side ?
* What are the main HTTP verbs ?
* What is the difference between **POST** and **PUT** ?
* What is the difference between **POST** and **PATCH** ?
* What is the difference between **POST** and **GET** ?
* When do we use TRACE? *check

#### Execices

* You have to develop a *REST API* for a book store. This API needs to implement CRUD-like operations. How would you design the API ?

| Operation | HTTP VERB | ENDPOINT |
| --------- | --------- | -------- |
| Add a book | | |
| Remove a book | | |
| List books with pagination | | |
| Edit a book | | |
| Get info for a book | | |

### SQL and relational database

#### SQL Language

* [What ways of joining other tables you know and what is the point of doing that?](https://www.sqlpedia.pl/laczenie-tabel-sql/)
* How to create trigger and whats the point of creating trriggers?
* [What is the best way to check whether record exist in database?](https://stackoverflow.com/questions/7471625/fastest-check-if-row-exists-in-postgresql)
* [What is the best way to return id if inseted invoice by SQL command?](https://pastebin.com/kNydLaBT)
* [How to get latest inserted id?](https://pastebin.com/kNydLaBT)
* [How to get last inserted row from table?](https://pastebin.com/8p1LUDj1)
* [How to perform Cascade deleting in database?](https://stackoverflow.com/questions/129265/cascade-delete-just-once)
* [What are database indexes?](https://www.w3schools.com/sql/sql_create_index.asp)

#### Testing:
* Whats is the best way to test database? H2 or docker by directly connecting to database* Explaining

#### Transactions general questions

* What are the main transactions paradigms?
* Explain the level of isolations

##### Spring stransaction handling

* What are spring transactional mode handling?
* How to set transaction mode in spring?


#### Core questions:
* [Most important questions regarding relational database](https://docs.google.com/document/d/1S72Ra0LEmx_eSTolzGUMKGKXT3nrzMWeNueXAiP0mA8/edit?fbclid=IwAR05z0W-lMP0WsdO-YOlVu2n13r9JVEeMIhlnIZS7vSGPYHFtpBKvdft81Q#heading=h.bnaxkgncp1t9)
* [How to declare loop and while statements in SQL and when should we use it?](http://www.postgresqltutorial.com/plpgsql-loop-statements/)

#### Exercices

*Given the following SQL table:*

| id | full_name | mng_id |
| -- | --------- | ------ |
| 100 | Patrick Read | 101 |
| 101 | Bradley Hayes | `null` |
| 102 | Kieran Bennett | 101 |
| 103 | George Barnes | 101 |
| 104 | Alex Griffiths | 102 |
| 105 | Issac Jacobs | 102 |
| 106 | Will Mack | 104 |

*Write an SQL query that returns the following result:*

| id | full_name | mng_full_name |
| -- | --------- | ------------- |
| 100 | Patrick Read | Bradley Hayes |
| ... | ............ | ............. |

*Write an SQL query that returns one row containing the manager with the most direct subalterns.*

### Generic Questions
* From a protocol perspective what is the difference between **UDP** and **TCP** ?
* What library would use to write a Scheduler in Java ?
* What are the main **Maven** alternatives ?
* What are the main **JUnit** alternatives ?
* How is **Mockito** used ? Are there any other alternatives to **Mockito**
* What is **Continuous Integration** (CI) ?
* Name other **JVM**-based languages ?
* What is **Functional Programming** ? Can you give a few examples of Functional Programming languages ?

### Exercises

#### Pangrams (Simple)

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.
Given a sentence s, tell Roy if it is a pangram or not.

**Input Format**
Input consists o a string s.
Example:
```
We promptly judged antique ivory buckles for the next prize
```

**Output Format**
Output a line containing “pangram” if s is pangram, otherwise print “not pangram”.
Example:
```
pangram
```

#### Balanced Parentheses (Medium)

Given a sequence consisting of parentheses, determine whether the expression is balanced.
A sequence of parentheses is balanced if every open parentheses can be paired uniquely with a closed parentheses that occurs after the former. Also, the interval between them must be balanced. You will be given three types of parentheses: (, {, and [.


```
{[()]} - This is a balanced parentheses.
{[(])} - This is not a balanced parentheses.
```

Example:

**Input**
```
3
{[()]}
{[(])}
{{[[(())]]}}
```

**Ouput**
```
YES
NO
YES
```

### Testing

#### Junit questions
*  What is the point of doing junit tests?
*  [Please explain what it is and how to use and explain the concept of @RunWith](https://www.logicbig.com/tutorials/unit-testing/junit/runner.html)

* [What is extension context interface?](https://junit.org/junit5/docs/current/api/org/junit/jupiter/api/extension/ExtensionContext.html)


#### Core questions

* [What are some common testing in spring boot improvements?](https://spring.io/blog/2016/04/15/testing-improvements-in-spring-boot-1-4)
*

#### Mockito

* [What @inject annotation do]
* [What is the differecne between Mockito.mock() vs @Mock vs @MockBean](https://www.baeldung.com/java-spring-mockito-mock-mockbean)
* [Common mockito questions:](https://www.softwaretestinghelp.com/mockito-inteview-questions/)
1. [Why do we need mocking?](https://www.toptal.com/java/a-guide-to-everyday-mockito)
2. When do we use @injectMock, @Mock and @MockBean?
3. [When and how should we mock?](https://blog.codecentric.de/en/2018/03/mock-what-when-how/)
4. Difference between doReturn and thenReturn.
5. [When and why should a spy be used?](https://www.toptal.com/java/a-guide-to-everyday-mockito)
6. Why can’t static methods be mocked using Mockito?
7. What’s the need to verify that the mock was called?
8. What is good testable code?
9. What are the limitations of Mockito?
10. Which frameworks can support mocking Private and Static methods?
11. Mocking/Stubbing default methods in Interface in Java 8.
12. [How can order of stub invocations be verified in Mockito?](https://www.toptal.com/java/a-guide-to-everyday-mockito)
13. Returning multiple values against consecutive method calls
14. What are the different types of mocking frameworks and how do they work?
15. [When is it better not to use mockito?](http://prntscr.com/px5vng)

#### Integration tests


1. [What are F.I.R.S.T principles?](https://pivotal.io/application-modernization-recipes/testing/spring-boot-testing-best-practices)
2. Do integration tests for game would make sense? *check
3. Do mockito tests would make sense for making a game?*check
4. [Whats is the point of doing integration tests?](https://reflectoring.io/spring-boot-test/)
5. [Example of doing integration test for BasicAuth](https://www.baeldung.com/spring-security-integration-tests)
6. What kind of integration tests in SpringBoot do you know?
7. What is the point of using @SpringBootTest annotation?
8. What are WebMvC test?
9.  What is SpringBoot Tests?
10. What are TestRestTemplate?
11. What is the difference between @SpringBootTest and @ExtendWith?
12. What is the differecne webMVC test and testResttemplate?




