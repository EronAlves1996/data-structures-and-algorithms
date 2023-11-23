Page 74 all from 1.18
Page 117 all from 2.18
Page 164 all from 3.16
Page 200 all from 4.15
Page 239 all from 5.14
Page 270 all from 6.11
Page 318 all from 7.7
Page 368 all from 8.3
page 388 to 427

### Answers not in code

### Chapter 1

#### 1.2

Java passes values by reference, so if we clone `GameEntry[]` from array A to B, and we set `A[4].score` to 550, `B[4].score` will be 550 too.

#### 1.13

The third credit card.

#### 1.14

```
function reverseIntArray(int[] array)
	for(int i = 0; i < array.length / 2; i++)
		var lastPosition = array.size() - 1 - i
		var temp = array[i]
		array[i] = array[lastPosition]
		array[lastPosition] = temp
```


#### 1.15

```java
void findSmallestAndLargest(int[] array){
  int smallest = Integer.MAX_VALUE;
  int largest = Integer.MIN_VALUE;

  for(int item: array){
    if(item < smallest) smallest = item;
    if(item > largest) largest = item
  }

  System.out.println("The smallest number is " + smallest);
  System.out.println("The largest number is " + largest);
}
```

### Chapter 2

#### 2.3

```java
public class MenuBar {

	HashMap<String, List<String>> submenus;
	
	public MenuBar(HashMap<String, List<String>> submenus){
		this.submenus = submenus;
	}

	public void onHover() {
	}

	public void onClick() {
	}
}
```

#### 2.4

It flawed because it is caught in an infinite loop, because if it's not charged and is bellow five, it gonna try to charge infinitely

#### 2.5

It doesn't depends on the visibility of the field. It gonna always flaw, because if not success, it gonna calls the same method again and not have any success

#### 2.6

```java
Progression fib = new FibonacciProgression(2, 2);
for(int i = 0; i < 7; i++) fib.advance();
System.out.println(fib.nextValue());
```

#### 2.7

Thinking about Long values, lets assume that we start the progression in 0 with 128 as step. This is a sum, and every increment represents a new step into a multiplication:

128 + 128 + 128 <=> 128 * 3

So to find this, we need the Long.MAX_VALUE from Java class:

![[Screenshot_2023-10-18-08-49-23_1280x720.png]]

It happens that 128 in fact is 2^7, and 128 * 128 is 2⁷ * 2⁷, that is 2^14. So, what if we can divide 2^63 / 2^7 ? We find that this is 2^(63 - 7), with the result of 2^56. That way, we can expand this to 2^7 eigth times. That way. 128 * 8 = 1024. We need 1024 calls to `nextValue` to have a Integer overflow.

#### 2.8

Two interfaces cannot mutually extend each other, because it gonna causes a circular dependency problem.

#### 2.9

A potential disadvantage is really have a really big vtable to look for functions of instances, when resolving at runtime. Another disadvantage is potential circular dependency. 


#### 2.10

A potential disadvantage maybe is low reuse of code. Much duplication of code.

#### 2.11

```
Read it.
Ship it.
Buy it.
Read it.
Box it.
Read it.
```

#### 2.12

[[Exercise 2-12.excalidraw]]

#### 2.13

It cannot be casted, because a Race is another different subclass of Horse, different from Equestrian. When try to cast, it gonna throws a ClassCastException.

https://www.baeldung.com/java-classcastexception

A subclass can be casted to a superclass, but cannot be casted to another subclass, or cannot be casted to a sibling class.

#### 2.14

```java
<T> void processArray(T[] array){
  var i = 0;
  while(true){
    try{
      var arrElement = array[i];
    } catch(Exception ex){
	  System.out.println("Don't try buffer overflow attacks in Java!");
	  break;
    }
    i++;
  }
}
```


#### 2.16

[[Drawing 2023-11-22 00.47.36.excalidraw]]


### Chapter 3

#### 3.3

First of all, we have to make sure how much gliphs the target alphabet have. After that, we could adapt the array and the codes with the gliphs, calculating  how to reach the base number to swap the chars for numbers and adapt the exercise.

#### 3.5

If we remove these two lines of code, consequently the pointer in tail will never get nullified. Even if the size of Linked List is 0, the tail will have a Node. However, the entire class will not break because of this and continue to work as expected, because the tail pointer is always manipulated when size is 0.

#### 3.6

```
findSecondToLast(head)
	if(head == null || head.next == null) return null;

	var actual = head;
	var next = head.next;
	var last = head.next.next;
	
	while(true)
		if(last == null) return actual;
		if(last.next == null) return next;
		actual = last;
		next = last.next;
		last = last.next.next;
```

By this algoritm:

1 -> 2 -> 3

