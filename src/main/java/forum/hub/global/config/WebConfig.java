package forum.hub.global.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry
//            .addInterceptor(new LogInterceptor())
//            .order(1)
//            .addPathPatterns("/**")
//            .excludePathPatterns("/css/**", "/*.ico", "/error");
//    }
}
