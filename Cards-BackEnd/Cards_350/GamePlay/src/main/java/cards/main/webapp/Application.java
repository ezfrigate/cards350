package cards.main.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"cards"})
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
    	Logger logger = LoggerFactory.getLogger(Application.class);
    	logger.info("Application is being Loaded");
        SpringApplication.run(Application.class, args);
    }
}
