[toc]

# Android



# God of Android

## 1장 안드로이드란 무엇인가

### 정리 문제

1. 모바일과 모바일 운영체제란?

   인터넷 통신이 가능하고 이동이 가능한 기기를 모바일이라 하며, 이러한 기기들을 작동하도록 만드는 운영체제를 모바일 운영체제라 한다.

2. 모바일 플랫폼은 개발환경, 어플리케이션(실행 파일), 실행 환경으로 구분할 수 있다. 각각의 특징은?

   개발환경은 개발 툴인 안드로이드 스튜디오, SDK 등이 있고, 실행 파일은 시스템 앱, 서드파티 앱 등이 있다. 실행 환경은 이러한 실행 파일들이 작동하는 스마트폰, 태블릿, 웨어러블 기기 등을 들 수 있다.

3. 달빅 가상 머신과 ART(Anroid RunTime)의 특징은?

   자바 바이트 코드를 안드로이드에서는 달빅 이라는 가상머신이 컴파일한다. 앱이 실행될 때마다 달빅 가상머신에서 JIT 컴파일러를 통해 실행 가능한 코드로 바꾼다. 

   ART는 구글이 새로 개발한 안드로이드 런타임이다. 구글은 JIT 대신 AOT(Ahead of Time)이라는 컴파일러를 사용해, 매번 앱 실행시 컴파일을 하지 않고, 앱을 설치할 때 미리 실행 가능한 코드로 컴파일한다. 메모리를 더 차지하지면 앱 구동이 더 빠르다.

4. 안드로이드가 리눅스 커널을 사용하는 이유와 커널이 하는 일은?

   모바일 환경이 커지면서 앱들을 아키텍처로 관리하였다. 이때 리눅스 커널은 안정적인 환경을 제공하며, 백그라운드 스레드, 메모리 관리, 디바이스 드라이버 등 저수준 관리를 맡는다.

5. 안드로이드가 자바를 사용하는 이유는?

   메모리 관리의 문제를 VM이 해결해줌으로써 개발자는 기능 개발에 집중할 수 있기 때문이다.