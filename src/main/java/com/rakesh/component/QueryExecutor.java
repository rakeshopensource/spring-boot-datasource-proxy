package com.rakesh.component;

import com.rakesh.modal.User;
import com.rakesh.repository.UserRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Log
@Component
public class QueryExecutor implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationContext appContext;

    @Override
    public void run(String... args) throws Exception {
        logBean();
        saveUser();
    }

    private void logBean() {
        log.info("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = appContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            log.info(beanName);
        }
    }

    private void saveUser() {
        User user = new User();
        user.setName("Dhariya");
        user.setAge(3);
        userRepository.save(user);
    }


}
