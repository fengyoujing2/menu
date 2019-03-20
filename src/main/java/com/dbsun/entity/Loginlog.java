package com.dbsun.entity;

import org.apache.ibatis.type.Alias;

import javax.persistence.Entity;

/**
 * 登录用户表
 *
 */
@Alias("Loginlog")
@Entity
public class Loginlog {

	private int logid;		
	private String logtext;
	public int getLogid() {
		return logid;
	}
	public void setLogid(int logid) {
		this.logid = logid;
	}
	public String getLogtext() {
		return logtext;
	}
	public void setLogtext(String logtext) {
		this.logtext = logtext;
	}
	
	
	
	
}
