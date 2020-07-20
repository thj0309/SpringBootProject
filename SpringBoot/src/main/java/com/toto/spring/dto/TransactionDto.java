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
public class TransactionDto implements Serializable{

	@Id
	@Column(name = "tranDate")
	private String tranDate; /* 거래일자 */
	
	@Id
	@Column(name = "accountNb")
	private String accountNb ; /* 계좌번호 */
	
	@Id
	@Column(name = "trtanNo")
	private String trtanNo ;/* 거래번호 */
	
	@Id
	@Column(name = "charge")
	private int charge ; /* 금액 */
	
	@Id
	@Column(name = "commission")
	private int commission ; /* 수수료 */
	
	@Id
	@Column(name = "cancleYn")
	private String cancleYn ; /* 취소여부 */
	
	@Id
	@Column(name = "insDtm")
	private String insDtm ; /* 등록일자 */
	
	@Id
	@Column(name = "updDtm")
	private String updDtm ; /* 수정일자 */

}
