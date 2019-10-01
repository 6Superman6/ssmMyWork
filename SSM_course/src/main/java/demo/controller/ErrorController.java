package demo.controller;

import demo.utils.ResponseCode;
import demo.utils.ServerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/noLogin")
    public @ResponseBody ServerResponse noLogin(){
        return ServerResponse.createByError(ResponseCode.PERMISSION_DENIED.getStatus(),"用户未登录");
    }

}
