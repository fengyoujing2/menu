package com.dbsun.entity.wechat;

import org.apache.ibatis.type.Alias;

@Alias("wechatMenu")
public class WechatMenu {
	
	private static final long serialVersionUID = 1L;////xxxx看自己喜欢
	
	private String ID;
	private String ACCOUNT_ID;
	private String PARENT_ID;
	private String NAME;
	private String TYPE;
	private String WX_KEY;
	private int SORT;
	private String URL;
	
	public String getWX_KEY() {
		return WX_KEY;
	}
	public void setWX_KEY(String wX_KEY) {
		WX_KEY = wX_KEY;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	private String CREATED_BY;
	private String CREATED_TIME;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(String aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}
	public String getPARENT_ID() {
		return PARENT_ID;
	}
	public void setPARENT_ID(String pARENT_ID) {
		PARENT_ID = pARENT_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public int getSORT() {
		return SORT;
	}
	public void setSORT(int sORT) {
		SORT = sORT;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public String getCREATED_TIME() {
		return CREATED_TIME;
	}
	public void setCREATED_TIME(String cREATED_TIME) {
		CREATED_TIME = cREATED_TIME;
	}
	
	
}
