package ink.zhiyi.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 何为
 * @Daet 2020-03-19 21:06
 * @Description  配置项、扩展SpringMVC
 */
@Configuration
public class BeanConfig implements WebMvcConfigurer {

    //批量配置视图控制器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/archive.html").setViewName("archive");
        registry.addViewController("/classify.html").setViewName("classify");
        registry.addViewController("/introduction.html").setViewName("introduction");
        registry.addViewController("/coin.html").setViewName("coin");
    }
}
