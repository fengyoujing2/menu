package com.dbsun.util;

public class FollowUtil {
	
//保留
	public final static int SYSTEM_CODE = 1; 			public final static String SYSTEM_STR = "系统";	
	public final static int CALL_CODE = 2; 				public final static String CALL_STR = "呼叫";	
	public final static int MANMADE_CODE = 3; 			public final static String MANMADE_STR = "人工";	
	
//客户菜单
	public final static int CUS = 0; 		
	public final static int CUS_ADD_CODE = 101; 			public final static String CUS_ADD_STR = "添加客户";	
	public final static int CUS_UPDAT_CODE = 102; 		public final static String CUS_UPDATE_STR = "编辑客户基本资料";	
	public final static int CUS_TOREC_CODE = 103; 		public final static String CUS_TOREC_STR = "批量回收客户";	
	public final static int CUS_TOSIGN_CODE = 4; 		public final static String CUS_TOSIGN_STR = "更改客户状态为签单客户";	
	public final static int CUS_TOTEMP_CODE = 5; 		public final static String CUS_TOTEMP_STR = "更改客户状态为临时客户";	
	public final static int CUS_TOTHINK_CODE = 6; 		public final static String CUS_TOTHINK_STR = "更改客户状态为意向客户";	
	public final static int CUS_TODOOR_CODE = 7; 		public final static String CUS_TODOOR_STR = "更改客户状态为上门客户";	
	public final static int CUS_TOSCRAP_CODE = 8; 		public final static String CUS_TOSCRAP_STR = "更改客户状态为废弃客户";	
	public final static int CUS_ADD_APTITUDE_CODE = 9; 	public final static String CUS_ADD_APTITUDE_STR = "为客户添加资质";	
	public final static int CUS_UPDATE_APTITUDE_CODE = 10; 	public final static String CUS_UPDATE_APTITUDE_STR = "修改资质";	
	public final static int CUS_ADD_DOOR_CODE = 11; 	public final static String CUS_ADD_DOOR_STR = "添加上门";	
	public final static int CUS_UPDATE_DOOR_CODE = 12; 	public final static String CUS_UPDATE_DOOR_STR = "修改上门";	
	public final static int CUS_ADD_FOLLOW_CODE = 13; 	public final static String CUS_ADD_FOLLOW__STR = "人工录入跟进";	
	public final static int CUS_ADD_GETMY_CODE = 14; 	public final static String CUS_ADD_GETMY_STR = "客户录入收款信息";	
	public final static int CUS_ADD_SIGN_CODE = 15; 	public final static String CUS_ADD_SIGN_STR = "添加签单信息";	
	public final static int CUS_ADD_TEL_CODE = 16; 		public final static String CUS_ADD_TEL_STR = "添加联系人";	
	public final static int CUS_UPDAT_LABEL_CODE = 17; 		public final static String CUS_UPDAT_LABEL_STR = "修改客户标签";	
	public final static int SPR_ALT_CODE = 18; 		public final static String SPR_ALT_STR = "从推广池分配到客户经理";	
//客户重分配菜单
	public final static int CUS_REALLOT = 20;  
	public final static int CUS_UPDATE_REALT_CODE = 21; 	public final static String CUS_UPDATE_REALT_STR = "客户重分配";	
	public final static int CUS_UPDATE_FULLREALT_CODE = 22; 	public final static String CUS_UPDATE_FULLREALT_STR = "客户全分配";	
//客户回收池菜单
	public final static int CUS_RECOVERY = 30; 	
	public final static int CUS_UPDATE_RECREALT_CODE = 31; 	public final static String CUS_UPDATE_RECREALT_STR = "回收客户重分配";	
//客户待收款菜单
	public final static int CUS_CANSINGLE = 40; 
//不能做单客户
	public final static int CUS_WTRCPT = 50;       public final static String CUS_WTRCPT_STR = "更改客户为不能做单状态";


//	后台
	//做单
	public final static int CUS_ADD_SINGLE_CODE = 60; 	public final static String CUS_ADD_SINGLE_STR = "添加做单信息";


//电话系统
	public final static int Call_OUT_CODE = 71; 	public final static String Call_OUT__STR = "呼出";


	//对用户会员管理操作
	public final static int CUS_ADD_BASE_VIP_CODE = 80; 		public final static String CUS_ADD_BASE_VIP_STR = "成为准会员";
	public final static int CUS_ADD_PRO_VIP_CODE = 81; 			public final static String CUS_ADD_PRO_VIP_STR = "成为正式会员";
	public final static int CUS_EXIT_VIP_CODE = 82; 			public final static String CUS_EXIT_VIP_STR = "退出会员";
	public final static int CUS_MAINTAIN_VIP_CODE = 82; 		public final static String CUS_MAINTAIN_VIP_STR = "会员维护";

	
//特别情况（客户表的跟进信息就不写了）
	public final static String BATCH_RECOVERY = "批量回收";
	public final static String BATCH_REALT = "批量分配";
	public final static String FULLBATCH_REALT = "批量全分配";
	public final static String REC_BATCH_REALT = "回收客户重分配";
}
