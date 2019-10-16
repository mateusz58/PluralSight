# Java Interview Questions #

- [Java Interview Questions](#java-interview-questions)
  - [General Questions](#general-questions)
  - [File operations](#file-operations)
  - [OOP Questions](#oop-questions)
  - [Exceptions](#exceptions)
  - [Algorithms and Data Structures / Collections / Generics](#algorithms-and-data-structures--collections--generics)
    - [Streams and Lambdas](#streams-and-lambdas)
    - [Concurrency](#concurrency)
      - [Threads](#threads)
    - [Design Patterns](#design-patterns)
      - [Design pattern connection questions](#design-pattern-connection-questions)
    - [Java EE](#java-ee)
    - [Spring](#spring)
      - [Spring core questions](#spring-core-questions)
      - [Spring configuration](#spring-configuration)
      - [Spring batch service](#spring-batch-service)
      - [Spring security](#spring-security)
      - [Spring WEB questions](#spring-web-questions)
      - [Spring Data access](#spring-data-access)
        - [Spring JPA](#spring-jpa)
        - [Spring JDBC](#spring-jdbc)
        - [Hibernate](#hibernate)
        - [MongoDB](#mongodb)
      - [Logger](#logger)
      - [Spring code examples](#spring-code-examples)
    - [Generic WEB](#generic-web)
    - [SQL and relational database](#sql-and-relational-database)
      - [Testing:](#testing)
      - [Core questions:](#core-questions)
      - [Exercices](#exercices)
    - [Generic Questions](#generic-questions)
    - [Exercises](#exercises)
      - [Pangrams (Simple)](#pangrams-simple)
      - [Balanced Parentheses (Medium)](#balanced-parentheses-medium)
    - [Testing](#testing)
      - [Core questions](#core-questions)
      - [Mockito](#mockito)
      - [Integration tests](#integration-tests)



## General Questions

* [What is the difference between object from reference and variable](https://www.samouczekprogramisty.pl/referencja-sterta-garbage-collector/)

* What other String based classes do you know?
    1. [String joiner](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/StringJoiner.html)
* [What are JAVA annotations and how to make them?](https://dzone.com/articles/how-annotations-work-java)
* What final statement change respectfully for class method and variable?
* Name YAGNI statements
* Name some important methods of JAVA Exception Class
* What are different types of garbage collector in JAVA?
* When do we use Object variables and when literals?
* [What is the differecne between StringBuilder and StringBuffer?](https://www.samouczekprogramisty.pl/string-cache-i-stringbuilder-w-praktyce/)
* What is constructor chaining in JAVA?
* What is inversion of control?
* What are the SOLID statements?
* [Whats the point of using interface?](https://www.evernote.com/shard/s516/sh/46c7e6b7-756d-4827-a50a-a51c0c6c9805/4f286434c1d6829a2c3fce260e4d4694)
* [What is the difference between equals() and == in Java?](https://www.edureka.co/blog/interview-questions/java-interview-questions/#difference-between-equals-and==)
* [Explain public static void main(String args[]) in Java](https://www.edureka.co/blog/interview-questions/java-interview-questions/#explain-public-static-void-main)
* [Explain JDK JRE and JVM](https://www.edureka.co/blog/interview-questions/java-interview-questions/#Jdk-Jre-and-Jvm) 
* [What are the key memory segments inside JVM ? Explain **HEAP**, **STACK**.]()
* [What is a **Memory Leak** ? How can a memory leak appear in **garbage collected** language ?]
* Is Java *pass-by-value* or *pass-by-reference* ?
* Write a Java method to swap the values of two integer values (*Is it possible ?*):
```Java
public void swap(int x, int y) { /** code here **/ }
```
* What is a *primitive type* in Java ? What are the main *primitive types* ?
* What is *auto-boxing/unboxing* ?
* What is *implicit casting* ? What is *explicit casting* ?
* If developing an e-commerce site, what is the recommend type to use for the *price* if performance is not an issue. What is performance is an issue ?
* Explain the usage of the following keywords: `strictfp`, `native`.
* Explain the usage of the following keyword: `final`.
* Can you give example of a `final` class from the Java Standard library ?
* What is the difference between `==` and `equals()` ?
* Whats is a marker interface?
* [What does List<?> mean in java generics?](https://stackoverflow.com/questions/1844770/what-does-list-mean-in-java-generics)


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

## Exceptions

* Error and Exception differences
* Handle java exceptions
* Difference betwwen checkded exception and unchecked
* Purpose of keywords final finally and finalize
* Difference betwwen throw and thorws
* Exception hierarchy
* Custom Exception
* Important methods of Java Exception Class
* [What is block try with resources and when do we use it?](https://www.samouczekprogramisty.pl/konstrukcja-try-with-resources-w-jezyku-java/)
* What are context managers?
* **Unchecked Exceptions** vs. **Checked Exceptions**.
* What are the differences between **Exceptions** and an **Errors** ? Are there any similitudes ?
* Name 3 **Unchecked Exceptions**.
* Name 3 **Checked Exceptions**.
* What are **Java Annotations** ?


## Algorithms and Data Structures / Collections / Generics

* Explain the **O(n) Notation** (Big O).
* How does a **Stack** data-structure works ? Are there any standard Java Stack implementations ?
* Recursively calculate the sum of numbers from a `List<Integer>` (don't use for/do/while loops).
* Why is not possible to use primitives as generic types ?
* Explain the concept of **Type Erasure**.
* Explain the following data structures: *List*, *Map*, *Queue*, *Set*.
* Explan the differecne between hashmap and Hashset
* Name a few implementations for each interface:

| List<T>    | Set<T>     | Map<K,V>     | Queue<T>  |
| ------  | ------  | ------  | ------ |
|         |         |         |        |
|         |         |         |        |
|         |         |         |        |
|         |         |         |        |

* What is the output if we run the following code:
* Explain how a **HashMap** is implemented. What is the relationship between *equals()* and *hashCode()*.
* What are *hash collisions* ?
* What are the operations for which a **LinkedList** is more efficient than an **ArrayList** ?
* What is the difference between **CopyOnWriteArrayList**, **Vector** and **ArrayList** ?
* What are the key differences between a **HashMap** and **ConcurrentHashMap** ?
* How does a **WeakHashMap** works ? What are the main differences between a **WeakHashMap** and a **HashMap** ?
* Does a **Set** accepts `null` as an element ?
* What is the difference between an `Iterator` and `ListIterator` ?
* Are there any **Immutable** Collection Classes ?
* What is a **RingBuffer** ?
* What happens if we run the following code:
    - https://pastebin.com/S5xaficT

### Streams and Lambdas

* What is a **Functional Interface** ?
* Can you please explain what is a **Predicate**, **Consumer**, **Function**, **Supplier** ?
* What is the difference between a **Stream** and an **Iterator** ?
* Using the `filter()` method write a method that returns only the positive numbers from a `List<Integer>`.
* What is a `parallelStream()` ? How is different from a standard `stream()` ?
* Find out the max element from a `List<Integer>` using the `reduce()` method.
* Find out the sum of elements from a `List<Integer>` using the `reduce()` method.
* What is the output if we run the following code:
```java
    public static void main(String[] args) {
        final List<String> l = new LinkedList<>();

        l.add("A");
        l.add("B");
        l.add("C");

        l.stream().forEach(e -> {
            l.add("Z");
            System.out.println(e);
        });
    }
```
* What is the output if we run the following code: 
```java
    public static void main(String[] args) throws InterruptedException {

        List<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");

        ListIterator<String> iterator = list.listIterator();

        for (int i = 0; i < list.size(); i++) {
            CompletableFuture.runAsync(() -> System.out.println(iterator.next()));
        }

        Thread.sleep(2000);
    }
```

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
* What is a *Semaphore* in Java ?
* What is the output if we execute the following code? :(https://pastebin.com/FpUJtVJJ)
### Design Patterns
* Singleton
* Builder
* Factory
* Visitor
* Chains of resposibility
* Memory pattern
* Repository pattern
* Proxy
* Strategy
* Decorator
* Facade
* Dependency injection
#### Design pattern connection questions
* Whats is the difference between proxy and adapter design pattern
* Most common usage of builder design pattern
* How can singelton design pattern help with concurreny?


### Java EE

* What is a Servlet ?
* What are the main methods of a HttpServlet ?
* What are the main bean scopes ? Explain the following annotations: `@RequestScoped`, `@SessionScoped`, `@ApplicationScoped`, `@Dependent`, `@Conversation` .
* What is the main difference between a Servlet and Filter ?

### Spring

#### Spring core questions

* [Explain component scan](https://www.greycampus.com/blog/programming/top-spring-interview-questions-and-answers)*Explanation
* [What is application context?](https://stackoverflow.com/questions/9689131/what-does-application-context-in-spring-do)*Explanation
* [How to switch *.properties file that you are referencing to?](http://prntscr.com/pi2ht5)
* What is Spring?
* Explain Spring Boot architecture
* [Explain the concept of *Inversion of Control*. What is the **Spring IoC Container** ?](http://www.javaexpress.pl/article/show/Spring__kontener_wstrzykiwania_zaleznosci)
* [Explain the concept of *Dependency Injection* (in Spring). and name a few kind of dependency injections](http://www.javaexpress.pl/article/show/Spring__kontener_wstrzykiwania_zaleznosci)
* What are the main advantages and disadvantages for *setter dependency injection* vs *constructor dependency injection* ?
* Explain how the following Spring Annotations are working: `@Autowired`, `@Qualifier`, `@Required`.
* Explain working of `@Value` annotation and example of its usages:
    1. [Example of usages of Values annotation in Spring](http://prntscr.com/pfp4hj)
    
* Explain how the `@Async` annotations functions.
* Explain the concept of **Spring Profiles**.
* What is **Spring Boot** ?
* What is **Spring Integration** ?
* What is **Spring Batch** ?
* What is spring @Configuration and @Autoconfiguration annotation?
* What is spring boot stereotype?
* [What is the difference between @Profile and @ActiveProfiles?](https://stackoverflow.com/questions/44055969/in-spring-what-is-the-difference-between-profile-and-activeprofiles)
* [Explain how bean works in spring boot](https://www.codingame.com/playgrounds/2096/playing-around-with-spring-bean-configuration)

#### Spring configuration

* [How to manage and configure in spring boot?](https://docs.spring.io/spring-boot/docs/1.4.0.M3/reference/htmlsingle/#boot-features-testing-spring-boot-applications-detecting-config)


#### Spring batch service

* [What is batch processing when to use it and how to use it?](https://spring.io/guides/gs/batch-processing/)
* 

#### Spring security

* What is spring security?
* [What is the difference between authentication and authorization](https://medium.com/datadriveninvestor/authentication-vs-authorization-716fea914d55)
* [What is the differecne between authenticated and fully authenticated](https://stackoverflow.com/questions/30953241/difference-between-isauthenticated-and-isfullyauthenticated)
* [How would you test basic authentication?](https://www.baeldung.com/spring-security-integration-tests)
* [What is csrf?](https://pl.wikipedia.org/wiki/Cross-site_request_forgery)
* [When do we need csrf?](https://stackoverflow.com/questions/2023395/rest-and-csrf-cross-site-request-forgery)
* What kind of authentication are known to you?
* What kind of authorizations are knows to you?

#### Spring WEB questions

* [What is the difference between @RequestParam and @PathVariable and when should we use each for Rest Controller?](https://prnt.sc/pev3zk)
* [What is Request Mapping used for?](https://www.baeldung.com/spring-requestmapping)

#### Spring Data access
* What are transactions?
* What is DAO support?
* What is ORM?

##### Spring JPA
* What is spring data jpa?

##### Spring JDBC

* What is the differecne between jdbc and hibernate?*Explanation
* When should we use jdbc and when should we use hibernate?
* What kind of jdbc operations can we do?  

##### Hibernate

* What is hibernate
* Benefits of using hibernate
* Hibernate architecture
* Get and load differences
* Advantages of Hibernate over JDBC
* [How to load hibernate to postgresql through properties file?](http://prntscr.com/pih0dn)
* Explain how cache works in hibernate? 

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
* You have to develop a *REST API* for a book store. This API needs to implement CRUD-like operations. How would you design the API ?

| Operation | HTTP VERB | ENDPOINT |
| --------- | --------- | -------- |
| Add a book | | |
| Remove a book | | |
| List books with pagination | | |
| Edit a book | | |
| Get info for a book | | |

### SQL and relational database

#### Testing:
* Whats is the best way to test database? H2 or docker by directly connecting to database* Explaining
* 


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


#### Core questions

* [What are some common testing in spring boot improvements?](https://spring.io/blog/2016/04/15/testing-improvements-in-spring-boot-1-4)
* 

#### Mockito

* [What @inject annotation do]
* [What is the differecne between Mockito.mock() vs @Mock vs @MockBean](https://www.baeldung.com/java-spring-mockito-mock-mockbean)
* [Common mockito questions:](https://www.softwaretestinghelp.com/mockito-inteview-questions/)
1. Why do we need mocking?
2. Difference between doReturn and thenReturn.
3. When and why should a spy be used?
4. Why can’t static methods be mocked using Mockito?
5. What’s the need to verify that the mock was called?
6. What is good testable code?
7. What are the limitations of Mockito?
8. Which frameworks can support mocking Private and Static methods?
9. Mocking/Stubbing default methods in Interface in Java 8.
10. How can order of stub invocations be verified in Mockito?
11. Returning multiple values against consecutive method calls
12. What are the different types of mocking frameworks and how do they work?

#### Integration tests


1. What are F.I.R.S.T principles 
2. Do integration tests for game would make sense?*Explain
3. Do mockito tests would make sense for making a game?*Explain
4. [Whats is the point of doing integration tests?](https://reflectoring.io/spring-boot-test/)
5. [Example of doing integration test for BasicAuth](https://www.baeldung.com/spring-security-integration-tests)
6. What kind of integration tests in SpringBoot do you know?
7. What is the point of using @SpringBootTest annotation?
8. What are WebMvC test?
9.  What is SpringBoot Tests?
10. What are TestRestTemplate?
11. What is the difference between following annotations: 
12. What is the differecne webMVC test and testResttemplate?



    
    