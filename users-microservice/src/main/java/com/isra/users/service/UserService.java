package com.isra.users.service;
import com.isra.users.entities.Role;
import com.isra.users.entities.User;
public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}