package org.example.warehousev1be.controller;

import org.apache.ibatis.annotations.Param;
import org.example.warehousev1be.entity.User;
import org.example.warehousev1be.service.UserService;
import org.example.warehousev1be.utils.JwtUtils;
import org.example.warehousev1be.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController  //@用户控制层
@RequestMapping(value = "/user")  //@请求路由网址
@CrossOrigin  //@管理跨域请求和响应
//==================== 前端请求的控制 ====================
public class UserController {
    @Autowired  //@注入服务层变量
    private UserService userService;

    //==================== 登入请求 ====================
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    //返回类型:字典 login(@请求体 [类对象] 请求参数)
    public Result requestLogin(@RequestBody User data) {
        List<User> beUserData = userService.loginService(data);
//        String token = JwtUtils.generateToken(data.getUsername());
        return Result.succeed("登入成功~",beUserData);
    }


//    @PostMapping(value = "/login")
//    //前端传送的数据(json格式):必须使用对象接收，同时要添加@RequestBody
//    public Result login(@RequestBody User data) {
//        String token = JwtUtils.generateToken(data.getUsername());
//        return Result.succeed("登入成功", token);
//    }

    @GetMapping("/info")
    public Result info(@RequestParam(required = false) String token) {

        if (token == null || token.isEmpty()) {
            return Result.failure("Token不能为空", 400);
        }

        String username = JwtUtils.getClaimsFromToken(token).getSubject();
        return Result.succeed("登入成功", username);
    }

    @PostMapping(value = "/logout")
    public Result logout() {
        return Result.succeed("用户登出成功~");
    }

}
