package by.dmitry.kovalenko.service;

import by.dmitry.kovalenko.model.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by user on 03.06.2019.
 */
public class MyUserPrincipal implements UserDetails {

    public String getPassword(){
    return user.getPassword();
    }
    ;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getUsername(){

        return user.getLogin();
    }
    public  boolean isAccountNonExpired(){
        return true;
    }

    public boolean isAccountNonLocked(){
        return true;
    }

    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    public boolean isEnabled(){
        return true;
    }

    private User user;

        public MyUserPrincipal(User user) {
        this.user = user;
    }

}
