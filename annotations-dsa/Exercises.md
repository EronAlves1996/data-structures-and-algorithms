Page 73 all from 1.14
Page 117 all from 2.14
Page 163 all from 3.12
Page 200 all from 4.11
Page 239 all from 5.10
Page 270 all from 6.7
Page 318 all from 7.2
page 337

### Answers not in code

#### 1.2

Java passes values by reference, so if we clone `GameEntry[]` from array A to B, and we set `A[4].score` to 550, `B[4].score` will be 550 too.

#### 1.13

The third credit card.

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
 

