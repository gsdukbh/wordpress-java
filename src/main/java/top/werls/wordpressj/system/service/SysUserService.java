package top.werls.wordpressj.system.service;


import top.werls.wordpressj.system.param.LoginParam;
import top.werls.wordpressj.system.vo.LoginVo;

public interface SysUserService {


    /**
     *
     * 登录
     * @param param
     * @return
     */
    LoginVo login(LoginParam param);

}
