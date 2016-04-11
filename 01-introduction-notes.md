
# Introduction

* Applications consist of *Activities* and *Layouts*. 
* An activity is a instance of the `Activity` class that the Android SDK provides. 
* Developers write _sublcasses_ of `Activity` to implement the functionality that your application requires. 
* A _layout_ defines a set of user interface objects and their position on the screen.
* A layout is made of elements defined in XML.
* **Activities** are the Java implementation and management of the **Layout** you define in XML.

#### App Names: The Reverse DNS

Package names for applications use the reverse DNS structure. This convention is designed to create application package names uniqure.

#### Targetting SDK Version 23+

* If we target Marshmallow (Android 6.0) whichn is SDK version 23 or newer...
* We have to support runtime applicaiton permission requests.
* This can make life really confused at the start.
* Let's not target Marshmallow... _yet_.
* **Soon** we will dive into the deliciousness of Marshmallow. _Core skills first_.
