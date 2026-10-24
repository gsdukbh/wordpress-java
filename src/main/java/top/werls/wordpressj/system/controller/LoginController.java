package top.werls.wordpressj.system.controller;


import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.werls.wordpressj.common.ResultData;
import top.werls.wordpressj.common.annotation.RequestLimit;
import top.werls.wordpressj.system.param.LoginParam;
import top.werls.wordpressj.system.service.SysUserService;
import top.werls.wordpressj.system.vo.LoginVo;


@Slf4j
@RestController
public class LoginController {


  private final SysUserService userService;




  public LoginController(SysUserService userService) {
    this.userService = userService;
  }

  @PostMapping("/login")
  @RequestLimit(frequency = 2)
  public ResultData<LoginVo> login(@RequestBody LoginParam param,
      HttpServletRequest servletRequest) {

    return ResultData.success(userService.login(param));
  }
}
