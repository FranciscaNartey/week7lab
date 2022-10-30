/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataacces;


import java.io.Serializable;
import models.Role;

/**
 *
 * @author franc
 */
public class RoleDB implements Serializable { 
    
    String email;
    String firstname;
    String lastName;
    String password;
    Role role;
    
    
}
