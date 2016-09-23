# EToast

![img](https://jitpack.io/v/aotian16/EToast.svg)

Toast util for android

# Install

## By jitpack.io

```
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

```
	dependencies {
	        compile 'com.github.aotian16:EToast:v1.0.2'
	}
```

## Or Download this project and import as a module

# Use

```java
public void showToast(CharSequence text) {
    EToast.show(this, text);
}
public void showToast(CharSequence text, boolean isLong) {
    EToast.show(this, text, isLong);
}
public void showToast(int resId) {
    EToast.show(this, resId);
}
public void showToast(int resId, boolean isLong) {
    EToast.show(this, resId, isLong);
}
```

# Version

| No.  | Version | Detail           |
| :--: | :-----: | ---------------- |
|  1   |  1.0.0  | First version    |
|  2   |  1.0.1  | update appcompat |
|  3   |  1.0.2  | update appcompat |

# [LICENSE](https://github.com/aotian16/EToast/blob/master/LICENSE)

MIT