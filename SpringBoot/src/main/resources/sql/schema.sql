/* SCHEMA TABLE 선언부 */

DROP TABLE IF EXISTS tb_tranPrsts/* 데이터_거래내역 */
;

CREATE TABLE tb_tranPrsts /* 데이터_거래내역 */
(
	tranDate varchar(8) /* 거래일자 */
	, accountNb varchar(8) /* 계좌번호 */
	, trtanNo varchar(8) /* 거래번호 */
	, charge int /* 금액 */
	, commission int /* 수수료 */
	, cancleYn char(1) /* 취소여부 */
	, insDtm date /* 등록일자 */
	, updDtm date /* 수정일자 */
); 



DROP TABLE IF EXISTS  tb_accountInfo /* 데이터_계좌정보 */
;

CREATE TABLE tb_accountInfo /* 데이터_계좌정보 */
(
	accountNb varchar(8) /* 계좌번호 */
	, accountNm varchar(20) /* 계좌명 */
	, storeMgtCd char(1)  /* 관리점코드 */
	, insDtm date /* 등록일자 */
	, updDtm date /* 수정일자 */
); 



DROP TABLE IF EXISTS tb_storeMgt /* 데이터_관리점정보 */
;

CREATE TABLE tb_storeMgt /* 데이터_관리점정보 */
(
	storeMgtCd char(1)  /* 관리점코드 */
	, storeMgtNm varchar(8) /* 관리점명 */
	, insDtm date /* 등록일자 */
	, updDtm date /* 수정일자 */
); 

/* pk / fk 선언 판단 필요 */