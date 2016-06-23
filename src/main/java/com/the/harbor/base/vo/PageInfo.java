package com.the.harbor.base.vo;

import java.io.Serializable;
import java.util.List;

public class PageInfo<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 请求查询的页码
	 */
	private Integer pageNo = 1;

	/**
	 * 每页显示条数
	 */
	private Integer pageSize;

	/**
	 * 结果集
	 */
	private List<T> result;

	/**
	 * 总条数
	 */
	private int count = 0;

	/**
	 * 总页数
	 */
	private int pageCount;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public int getStartRowIndex() {
		return (this.getPageNo() - 1) * this.getPageSize();
	}

	public int getEndRowIndex() {
		return this.getPageNo() * this.getPageSize();
	}

	public int getPageCount() {
		int quotient = this.getCount() / this.getPageSize();
		int remainder = this.getCount() % this.getPageSize();
		pageCount = quotient;
		if (remainder > 0) {
			pageCount += 1;
		}
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

}
