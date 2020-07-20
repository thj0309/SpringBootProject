/**
 * 거래현황 DTO
 */
package com.toto.spring.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountInfoDto implements Serializable{
	
	@Id
	@Column(name = "accountNb")
	private String accountNb ; /* 계좌번호 */
	
	@Id
	@Column(name = "accountNm")
	private String accountNm ;/* 계좌명 */
	
	@Id
	@Column(name = "storeMgtCd")
	private String storeMgtCd ; /* 관리점코드 */
	
	@Id
	@Column(name = "insDtm")
	private String insDtm ; /* 등록일자 */
	
	@Id
	@Column(name = "updDtm")
	private String updDtm ; /* 수정일자 */

	

}
