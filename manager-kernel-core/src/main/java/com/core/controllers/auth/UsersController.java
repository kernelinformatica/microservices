/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.controllers.auth;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.core.dtos.AppCodeDTO;
import com.core.dtos.UsersDTO;
import com.core.entities.Users;
import com.core.servicesImpl.UsersServicesImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.sun.jdi.LongValue;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import static org.springframework.http.RequestEntity.post;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Context;


/**
 *
 * @author Dario
 */
@RestController 

public class UsersController {
    private final UsersServicesImpl usersService;
    public UsersController(UsersServicesImpl usuService) {
        this.usersService = usuService;
    }
    
    
   
    
    
    
   @GetMapping("/users")
   public List<UsersDTO> getListarTodosLosUsuarios(){
      ModelMapper modelMapper = new ModelMapper();
      List<UsersDTO> users = usersService.findAllUsers().stream().map(
              get->modelMapper.map(get, UsersDTO.class )).
              collect(Collectors.toList());
      return   users;  
    }
    /*@PostMapping("/users")
    public List<UsersDTO> postListarTodosLosUsuarios(){
      // agregar mis validaciones de token users etc
      
      ModelMapper modelMapper = new ModelMapper();
      List<UsersDTO> users = usersService.findAllUsers().stream().map(
              get->modelMapper.map(get, UsersDTO.class )).
              collect(Collectors.toList());
      return   users;  
    }*/
    @GetMapping("users/counter")
    public Long contarLosUsuarios(){
        return usersService.counter();
    }
   
   @PostMapping("user/{idKey}")
   public Optional<Users> traerUsuario(@PathVariable Long idKey){
       return usersService.findById(idKey);
    }
   @DeleteMapping("/user/{idKey}")
    public void borrarUsuario(@PathVariable String idKey) {
         Long idUser = Long.parseLong(idKey);
        usersService.deleteUserById(idUser);
    }
    
  
    @PostMapping(path = "/user/add")
    public String agregarUsuario(@RequestBody Users usuers) {
    //reemplazar respuesta string a void
    return ("---> agregarUsuario()");
    }
    
    
   @RequestMapping(value = "/user/login/{username}{clave}", method = RequestMethod.POST)
    @ResponseBody
     public Optional<Users> UserObj(@PathVariable("idKey") Long idKey ){
        return usersService.findById(idKey);
    }

    
}
