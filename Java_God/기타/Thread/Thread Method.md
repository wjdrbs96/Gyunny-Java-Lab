# `Thread Method 정리`

`Thread` 클래스에는 `sleep()`, `join()`, `interrupt()` 메소드들이 존재합니다. 각각 어떤 역할을 하는 것인지 알아보겠습니다. 

![thread](https://t1.daumcdn.net/cfile/tistory/99E341435DC42E4E33)

먼저 `Thread 생명주기`를 다시 한번 보자면 위와 같습니다. 그림을 참고하면서 메소드들의 역할을 정리해보겠습니다. 

<br>

## `sleep() 이란?`

```java
public class ThreadEx extends Thread {
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

사용법은 위와 같습니다. static 메소드라서 `Thread.sleep()`으로 사용할 수 있고, `InterruptedException` 에러를 발생시킬 수 있어 에러처리를 반드시 해주어야 합니다. 

