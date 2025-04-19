package org.example.warehousev1be.controller;

import org.example.warehousev1be.service.ComponentService;
import org.example.warehousev1be.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController  //@控制器(返回前端的是Json数据)
@RequestMapping(value = "/component")  //@请求路由网址
@CrossOrigin  //@管理跨域请求和响应
public class ComponentController {
    @Autowired  //@注入实例对象
    private ComponentService componentService;  //使用接口类型注入服务层

    //接收前端接口路由发送的请求，请求为Get类型
    @RequestMapping(value = "/{tableName}", method = RequestMethod.GET)
    //接收前端的带有默认值的2个参数
    public Result<Map<String, Object>> getTableData
    (@PathVariable("tableName") String feTableName,
     @RequestParam(defaultValue = "1") int fePageNumber,
     @RequestParam(defaultValue = "30") int fePageRecords) {

        Map<String, Object> result = componentService.tableService(feTableName, fePageNumber, fePageRecords);
        return Result.succeed("数据表查询成功~", result);
    }
}


