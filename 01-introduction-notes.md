
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

## Widgets

**Widgets** are the building blocks you use to create a user interface with. If you create a default application in Android Studio, you are presented two widgets for your first layout - `RelativeLayout` and `TextView`. Using the Android SDK, we can configure the appearance and behaviour of widgets. Each widget is an instance of the `View` class (or one of its subclasses, such as `ImageView` or `TextView`).

##### Common Widget Attributes

Let's become familiar with a few common attributes (which are better known as properties of an object) that we'll see.

* `layout_width` with values such as `match_parent` (the content will match the parent's size) and `wrap_content` (only as large as content requires)
* `layout_height` with values such as `match_parent` and `wrap_content`
* `padding` with values measured using `dp`
* `orientation` with values that allow content to be rendered in a `horizontal` or `vertical` fashion
* `text` with any **String** value, such as `Hello world!` or `Hi, grandpa!` 

##### Widgets are written as XML

Each widget is declared as an **XML element**. Each _attribute_ is an property of that widget. 

## View Hierarchy

Widgets compose a hierarchy of `View` objects named **view hierarchy**. There will always be a _root_ (or base) element. This will typically be a layout (`LinearLayout`, `RelativeLayout`, `FrameLayout`, or `TableLayout`). These _layouts_ inherit from a subclass of `View` named `ViewGroup`. Widgets are then contained inside of these _groups of views_, or as we know them, `ViewGroup`s.
