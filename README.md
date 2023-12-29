# 6CS002-portfolio-task-4

## Reflection and Unit Testing

The aim of this assessment is two-fold. Firstly, you will learn about the Java Reflection API. Secondly, you will use the Reflection API for something useful, a unit testing tool.

## Exploration of Reflection

The first lecture on this topic contains a series of programs that demonstrate features of the Reflection API. You should use these examples as inspiration to explore things that will be necessary to implement your unit testing system. To do this you must do the following:

• Write a class that you can use as the focus for your experiments. It should have similar features to the Simple class used in the lecture but should use a primitive data type other than integer. It must have both public and private members to enable you to perform positive and negative tests. It should be novel, i.e. different to everybody in the class'.
• Write a series of classes that experiment with various aspects of the API. After writing each class commit it along with a suitable log message that explains what it demonstrates.

## A Unit Testing Framework

Using JUnit, KUnit and ShapeUnit2 for inspiration, write your own unit testing framework. This should include features that are similar to JUnit assertions accompanied by text base reporting (i.e. don’t waste time developing a GUI). A list of possible features is shown below and their relative importance can be determined from the marking criteria. You should ask for feedback on your ideas and work during scheduled classes. You must write code that demonstrates your framework being applied to test your simple class.
• Simple assertions and reporting. You will need to write a class similar to KUnit that will form the basis of your testing framework and is capable of making assertions on data belonging to a type other than integer. Records of successful and failed assertions should be maintained and output at the end of testing.
• Launcher. All methods beginning with the prefix “check” being run by the framework. You should implement similar behaviour in your framework and write code to demonstrate it being used. The examples on calling methods using reflection that were given in the lecture should provide inspiration on how to do this.
• Resilience to exceptions. Your framework should not misbehave if a test causes an exception. Exceptions should be caught and recorded in reports.
• Complex assertions. In the reflection lecture a technique for accessing instance variables and calling methods of an object, regardless of visibility, was demonstrated. Using similar techniques you should include in your framework features for calling the methods and accessing the instance variables of a given object. Your method will need to include the name of the method or variable to be accessed and type information. Following from this you should implement assertions that specify the members and data types to be accessed and expected values.
• Logging (optional). You should use the features of a logging API to improve the reporting of your framework. You should discuss your ideas with your tutor.
