package com.duan.demo;

import net.sf.json.JSONObject;

public class JsonDemo {

	public static void main(String[] args) {
	
		String strJson="{\"ERRORCODE\":\"000000\",\"ERRORMSG\":\"��ѯ�ɹ�\",\"ABLEUSEETAG\":\"155454545421212\",\"UNABLEUSEETAG\":\"54464454644\"}";
	
		JSONObject json= JSONObject.fromObject(strJson);
	
		if(json.containsKey("ERRORCODE")){
		System.out.println("ERRORCODE���Դ���json��");
		}else{
		System.out.println("ERRORCODE���Բ�����json��");
		}
	}

}
