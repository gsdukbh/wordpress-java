package top.werls.wordpressj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.werls.wordpressj.common.file.FileManagers;
import top.werls.wordpressj.common.file.impl.FileLocal;



/**
 * 配置file 存储管理器 一个适配器
 * @author Jiawei Lee
 * @version 1
 * @date created 2022/7/20
 * @since on
 */
@Configuration
public class FileConfig {

    private final ConfigProperties configProperties;

    public FileConfig(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    @Bean
    public FileManagers fileManagers (){
        switch (configProperties.getFileConfig().getType()){
            case LOCAL -> {
                return  new FileLocal(configProperties.getFileConfig().getPath());
            }
            case  MINION -> {

            }
        }
        return null;
    }

}
