Using the miliseconds or nanoseconds (through `nanoTime`) between the start of the execution to the end of execution.

But, the results can vary between machines and between runnings, depending on the OS scheduler.

Not really recommended, because are hard to form some kind of abstraction based on this.

To form an abstraction, we need to define a set of primitive operations and count the number of these operations.

Each algorithm can be associated to a function `f(n)`, where it's formula is denoted from the number of primitive operations the algorithm performs. 

Designing for the worst case leads to stronger algorithmic, because it gonna performs better even for the best case.