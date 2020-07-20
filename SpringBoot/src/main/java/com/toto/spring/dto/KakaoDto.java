/**
 * 거래현황 DTO
 */
package com.toto.spring.dto;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class KakaoDto implements Serializable{

	@Id
	@Column(name = "storeMgtCd")
	private String storeMgtCd ; /* 관리점코드 */
	
	@Id
	@Column(name = "storeMgtNm")
	private String storeMgtNm ;/* 관리점명 */
	
	@Id
	@Column(name = "insDtm")
	private String insDtm ; /* 등록일자 */
	
	@Id
	@Column(name = "updDtm")
	private String updDtm ; /* 수정일자 */

}
