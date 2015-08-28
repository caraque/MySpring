package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;

import java.util.List;

/**
 * Created by Christian Araque on 24/08/2015.
 */
public interface UserDao {

    public List<User> getUsers();

    public void saveUser(User user);

}
