Page 73 all from 1.9
Page 115 all from 2.9
Page 163 all from 3.6
Page 200 all from 4.5
Page 239 all from 5.4
Page 270 all from 6.1
page 276

### Answers not in code

#### 1.2

Java passes values by reference, so if we clone `GameEntry[]` from array A to B, and we set `A[4].score` to 550, `B[4].score` will be 550 too.

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
#### 3.3

First of all, we have to make sure how much gliphs the target alphabet have. After that, we could adapt the array and the codes with the gliphs, calculating  how to reach the base number to swap the chars for numbers and adapt the exercise.

#### 3.5

If we remove these two lines of code, consequently the pointer in tail will never get nullified. Even if the size of Linked List is 0, the tail will have a Node. However, the entire class will not break because of this and continue to work as expected, because the tail pointer is always manipulated when size is 0.

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