head = 1
head.next = 2

actual = 1
next = 2
last = 3
last.next = null so it gonna return 2!!

1 -> 2 -> 3 -> 4 -> 5 -> 6

head = 1
head.next = 2

actual = 1
next = 2
last = 3

actual = 3
next = 4
last = 5

actual = 5
next = 6
last = null

last = nul, so it gonna return 5!!

#### 3.8

0 -> 1 -> 2 -> 3

3 0
2 1
1

0 -> 1 -> 2

0 2
1 1

We can do it by the following method:

We have two pointers, one that start at first node and one that starts at last node, an keep traversing each of them and adding every visited node in a visited set.
The end cursors traverses first. When a cursor finds a visited node, then the middle is finded. The end cursor need traverses first to find the right spot for even numbers of nodes on linked list

#### 3.13

1. One-dimensional Array
	1. They are the same
2. Two-dimensional array
	1. For shallow equals, it compare if the two arrays are composed  by the same reference
	2. For deep equals,  it will compare the items of each two dimensional array, and if they have the same size

#### 3.14

1. `var backup = Array.clone(original)`
2. `var backup = Arrays.stream(original).toArray()`
3. `var backup = new int[]{...original}` - maybe dont works


### Chapter 4
#### 4.1

![[log_chart.png]]

#### 4.2

It can be determined with the following inequation:

```
8nlogn <= 2n^2
8 * n * logn <= 2 * n^2
4 * (n * logn) / 2 <= n^2
2 * ((n * logn) / 2) ^ 1/2 <= n
((n * logn) / 2) ^ 1/2 <= n / 2
(n * logn) / 2 <= (n / 2)^2
(n * logn) / 2 <= n² / 4
n * logn <= n² / 4 * 2
logn <= (n² / 4 * 2) / n
logn <= (n² / n) / (4 / n) * (2 / n)
logn <= n / (4 / n) * (2 / n)
logn <= n / 8 / n
logn <= (n / 8) * (n / 1)
logn <= n² / 8
2^n²/8 <= n
2 <= n^1/n^2/8
2 <= n^8/n^2
```
n0 =  1

#### 4.3

It can be determined with the followign inequation

```
40n² <= 2n³
40 <= 2n
n >= 20
16000 >= 16000
para 19
14440 >= 13718
```


#### 4.4

f(x) = 1

#### 4.5

Simply because logaritmic functions are almost inverse of exponential functions, by simply saying log2 with basis 2, it's 1, that way 2¹ = 2

#### 4.6

The sum of all even numbers from 0 to 2n is better described in terms of arithmetic progression, such, we have a first term 0, and a last term 2n.

sum = (0 + 2n) * n / 2


#### 4.7

If f(n) = 1, so
Running time is O(1).
But worst case is O(1)

#### 4.8

Ordered from lower growth rate to greater

1. 2^10
2. 4n
3. 3n + 100logn
4. nlogn
5. 4nlogn + 2n
6. 2^logn
7. n²+10n
8. n³
9. 2^n


#### 4.9

Running time is O(n), because it iters over all n.
Lets say the assignment is O(1), sum is O(1), array acces is O(1) and a loop is O(n);
We have approximately: 4 + 3n. So its O(n).

#### 4.10

Running time is still O(n), even if advances 2 for every iteration.
Thinking about it, we have n elements, and for the run, the time we have is O(n/2),  which in fact is O(n * 1/2), which is O(n).


#### 4.11

Running time on this case O(n²), because it haves an outer loop and an inner loop, perharps the inner loop grows by the reason of outer loop, that way

loop 1
	loop
loop 2
	loop 
	loop
loop 3
	loop
	loop 
	loop

It means that maybe we have an O(n!) reason

#### 4.12

Running time is O(n)


#### 4.13

The first loop implies some sort of O(n). The second loop suggests a O(n²). The third loop implies some sort of O(n² + j)


#### 4.14

If d(n) is O(f(n)), then f(n) = d(n). That way, f(n) = ad(n), where a is constant, d(n) always represents the upper bound, regardless of a.

### Chapter 5

#### 5.1

```
algoritmo acharMaximo(arrayA):
	tamanho = arrayA.tamanho
	retorna arrayA[acharMaximo(arrayA, 0, 0)] 
	
metodo acharMaximo(arrayA, indiceMaximo, indiceAtual)
	se(indiceAtual >= arrayA.tamanho) retorna indiceMaximo
	se(arrayA[indiceAtual] > arrayA[indiceMaximo]) retorna acharMaximo(arrayA, indiceAtual, indiceAtual + 1)
	retorna acharMaximo(arrayA, indiceMaximo, indiceAtual + 1)
```

Running Time: O(n), because it traverses all elements
Space usage: O(n), because it mounts a stack trace for every element

