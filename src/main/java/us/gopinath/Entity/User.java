package us.gopinath.Entity;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;

@Entity
public class User {

    @Id
    private String uid;
    private String name;
    private String password;



    public User(){

    }

    public User(User user) {
        this.uid = user.uid;
        this.name = user.name;
        this.password = user.password;
    }

    public User(String uid, String name, String password) {
        this.uid = uid;
        this.name = name;
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

