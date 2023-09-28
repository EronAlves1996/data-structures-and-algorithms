Page 73 all from 1.5
Page 115 all from 2.5
Page 163 all from 3.2
Page 200 all from 4.1
page 207

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