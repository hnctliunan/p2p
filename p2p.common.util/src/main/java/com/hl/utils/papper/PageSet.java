package com.hl.utils.papper;
import java.io.Serializable;
import java.util.List;

public class PageSet implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int limit;
	private int start;
	private int total;
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<?> getDatas() {
		return datas;
	}
	public void setDatas(List<?> datas) {
		this.datas = datas;
	}
	private List<?> datas;
	
}