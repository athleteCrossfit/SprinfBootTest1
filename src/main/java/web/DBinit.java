package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.service.UserService;

import javax.annotation.PostConstruct;

@Component
class DbInit {

    private UserService userService;


    @Autowired
    public DbInit(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("ПРОВЕРКА");
    }
}