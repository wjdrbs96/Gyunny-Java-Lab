# `아이템69 : 예외는 진짜 예외 상황에만 사용하라`

- 예외를 사용한 반복문의 해악은 코드를 헷갈리게 하고 성능을 떨어뜨리는데서 끝나지 않는다. 
- 반복문 안에 버그가 숨어 있다면 흐름 제어에 쓰인 예외가 이 버그를 숨겨 디버깅을 훨씬 어렵게 할 것이다. 
- `예외는 오직 예외 상황에서만 써야 한다. 절대로 일상적인 제어 흐름용으로 쓰여선 안 된다.`

- 잘 설계된 API라면 클라이언트가 정상적인 제어 흐름에서 예외를 사용할 일이 없게 해야 한다. 

