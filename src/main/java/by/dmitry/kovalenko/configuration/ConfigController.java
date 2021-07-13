package by.dmitry.kovalenko.configuration;

/**
 * Created by user on 24.06.2019.
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class ConfigController  implements WebMvcConfigurer {

        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/").setViewName("main");
            registry.addViewController("/login").setViewName("login");
        }

    }