#### 5.2

1. modify the function signature to return int
2. if low > high return -1
3. if(target == data[mid]) return mid;

#### 5.3

```
power(2,5)
	return 2 * power(2, 4)
		return 2 * power(2, 3)
			return 2 * power(2, 2)
				return 2 * power(2, 1)
					return 1
```

#### 5.4

```
power(2,18)
	partial = power(2, 9)
		partial = power(2, 4)
			partial = power(2, 2)
				partial = power(2, 1)
					partial = power(2, 0)
						return 1
					partial = 1
					return 1 * 1 * 2
				partial = 2
				return 2 * 2
			partial = 4
			return 4 * 4
		partial = 16
		return 16 * 16 * 2	
	partial = 512
	return 512 * 512
```

#### 5.5

```
reverseArray(data, 0, 4)
	reverseArray(data, 1, 3)
		reverseArray(data, 2, 2)
```


#### 5.6
```
PuzzleSolve(3, {}, {a,b,c,d})
	PuzzleSolve(2, {a}, {b,c,d})
		PuzzleSolve(1, {a, b}, {c, d})
		PuzzleSolve(1, {a, c}, {b, d})
		PuzzleSolve(1, {a, d}, {b, c})
	PuzzleSolve(2, {b}, {a,c,d})
		PuzzleSolve(1, {b, a}, {c, d})
		PuzzleSolve(1, {b, c}, {a, d})
		PuzzleSolve(1, {b, d}, {a, c})
	PuzzleSolve(2, {c}, {a,b,d})
		PuzzleSolve(1, {c,a}, {b, d})
		PuzzleSolve(1, {c,b}, {a, d})
		PuzzleSolve(1, {c,d}, {a, b})
	PuzzleSolve(2, {d}, {a,b,c})
		PuzzleSolve(1, {d, a}, {b, c})
		PuzzleSolve(1, {d, b}, {a, c})
		PuzzleSolve(1, {d, c}, {a, b})
```

#### 5.7

```
function harmonicNumber(int n)
	if(n == 1) return 1;
	return 1 / n + harmonicNumber(n - 1);
```


#### 5.8

```
funcion convertStringToIntRecursively(String num){
  chars = num.toCharArray()
  convertCharArrayToInt(chars, chars.length - 1, 1);
}

function convertCharArrayToInt(CharArray ca, int position, int multiplier){
	value = Integer.parseInt(ca[position]) * multiplier;
	if (position == 0) return value;
	return value + convertCharArrayToInt(ca, position - 1, multiplier * 10);
}
```

#### 5.10

We can walk through all the elements passing the position which it should access to the function. That way we have `sumWith(int[][] matrix, int x, int y)`, and we do the walk with this function, summing the actual element with the accessed element.

#### 5.11

```java
int computeLog(int n){
	if (n == 1) return 0;
	return 1 + computLog(n / 2);
}
```


#### 5.12

https://en.wikipedia.org/wiki/Element_distinctness_problem
According to wikipedia, we can use some form of Set to determine if the element already exists before, going for an O(n) complexity. Converting between recursive and iterative algorithms should be fine, wether if in some case it finds a repeated number, it returns false immediatelly. Otherwise, it continues to the end of the list and finally returns a true.


#### 5.13

```java
public static int product(int m, int n){
  if (n == 1) return m;
  return m + product(m, n - 1);
}
```

### Chpater 6

#### 6.1

1 - Every push operation adds 1, so, we count the size as + 25
2 - Every top operation dont modifies the stack
3 - Every pop operation diminishes the stack by 1, but we have 3 pops that returned null that should be subtracted by the count

So

```
PUSHES - (POPS - NULLS) = TOTAL
25 - (10 - 3) = TOTAL
TOTAL = 25 - 7
TOTAL = 18
```

#### 6.2

Push 25 times - t = 24
Top is null operation
Pop 10 times, but 7, because 3 of them returned null - t = 17

#### 6.3

push(5) -> void
push(3) -> void
pop() -> 3
push(2) -> void
push(8) -> void
pop() -> 8
pop() -> 2
push(9) -> void
push(1) -> void
pop() -> 1
push(7) -> void
push(6) -> void
pop() -> 6
pop() -> 7
push(4) -> void
pop() -> 4
pop() -> 9

#### 6.6

- For each `([{` theere should be an equals `}])`, matching the same order of appearance in a math expression.

#### 6.7

0 + 32  - (10 * 0) + (15 - 5) = 32 - 10 = 22

#### 6.8 

The value of f would be 10, because only successfully dequeues operations increment f, regardless of enqueues.



#### 6.9

* void
* void
* 5
* void
* void
* 3
* 2
* void
* void
* 8
* void
* void
* 9
* 1
* void
* 7
* 6

