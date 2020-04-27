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