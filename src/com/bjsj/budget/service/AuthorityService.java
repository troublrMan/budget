package com.bjsj.budget.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bjsj.budget.model.Authority;

public interface AuthorityService {
	
	/**
	 * 获取页面菜单
	 * @param queryMap
	 * @return
	 */
	List<Authority> getMenuInfo(@Param("map")Map<String, Object> queryMap);
}