### Chapter 7
#### 7.1

| **Method**    | **Return value** | **List contents**            |
| --------- | ------------ | ------------------------ |
| add(0, 4) | void         | (4)                      | 
| add(0, 3) | void         | (3, 4)                   |
| add(0, 2) | void         | (2, 3, 4)                |
| add(2, 1) | void         | (2, 3, 1, 4)             |
| add(1, 5) | void         | (2, 5, 3, 1, 4)          |
| add(1, 6) | void         | (2, 6, 5, 3, 1, 4)       |
| add(3, 7) | void         | (2, 6, 5, 7, 3, 1, 4)    | 
| add(0, 8) | void         | (8, 2, 6, 5, 7, 3, 1, 4) |
 
#### 7.4

* size: size only returns the internal variable size, so it's really O(1)
* isEmpty: it only checks if size is equal to zero
* get: it only gets an element in the specified position on array
* set: it accesses the element int he specficied position on array and replaces it
* add: for add, it depends on position. If it is made on position 0, it would be the worst case, because all the subsequent elements should be moved in front. Add to it the fact that the array is not in the size, so, all the elements of the array should be copied to the new array, so iterating for all the elements
* remove: as for add, remove should move all elements to the left. If I remove to zero, this gonna be an empty space, so I need to iterate to all subsequent elements to move them one position left



#### 7.6

* For each push operation we need one cyber dolar
* Growing an array from size k, to size 2k, requires 3k cyber dolars
* Getting an array with size one, we gonna push one item to there, it needs one  cyber dolar
* When we go to push more one item, is needed 3 cyber dolars.
* Thus, we need to overcharge every item with 3 cyberdollars, that way every item that don't cause overflows need to pay 4 cyberdollars.
* That way:

A = 1 push 4 cyber dolars
Another push, we have 3 cyberdolars, and pay for it, grows to size 2, and the new item pay one cyber dolar and we have more 3 cyber dolars. One more push, we need to grow the array by two. But we need 6 cyberdolars, and we have only 3.

If we overcharge every item with more 4 cyberdolar, may be we have the amount required?

A = 1 push 5 cyber dolars, then we have 4 cyber dolar
A = 1 push causes overflow, to grow to two, we need 3 cyber dolar. Spends 4, and now we have 1. The new push pays more 5 cyberdolars, with the other one, we pay the last cyber dolar
a = 2 push causes overflow, to grow to 4, we need 6 cyber dolar, but we get only 5!

We need then to overcharge 5 cyberdolars.

A = 1 push 6 cyber dolar, spent 1, then we have 5 cyber doalr
A = 1, push causes overflow, needs 3 cyber dolar. We have 5, then we have 2 cyber dolar, the new item brings 6 cyber dolar and spent 1. Then we have 7 cyber dolar.
A = 2, push causes overflow, needs 6 cyber dolar. We have 7, then we have 1 cyber dolar, the new item brings 6 cyber dolar and spent 1. Then we have 6 cyber dolar.
A = 4, push 6 cyber dolar and spent 1. Then we have 11 cyber dolar.
A = 4, push causes overflow, needs 12 cyber dolar. We have 11!!!

We need then to overcharge 6 cyberdolars.

A = 1, push 7 cyberdolar, spent 1, then we have 6 cyber dolar
A = 1, push causes overflow, needs 3 cyber dolar. We have 6, then we have 3 cyber dolar, the new item brings 7 and spent 1. The we have 9 cyber dolar.
A = 2, push causes overflow, needs 6 cyber dolar. We have 9, then we have 3 cyber dolar. The new item brings 7 and spent 1. Then we have 9 cyber dolar.
A = 2,  push 7 cyber dolar, spent 1. We have then 15 cyber dolar.
A = 2, push cuases overflow, needs 12 cyber dolar. We have 15. Then we have 3 cyber doalr. The new item brings 7 and spetn 1. Then we have 9 cyber dolar.

Each operation should be charged to 7 cyberdolar for it work.

### Chapter 8

#### 8.1

a - `/user/rt/courses`
b - 
	- `cs016/`
	- `cs252`
	- `/user/rt/courses`
	- `homeworks`
	- `programs`
	- `projects`
	- `papers`
	- `demos`
c - It has 3 descendantes
d - It has only one ancestor https://stackoverflow.com/a/10095171
e - Nodes `grades` and `programs`
f -
	- `projects`
	- `papers`
	- `demos`
	- `buylow`
	- `sellhigh`
	- `market
g - It has depth 3
h - It has height 4


#### 8.2

```
A -> B -> C -> D -> E -> F
```

Every linear tree achieves worst case running time for depth, specially if it's called on the lastest node.