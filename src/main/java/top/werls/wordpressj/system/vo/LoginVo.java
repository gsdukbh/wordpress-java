package top.werls.wordpressj.system.vo;


import lombok.Data;
import top.werls.wordpressj.system.entity.SysUser;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author leejiawei
 */
@Data
public class LoginVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 12L;

    SysUser user;
    String token;
}
