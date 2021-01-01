# `Generic Type erasure란?`

이번 글에서는 `Generic Type erasure`에 대해서 알아보겠습니다. 저에게는 쉽지 않은 내용입니다 ㅠㅠ 하지만 중요한 내용이니 정리를 열심히 해보겠습니다. 

[제네릭](https://github.com/wjdrbs96/Gyunny-Java-Lab/blob/master/Java_God/21%EC%9E%A5/%EC%A0%9C%EB%84%A4%EB%A6%AD.md) 은 JDK 1.5에 도입되었습니다. 제네릭을 공부해보셨으면 확실히 버그에 대한 처리와 좀 더 안정적이고 편리하게? 
개발을 할 수 있습니다. 

이렇게 제네릭이 5버전 부터 나왔기에, 하위 버전과의 호환성 유지를 위한 작업이 필요했습니다. 따라서 코드의 호환성 때매 `소거(erasure)` 방식을 사용하게 됩니다. 





 