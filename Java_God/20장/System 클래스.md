# `System 클래스란?`

System 클래스는 자바를 처음 배울 때 `System.out.println()` 이라는 출력문을 사용할 때 사용됩니다. 정말 많은 출력문을 사용했지만 System 클래스에 대해서 공부를 해본 적이 없어서.. 이번에 해보려 합니다. 

```java
public final class System {

    private System() {
    }

    public static final InputStream in = null;

    public static final PrintStream out = null;

    public static final PrintStream err = null;
}
```

System 클래스는 위와 같이 `in`, `out`, `err`의 static 변수를 갖고 있습니다. 

- `in : 입력값을 처리할 때 사용한다.`
- `out : 출력값을 처리할 때 사용한다.`
- `err : 에러 및 오류를 출력할 때 사용한다.`

`out`을 보면 선언 및 리턴 타입이 `PrintStream`인 것을 볼 수 있습니다. 그리고 `PrintStream` 클래스에 `println()` 메소드가 존재합니다. 

```
public void println() {
    newLine();
}

public void println(boolean x) {
    synchronized (this) {
        print(x);
        newLine();
    }
}
```

위와 같이 println() 메소드가 오버로딩 되어 구현되어 있습니다. 이러한 이유로 지금까지 `System.out.println()`를 사용할 수 있었던 것입니다.

<br>

## `System 클래스의 역할`

- 시스템 속성(Property)값 관리
- 시스템 환경(Environment)값 조회
- GC 수행
- JVM 종료
- 현재 시간 조회
- 기타 관리용 메소드들

