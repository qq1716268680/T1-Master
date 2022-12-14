package com.fiberhome.owtb.ofsc_crawler.config;
import com.fiberhome.owtb.ofsc_crawler.component.LoginHandlerInterceptor;
import com.fiberhome.owtb.ofsc_crawler.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // TODO Auto-generated method stub
        //WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/123").setViewName("/success");;
    }
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        WebMvcConfigurer webMvcCOnfigurer = new WebMvcConfigurer() {


            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/main.html").setViewName("dashboard");
            }
            @Override
            public void addInterceptors(InterceptorRegistry registry) {

                //WebMvcConfigurer.super.addInterceptors(registry);
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/","/index.html","/user/login","/asserts/**","/asserts/**","/favicon.ico");
            }

        };

        return webMvcCOnfigurer;
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocalResolver();
    }
}
