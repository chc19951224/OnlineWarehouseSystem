package org.example.warehousev1be.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.warehousev1be.entity.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  //@数据库映射
@Repository  //@零件数据层
public interface ComponentMapper {

    //MyBatis动态SQL查询
    //多数据表的分页查询
    @Select("SELECT * FROM ${dbTableName} LIMIT #{PageRecords} OFFSET #{Offset}")
    public List<Component> queryTable(@Param("dbTableName") String feTableName,
                                       @Param("PageRecords") int fePageRecords,
                                       @Param("Offset") int offset);
    //多数据表的产品总数查询
    @Select("SELECT COUNT(*) FROM ${dbTableName}")
    public int tableItems(@Param("dbTableName") String feTableName);

    //CRUD:Insert / Delete / Update / Select
}
