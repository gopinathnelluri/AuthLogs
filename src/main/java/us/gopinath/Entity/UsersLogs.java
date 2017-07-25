package us.gopinath.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class UsersLogs {

    @Id
    private String timestamp;
    private String userId;
    private String ipAddress;

    public UsersLogs(String timestamp, String userId, String ipAddress) {
        this.timestamp = timestamp;
        this.userId = userId;
        this.ipAddress = ipAddress;
    }

    public  UsersLogs(){

    }

    public UsersLogs(UsersLogs usersLogs) {
        this.timestamp = usersLogs.timestamp;
        this.userId = usersLogs.userId;
        this.ipAddress = usersLogs.ipAddress;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}

