### Design Principles

## Solid Java

Design principles encourage us to create more maintainable, understandable, and flexible software. Consequently, 
as our applications grow in size, we can reduce their complexity

### Single Responsability

**A class should only have one responsibility. Furthermore, it should only have one reason to change.**

In `BookV1` the print method violates the SRP. For this reason the `BookV2` is amended to remove the method and 
`BookPrinter` is implemented a separate class that is concerned only with printing.

Not only have we developed a class that relieves the Book of its printing duties, but we can also leverage our 
`BookPrinter` class to send our text to other media.

### Open for Extension, Closed for Modification

**Classes should be open for extension, but closed for modification.**

After the first implementation of `Guitar`, we want to add in a second implementation, a flame pattern.
It might be tempting to just open up the `Guitar` class and add a flame pattern – but who knows what errors that might 
throw up in our application.

Following OCP we create `SuperCoolGuitarWithFlames` by extending the Guitar class we can be sure that our existing 
application won't be affected.

### Liskov Substitution

**If class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior 
of our program.**

Defined a `Car` interface, we have implemented a `MotorCar`. We want to introduce electric cars which by definition
is a car without the engine. `ElectricCar` is the implementation. This a violation of Liskov substitution principle.

One possible solution would be to rework our model into interfaces that take into account the engine-less state of 
our `Car`   

### Interface Segregation Principle

**Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need 
to be concerned about the methods that are of interest to them**

We define a `BearKeeper` class. As avid zookeepers, we're more than happy to wash and feed our beloved bears. 
However, we're all too aware of the dangers of petting them.

Only the crazy zookeepers can do that. But with this implementation we force every zookeepers to pet bears.

We create 3 new interfaces  `BearCleaner`, `BearFeeder` and `BearPetter`.

Now, thanks to interface segregation we can implement `BearCarer` and `CrazyPerson`.

### Dependency Inversion Principle

**The principle of Dependency Inversion refers to the decoupling of software modules. This way, instead of high-level 
modules depending on low-level modules, both will depend on abstractions.**

In `Windows98Machine` class by declaring the `StandardKeyboard` and `Monitor` with the new keyword, we've tightly 
coupled these 3 classes together

Not only does this make our Windows98Computer hard to test, but we've also lost the ability to switch 
out our StandardKeyboard class with a different one should the need arise. And we're stuck with 
our Monitor class, too.

To implement DI we:

- adding a more general Keyboard interface
- rewrite it to `Windows98MachineDI`   

Now our classes are decoupled and communicate through the Keyboard abstraction. If we want, we can easily switch out 
the type of keyboard in our machine with a different implementation of the interface. 
We can follow the same principle for the Monitor class.

We've decoupled the dependencies and are free to test our Windows98Machine 
with whichever testing framework we choose.