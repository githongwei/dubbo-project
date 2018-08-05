package com.pack.dubbo.mapper;

import java.sql.SQLException;

/**
 * @author 娃哈哈
 * 持久层Mapper接口
 */
public interface QueryMapper {

    String selectName(String name)throws SQLException;

}
