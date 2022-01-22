package uia.com.api.mvc.apimvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.SpringServletContainerInitializer;

@Configuration
@ComponentScan(basePackages = "uia.com.api")
@Import({AppMvcConfig.class})
@SpringBootApplication
class ApiMvcApplication extends SpringServletContainerInitializer {

    private static Class applicationClass = ApiMvcApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(ApiMvcApplication.class, args);
    }


    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return  application.sources(applicationClass);
    }

}
