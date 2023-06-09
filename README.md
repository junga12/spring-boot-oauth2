# springboot-oauth2

https://spring.io/guides/tutorials/spring-boot-oauth2/
https://docs.spring.io/spring-security/reference/servlet/configuration/kotlin.html
https://catsbi.oopy.io/c0a4f395-24b2-44e5-8eeb-275d19e2a536


## WebSecurity
인증과 인가가 무시된다.   
Spring Security Filter Chain을 거치지 않는다.  
endpoints를 `antMatchers`의 파라미터로 넘겨주면 된다.  

인증과 인가 서비스가 필요하지 않는 페이지에 사용(로그인 페이지, public 페이지)

## HttpSecurity
인증이 무시된다.  
endpoints를 `antMatchers`의 파라미터로 넘겨주면 된다.


## WebSecurity 와 HttpSecurity 를 모두 설정한 경우
우선순위가 WebSecurity 가 높기 때문에 인가 설정이 무시된다.



### 인증
사용자의 신원을 확인 (비밀번호, 일회용 핀, 인증 앱, 생체인식 등)

### 인가
특정 리소스나 기능에 액세스할 수 있는 권한 부여
