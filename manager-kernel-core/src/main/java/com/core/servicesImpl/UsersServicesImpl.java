/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.servicesImpl;

import com.core.entities.Users;
import com.core.repository.UsersRepository;
import com.core.services.UsersServices;
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
public class UsersServicesImpl implements UsersServices{
   
    private final UsersRepository usersRepository;
    public UsersServicesImpl(UsersRepository usersRepository) {
      
        super();
        this.usersRepository = usersRepository;
    }
      public List<Users> findAllUsers() {
        var usu = usersRepository.findAll();
        var users = new ArrayList<Users>();
        usu.forEach(user -> users.add(user));
        return users;
    }
    
    public Optional<Users> findById(Long id) {
        var cereal = usersRepository.findById(id);
        
        try {
            return cereal;
        } catch (Exception ex) {
           Logger.getLogger(UsersServices.class.getName()).log(Level.SEVERE, null, ex);
           return cereal;
        }
    }

    
    public Long counter() {
        return usersRepository.count();
    }
    
    public void deleteUserById(Long idKey) {
        usersRepository.deleteById(idKey);
       
    }

    

    

   
  

 

    
   

 

  

}
