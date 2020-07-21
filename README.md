# SpringBoot 2020
기존 주로 사용해온 스프링 프레임워크와 스프링부트는 거의 유사합니다. MVC 패턴에 의거한 개발 방법 등 스프링에서 쓰인기법들이 대부분 사용 가능하다고 들었습니다. <br>

이번 프로젝트 진행 후, 여러 가지 테스트를 하며 친숙화 작업을 할 예정입니다. <br>

# 개발환경 <br>
- 개발언어 : 자바, 자바스크립트) <br>
- IDE : Eclipse (STS 4.0) <br>
- DB : H2 DATABASE <br>
- MAVEN을 바탕으로 lombok, mybatis 등 스프링부트 스타터를 활용하여 개발환경 셋팅 <br>



# 실행방법 / 문제해결방법 <br>
http://localhost:8080/index.jsp <br>

1. (공통) DB 스키마 DDL 및 기초 쿼<br>
(1) DROP TABLE IF EXISTS tb_tranPrsts/* 데이터_거래내역 */;<br>
CREATE TABLE tb_tranPrsts /* 데이터_거래내역 */<br>
(<br>
	tranDate varchar(8) /* 거래일자 */<br>
	, accountNb varchar(8) /* 계좌번호 */<br>
	, trtanNo varchar(8) /* 거래번호 */<br>
	, charge int /* 금액 */<br>
	, commission int /* 수수료 */<br>
	, cancleYn char(1) /* 취소여부 */<br>
	, insDtm date /* 등록일자 */<br>
	, updDtm date /* 수정일자 */<br>
); <br>

(2) DROP TABLE IF EXISTS  tb_accountInfo /* 데이터_계좌정보 */; <br>
CREATE TABLE tb_accountInfo /* 데이터_계좌정보 */<br>
(<br>
	accountNb varchar(8) /* 계좌번호 */<br>
	, accountNm varchar(20) /* 계좌명 */<br>
	, storeMgtCd char(1)  /* 관리점코드 */<br>
	, insDtm date /* 등록일자 */<br>
	, updDtm date /* 수정일자 */v
); <br>

(3) DROP TABLE IF EXISTS tb_storeMgt /* 데이터_관리점정보 */;<br>
CREATE TABLE tb_storeMgt /* 데이터_관리점정보 */<br>
(<br>
	storeMgtCd char(1)  /* 관리점코드 */<br>
	, storeMgtNm varchar(8) /* 관리점명 */<br>
	, insDtm date /* 등록일자 */<br>
	, updDtm date /* 수정일자 */<br>
); <br>

(4) 기초 조회 쿼리 <br>
	 	SELECT  *<br>
		FROM TB_ACCOUNTINFO A		/* 계좌정보 */<br>
		INNER JOIN TB_STOREMGT B	/* 관리점정보 */	ON A.STOREMGTCD = B.STOREMGTCD<br>
		INNER JOIN TB_TRANPRSTS C 	/* 거래정보 */		ON C.ACCOUNTNB = A.ACCOUNTNB <br>
		WHERE 1=1<br>
		AND C.CANCLEYN = 'N' /* 거래 - 정상상태 여부 */ <br>



2. 2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API <br>
(1) 위 주소로 접근하거나 http://localhost:8080/kakao/test01 <br>
(2) 문제해결 : GET / 문제에 제시된 2개년도 데이터를 조회할 쿼리를 각각 만든 후, UNION ALL을 하면 값이 나옴.

3. 2018년 또는 2019년에  거래가 없는 고객을 추출하는 API <br>
(1) 위 주소로 접근하거나 http://localhost:8080/kakao/test02 <br>
(2) 문제해결 : GET / 문제에서는 2018년, 2019년 각각 데이터를 조회해오기 때문에 독립된 사건입니다. 그래서 1번 처럼 2018년 따로, 2019년 따로 구하여 UNION ALL을 합니다.<br>
문제에 제시된 2개년도 데이터를 조회할 쿼리를 각각 만든 후, UNION ALL을 하면 값이 나옴.

4. 연도별 관리점별 거래금액 합계를 구하고 합계금액이 큰 순서로 출력하는 API 개발.( 취소여부가 ‘Y’ 거래는 취소된 거래임)<br>
(1) 위 주소로 접근하거나 http://localhost:8080/kakao/test03 <br>
(2) 문제해결 : GET / 우선, 연도 / 관리점을 묶어 데이터를 조회함.

5. 분당점과 판교점을 통폐합하여 판교점으로 관리점 이관을 하였습니다. 지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API<br>
(1) 위 주소로 접근하여 '조회'할 지점명을 입력 후 결과보기 클릭 <br>
(2) 문제해결 : POST / 우선, 판교점으로 데이터를 통합(UPDATE를 통해 거래변경함). 그 이후, 화면에서 조회하고 싶은 지점명을 입력하면, 지점명에 맞는 데이터를 조회하면 됩니다.<br>

# 추후 과제
- MAVEN을 GRADLE로 바꾸는 작업
- 기존 myBatis와 함께 jpa 기법 활용하여 db 접근 방법 개선
등
- 프론트엔드 프레임워크 등을 붙여서 작
