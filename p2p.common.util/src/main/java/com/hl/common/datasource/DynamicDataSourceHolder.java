package com.hl.common.datasource;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicDataSourceHolder extends AbstractRoutingDataSource implements InitializingBean {

	// 线程本地环境
	private final static ThreadLocal<String> dataSourceHolder = new ThreadLocal<String>();
	// 可选取的只读Salve主键
	private List<String> slaveDataSourceKeys;
	// 可选取的读写Master主键
	private List<String> masterDataSourceKeys;

	private Map<String, DataSource> slaveDataSources;
	private Map<String, DataSource> masterDataSources;
	
	public void setSlaveDataSources(Map<String, DataSource> slaveDataSources) {
		if(null == slaveDataSources || slaveDataSources.isEmpty()){
			return;
		}
		this.slaveDataSources = slaveDataSources;
		this.slaveDataSourceKeys = new ArrayList<String>();
		for(Map.Entry<String, DataSource> entry : slaveDataSources.entrySet()){
			this.slaveDataSourceKeys.add(entry.getKey());
		}
	}

	public void setMasterDataSources(Map<String, DataSource> masterDataSources) {
		if(null == masterDataSources || masterDataSources.isEmpty()){
			return;
		}
		this.masterDataSources = masterDataSources;
		this.masterDataSourceKeys = new ArrayList<String>();
		for(Map.Entry<String, DataSource> entry : masterDataSources.entrySet()){
			this.masterDataSourceKeys.add(entry.getKey());
		}
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return dataSourceHolder.get();
	}

	@Override
	public void afterPropertiesSet(){
		Map<Object,Object> allDataSources = new HashMap<Object,Object>();
		allDataSources.putAll(this.masterDataSources);
		if(null != this.slaveDataSources && !this.slaveDataSources.isEmpty()){
			allDataSources.putAll(this.slaveDataSources);
		}
		super.setTargetDataSources(allDataSources);
		super.afterPropertiesSet();
	}
	
	/**
	 * 设置数据源
	 * @param dataSourceKey
	 */
	private void setDataSource(String dataSourceKey) {
		dataSourceHolder.set(dataSourceKey);
	}
	
	/**
	 * 删除选取的数据源
	 */
	public void markRemove() {
		dataSourceHolder.remove();
	}
	
	/**
	 * 判断是否已经绑定数据源
	 * @return
	 */
	public boolean hasBindedDataSource() {
		return (dataSourceHolder.get() != null);
	}
	
	/**
	 * 判断是否已经选取Master数据源
	 * @return
	 */
	public boolean isChoceMaster() {
		if (dataSourceHolder.get() != null && masterDataSourceKeys.contains(dataSourceHolder.get())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 从Slave数据源中随机选取一个数据源
	 * @return
	 */
	private String selectFromSlave() {
		if (slaveDataSources == null || slaveDataSources.isEmpty()) {
			return slectFromMaster();
		} else {
			return slaveDataSourceKeys.get(RandomUtils.nextInt(0,slaveDataSourceKeys.size()));
		}
	}
	
	/**
	 * 从Master数据源中随机选取一个数据源
	 * @return
	 */
	private String slectFromMaster() {
		return masterDataSourceKeys.get(RandomUtils.nextInt(0,masterDataSourceKeys.size()));
	}
	
	/**
	 * 选取Slave数据源
	 */
	public void markSlave() {
		setDataSource(selectFromSlave());
	}
	
	/**
	 * 选取Master数据源
	 */
	public void markMaster() {
		setDataSource(slectFromMaster());
	}
	
	
	
}