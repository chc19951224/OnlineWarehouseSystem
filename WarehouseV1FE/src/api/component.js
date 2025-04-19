import request from '@/utils/request'

//==================== 前端请求函数 ====================
//导出 函数 名称(接收组件的传递参数)
export function fetchBackendTable(fePageNumber, fePageRecords, feTableName) {
    //请求体
    return request({
        //请求路由
        url: '/component/' + feTableName,  //后端控制器的路由网址
        //请求方法
        method: 'get',  //Get请求
        //参数
        params: {
            fePageNumber,  //传递给后端的参数(当前页码)
            fePageRecords  //传递给后端的参数(每页显示条数)
        }
    })
}