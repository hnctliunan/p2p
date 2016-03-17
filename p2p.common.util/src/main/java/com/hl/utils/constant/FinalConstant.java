package com.hl.utils.constant;
public class FinalConstant {
	/**
	 * 数据状态
	 * @version 0.1.0 2015/03/15
	 * @author liunan
	 */
	public enum DataStatus{
		Enable("1"),
		Disabled("-1");
		private String value;
		DataStatus(String value){
			this.value = value;
		}
		public String getValue(){
			return this.value;
		}
	}
}