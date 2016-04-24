package com.javawc.code.web.controller.code.support.impl;


import com.javawc.code.web.controller.code.support.MysqlDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * <b>
 *   用mybatis对数据库的CRUD操作通用类
 * </b>
 * 
 * @author sqy
 *
 * @date
 * 
 * @param <T>
 */
@Repository(value="mysqlDaoSupport")
public class MysqlDaoSupport<T> extends SqlSessionDaoSupport implements MysqlDao<T> {
	
	private final static Logger logger = LoggerFactory.getLogger(MysqlDaoSupport.class);
	
	public Boolean insert(String classMethod, T entity)  {
        Boolean flag = false;
        try {
        	flag = (getSqlSession().insert(classMethod, entity) > 0);
        } catch (Exception e) {
        	logger.error(e.getMessage(), e);

        }
        return flag;
    }

    public Boolean update(String classMethod, T entity)  {
        Boolean flag = false;
        try {
        	flag = (getSqlSession().update(classMethod, entity) > 0);
        } catch (Exception e) {
        	logger.error(e.getMessage(), e);
        }
        return flag;
    }
    
    public Boolean updateByHashMap(String classMethod, Object parameters) {
        Boolean flag = false;
        try {
        	flag = (getSqlSession().update(classMethod, parameters) > 0);
        } catch (Exception e) {
        	logger.error(e.getMessage(), e);
        }
        return flag;
    }

    public Boolean delete(String classMethod, T entity) {
        Boolean flag = (getSqlSession().delete(classMethod, entity) > 0);
        return flag;
    }

    public Integer queryCountForObject(String classMethod, Object entity) {
        Object result = null; 
        Integer count = 0;
        try {
        	result = getSqlSession().selectOne(classMethod, entity);
            count = (null == result) ? 0 :((Integer) result);
        } catch (ClassCastException e) {
            logger.error("sql语句：" + classMethod + "查询结果非数字类型，无法用于查询数量");
        } catch (RuntimeException ex) {
        	logger.error("Error msg:" + ex.getMessage());
        }
        return count;
    }

    public T queryForObject(String classMethod, Object entity) {
        T result = null;
        try {
        	result = (T) getSqlSession().selectOne(classMethod, entity);
        } catch (Exception e) {
        	logger.error(e.getMessage(), e);
        }
        return result;
    }

    public T queryForObjectNoEntity(String classMethod) {
        T result = (T) getSqlSession().selectOne(classMethod);
        return result;
    }

    /**
     * 没有查询参数entity可传null
     */
    public List<T> queryForList(String classMethod, Object entity) {
        logger.info("MysqlDaoSupport.queryForList-----------------查询列表开始");
        List<T> result = getSqlSession().selectList(classMethod, entity);
        logger.info("MysqlDaoSupport.queryForList-----------------查询列表结束");
        return result;
    }
	public List<T> batchInsert(String classMethod, List<T> entityList) {
		try {
			int row = getSqlSession().insert(classMethod, entityList);
			if (row > 0)
				return entityList;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException("批量插入错误");
		}
		return null;
	}
	

	public Integer batchUpdate(String classMethod, T entity) {
		Integer rowAffected = 0;
		try {
			rowAffected = getSqlSession().update(classMethod, entity);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException("批量更新错误：", e);
		}
		return rowAffected;
	}
	public Long queryLongCount(String classMethod, Object entity) {
		Long totalCount = 0L ;
		Map<String, Object> resultMap = null;
		try {
			resultMap = (Map<String, Object>) this.queryForObject(classMethod, entity);
			if (null != resultMap) {
				if (resultMap.get("total_count") != null) {
					totalCount = (Long) resultMap.get("total_count");
				} 
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RuntimeException("数据库查询从错误");
		}
		
		return totalCount;
    }

	/**
     * 没有查询参数entity可传null
     */
	   public List queryForObjectList(String classMethod, Object entity) {
	        List result = getSqlSession().selectList(classMethod, entity);
	        return result;
	    }
}
