package us.gopinath.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import us.gopinath.Entity.User;
import us.gopinath.Repository.UserRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method= RequestMethod.GET,value="/user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<User> getUserLogs() {

        return (List<User>)userRepository.findAll();
    }


    @RequestMapping(method= RequestMethod.POST,value="/user/{name}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public User verifyUser(@RequestBody User user, @PathVariable String name) throws IOException {

        return userRepository.findOne(1);

        /*
        ArrayList<User> users = new ArrayList<>(userRepository.findAll());

        for(int i = 0 ; i < users.size() ; ++i){
            if(users.get(i).getName().equals(user.getName()) && users.get(i).getPassword().equals(user.getPassword()) ){
               return users.get(i);
            }
        }

        return null;

        */


    }


}
