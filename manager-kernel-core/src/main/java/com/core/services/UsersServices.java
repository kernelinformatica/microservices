/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.services;

import com.core.entities.Users;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Dario
 */
@Service
public interface  UsersServices {
    
    public List<Users> findAllUsers ();
    public Optional<Users> findById(Long id);
    public Long counter();
    public void deleteUserById(Long idKey);
    

}
