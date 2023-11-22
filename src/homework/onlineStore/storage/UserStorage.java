package homework.onlineStore.storage;

import homework.onlineStore.model.User;
import homework.onlineStore.model.enums.UserType;
import homework.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {

    private Map<String, User> userMap = new HashMap<>();

    public void add(User user) {
        userMap.put(user.getEmail(), user);
        StorageSerializeUtil.serializeUserStorage(this);
    }

    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }


    public User getByEmail(String email) {
        return userMap.get(email);
    }

    public void printByType(UserType userType) {
        for (User value : userMap.values()) {
            if (value.getUserType() == userType) {
                System.out.println(value);
            }
        }
    }
}
