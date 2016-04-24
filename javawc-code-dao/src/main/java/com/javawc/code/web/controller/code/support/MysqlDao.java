package com.javawc.code.web.controller.code.support;

import java.util.List;

/**
 * Created by sunny on 2016/3/3.
 */
public interface MysqlDao<T> {


    public Boolean insert(String classMethod, T entity);

    public Integer batchUpdate(String classMethod, T entity);

    public Boolean update(String classMethod, T entity);

    public Boolean updateByHashMap(String classMethod, Object parameters);

    public Boolean delete(String classMethod, T entity);

    public Integer queryCountForObject(String classMethod, Object entity);

    public T queryForObject(String classMethod, Object entity);

    public T queryForObjectNoEntity(String classMethod);

    public List<T> queryForList(String classMethod, Object entity);

    public List<T> batchInsert(String classMethod, List<T> entityList);

    public Long queryLongCount(String classMethod, Object entity);

    public List queryForObjectList(String classMethod, Object entity) ;


}
