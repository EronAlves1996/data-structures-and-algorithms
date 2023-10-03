Page 73 all from 1.6
Page 115 all from 2.6
Page 163 all from 3.4
Page 200 all from 4.3
Page 238 all from 5.1
page 243

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

#### 3.3

First of all, we have to make sure how much gliphs the target alphabet have. After that, we could adapt the array and the codes with the gliphs, calculating  how to reach the base number to swap the chars for numbers and adapt the exercise.

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
