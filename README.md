# 🛍️ Shop Calendar API (Portfolio Sample)

> 💡 **안내사항**
> 본 프로젝트는 포트폴리오 및 기술 검증 목적으로 공개된 레포지토리입니다.
> 재직 중 개발한 실제 서비스의 아키텍처와 구조적 베스트 프랙티스를 담고 있으나, 사내 보안 정책상 **핵심 비즈니스 로직, 인증 키, DB 접속 정보 등은 모두 마스킹(`***`) 및 비공개 처리**되었습니다.
> (대신 주요 메서드 상단에 Javadoc을 통해 적용된 기술 및 로직 프로세스를 명시해 두었습니다.)

---

## 📖 프로젝트 개요
**Shop Calendar API**는 E-Commerce 플랫폼의 이벤트, 쿠폰, 사용자 인증 및 통계 배치를 처리하는 **대규모 백엔드 API 서버**의 구조적 템플릿입니다.

유지보수성과 확장성을 극대화하기 위해 **Spring Boot 기반의 멀티 모듈(Multi-Module) 아키텍처**로 설계되었으며, 대용량 트래픽과 동시성 이슈를 고려한 캐싱 및 비동기 처리 전략이 적용된 뼈대를 확인하실 수 있습니다.

## 🛠️ 기술 스택 (Tech Stack)
- **Framework & Language:** Java 17, Spring Boot 2.x
- **Database / ORM:** MariaDB, Spring Data JPA, QueryDSL, H2 (Test)
- **Cache & Memory DB:** Redis (Session, Cache, Token)
- **Security:** Spring Security, JWT (JSON Web Token), BCrypt
- **Etc:** Swagger(SpringDoc) for API Docs, Feign Client, Gradle

---

## 🏗️ 시스템 아키텍처 (Multi-Module)
도메인 중심 설계 및 관심사 분리를 위해 아래와 같은 모듈로 구성되어 있습니다.

- **`domain`**: 전사적으로 사용되는 핵심 도메인 모듈. 데이터베이스 엔티티(Entity), JPA/QueryDSL Repository 등 데이터 영속성 계층을 담당합니다.
- **`core`**: 전역적으로 사용되는 공통 비즈니스 로직, 유틸리티, 공통 DTO, Exception Handler 및 로깅/통계용 AOP를 포함합니다.
- **`external`**: SNS 로그인(Kakao/Naver), 푸시 알림, 결제 시스템 등 외부 외부 API 연동을 담당하는 인프라스트럭처 모듈입니다.
- **`api`**: 모바일 앱 및 클라이언트 등 B2C 통신을 담당하는 메인 API 진입점입니다. JWT 기반 인증 및 보안 처리가 포함되어 있습니다.
- **`webapi`**: 백오피스 및 사내 웹 기반 서비스 전용 API 진입점입니다.
- **`batch`**: 일일 통계 집계, 쿠폰 만료 처리 등 스케줄링(`@Scheduled`) 기반의 대용량 데이터 처리(Bulk Insert/Update)를 담당합니다.

---

## 🎯 주요 비즈니스 관심사 (Highlights)

실제 로직은 제거되었으나, 본 아키텍처를 통해 해결하고자 한 핵심 기술적 과제들은 다음과 같습니다.

### 1. 확장성 있는 인증/인가 시스템 (Auth)
- `Spring Security`와 `JWT`를 활용한 Stateless 인증 구현
- `Redis`를 활용한 Refresh Token 캐싱 및 중복/다중 기기 로그인 방지
- Guest용 임시 Public Token과 정식 User Token의 이원화 관리

### 2. 동시성 제어 및 대용량 트래픽 대응 (Event/Coupon)
- 선착순 이벤트 및 한정 수량 쿠폰 발급 시 발생할 수 있는 동시성 이슈를 제어하기 위한 락(Lock) 처리 구조
- RDBMS 부하를 줄이기 위한 도메인 데이터 Redis 캐싱 (`@RedisCacheable` 자체 AOP 구현)

### 3. AOP 기반의 비동기 로깅 및 통계 (Logging/Stats)
- 서비스 코드를 오염시키지 않고 사용자 액션 및 페이지 조회 수를 카운팅하기 위한 `@ViewStats` AOP 구성
- 시스템 부하를 최소화하기 위해 수집된 로그 데이터를 내부 비동기 큐를 통해 일괄 처리(Batching)

### 4. 확장성 높은 쿼리 설계 (QueryDSL)
- 복잡한 검색 조건과 동적 쿼리를 처리하기 위해 `QueryDSL` 도입
- N+1 문제를 방지하기 위한 Fetch Join 적극 활용 및 영속성 컨텍스트 최적화

---

## ⚙️ 로컬 환경 실행 방법 (Getting Started)

1. **사전 준비**
   - JDK 17 이상
   - Redis Server 로컬 실행 (기본 포트: 6379)
   - (선택) MariaDB 로컬 실행

2. **빌드 및 실행**
   ```bash
   # 프로젝트 빌드
   $ ./gradlew clean build

   # API 서버 실행
   $ ./gradlew :api:bootRun
   ```
