The `==` tests the immediate value of the variable. So for reference types, it gonna tests it's memory address.

It's better override the `equals` method for every new class using the following properties:

* **Treatment of Null**: x.equals(null) = false
* **Reflexivity**: x.equals(x) = true
* **Symmetry**: x.equals(y) = y.equals(x)
* **Transitivity**: for x.equals(y) and y.equals(z), then x.equals(z)