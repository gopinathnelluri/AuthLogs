package us.gopinath.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import us.gopinath.Entity.UsersLogs;
import us.gopinath.Repository.UserLogsRepository;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class UsersLogsController {

    private UserLogsRepository userLogsRepository;

    public UsersLogsController(UserLogsRepository userLogsRepository) {
        this.userLogsRepository = userLogsRepository;
    }

    @RequestMapping(method= RequestMethod.GET,value="/logs",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<UsersLogs> getUserLogs() {

        return userLogsRepository.findAll();
    }


    @RequestMapping(method= RequestMethod.GET,value="/logs/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<UsersLogs> getUserLogs(@PathVariable String id) {

        ArrayList<UsersLogs> userLogs = new ArrayList<>(userLogsRepository.findAll());

        ArrayList<UsersLogs> ul = new ArrayList<>();



        for(int i = 0 ; i < userLogs.size() ; ++i){
           String userId= userLogs.get(i).getUserId();
           if(userId.equalsIgnoreCase(id)){
               ul.add(userLogs.get(i));
           }
        }



        return ul;


    }

    @RequestMapping(method= RequestMethod.POST,value="/logs", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public void addLogs(@RequestBody UsersLogs usersLogs) throws IOException {

        userLogsRepository.save(usersLogs);
    }
}
