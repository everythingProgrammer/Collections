package prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserProfile implements Prototype<UserProfile>{


    private String name;
    private String email;

    public Map<String, String> getPreferences() {
        return preferences;
    }

    public void setPreferences(Map<String, String> preferences) {
        this.preferences = preferences;
    }

    private Map<String,String> preferences ;
    private List<String> roles;

    UserProfile(){
        this.name ="";
        this.email ="";
        this.preferences  = new HashMap<>();
        this.roles = new ArrayList<>();
    }



    UserProfile(String name , String email, Map<String,String> pref , List<String> roles){
        this.name = name;
        this.email = email;
        this.preferences = pref;
        this.roles = roles;
    }

    UserProfile(UserProfile obj){
        this.name = obj.name;
        this.email = obj.email;

        this.preferences = obj.preferences==null?new HashMap<>() : new HashMap<>(obj.preferences );

        this.roles = obj.roles==null? new ArrayList<>(): new ArrayList<>(obj.roles);
    }

    @Override
    public UserProfile clone(){
        return new UserProfile(this);
    }

}
