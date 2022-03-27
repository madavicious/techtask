package pl.madavicious.techtask.web;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.madavicious.techtask.interceptor.CorsInterceptor;

@Configuration
@EnableWebMvc
@PropertySource(value="classpath:application.properties")
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new CorsInterceptor());
        };
}
