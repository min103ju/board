![version badge](https://img.shields.io/badge/version-0.0.1-blue)
![build badge](https://img.shields.io/badge/build-passing-brightgreen)
![coverage badge](https://img.shields.io/badge/coverage-0%25-lightgrey)
# :blush: Spring boot로 Web 게시판 개발
QueryDsl로 쿼리 최적화를 진행하며, TDD를 기반으로 개발을 목표로 한다.
최초 버전은 Rest API Server 형태로 개발한다.
추후 개발 예정 내용으로 View는 React나 Vue.js로 개발 예정.
Spring Security 적용하여 API에 대한 권한 처리 개발 예정.


## :hammer: 개발환경
* IDE : IntelliJ 2020.1.2
* Java : JDK 1.8
* Spring : Spring Boot 2.5.2
* Build : Gradle
* DB : H2, MariaDB
* JPA : Spring Data JPA, QueryDsl 1.0.10

## :pencil2: Getting Started
### Gradle Dependency
```
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springframework.boot:spring-boot-starter-web'
compileOnly 'org.projectlombok:lombok'
runtimeOnly 'com.h2database:h2'
runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'
annotationProcessor 'org.projectlombok:lombok'
testImplementation 'org.springframework.boot:spring-boot-starter-test'
```

### QueryDsl 추가
* plugins 
```
id "com.ewerk.gradle.plugins.querydsl" version "1.0.10"
```
* dependency
```
implementation 'com.querydsl:querydsl-jpa'
```
* 추가 (QueryDsl 관련 객체 생성 경로 지정)
```
def querydlsDir = "$buildDir/generated/querydsl"

querydsl {
	jpa = true
	querydslSourcesDir = querydlsDir
}
sourceSets {
	main.java.srcDir querydlsDir
}
configurations {
	querydsl.extendsFrom compileClasspath
}
compileQuerydsl {
	options.annotationProcessorPath = configurations.querydsl
}
```
## :pushpin: 기능 요구사항
1. 게시글 Create/Update/Delete 기능 구현 
2. 게시글 전체 목록 조회
3. 게시글 검색 조건 목록 조회
4. 특정 게시글 조회
5. 댓글 Create/Update/Delete 기능 구현 
6. 댓글 답글 Create/Update/Delete 기능 구현
7. 특정 게시글 조회 시 연관된 모든 댓글 조회

## :bulb: 프로그램 요구사항
1. Google Java Style Guide Conventions를 따른다.
2. the AngularJS Commit Conventions를 따른다.
3. TDD로 개발한다. 
4. 객체 지향 생활 체조 원칙을 최대한 지킨다.
    1. indent의 depth를 2까지만 허용한다.
    2. else를 사용하지 않는다.
    3. 일급 Collection을 사용한다 (Collection 자체를 사용하지 않는다.)
    4. primitive 값과 문자열을 포장한다.