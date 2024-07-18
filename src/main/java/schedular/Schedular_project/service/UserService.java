package schedular.Schedular_project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import schedular.Schedular_project.dao.UserDao;
import schedular.Schedular_project.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    Logger log= LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserDao dao;

    //schedule the schedular to add thee object in database(every five seconds )

    @Scheduled(fixedRate = 5000)
    public void add2databse(){
        User user=new User();
        user.setName("user"+new Random().nextInt(23554));
        dao.save(user);
        System.out.println("add service called "+new Date().toString());
    }


    @Scheduled(cron = "0/15 * * * * *")
    public void fetch(){
        List<User> user_list=dao.findAll();
        System.out.println("fetch service called "+new Date().toString());
        System.out.println("No of records "+ user_list.size());
        log.info("users{}",user_list);


    }

    @Scheduled(cron = "0/3 * * * * *")
    public void delete(){
        List<User> user_list=dao.findAll();
        System.out.println("delete service called "+new Date().toString());
        user_list.removeAll(user_list);

    }

    @Scheduled(cron = "0/5 * * * * *")
    public void check(){
        List<User> list=dao.findAll();
        System.out.println("checking ....");
        if(list!=null)
            System.out.println("the list is not empty");
        else
            System.out.println("the list is empty...");


    }













}
