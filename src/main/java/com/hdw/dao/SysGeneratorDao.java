package com.hdw.dao;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 * 
 * @author TuMinglong
 * @email tuminglong@126.com
 * @date 2018年06月20日 下午3:32:04
 */
public interface SysGeneratorDao {
	
	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
}
