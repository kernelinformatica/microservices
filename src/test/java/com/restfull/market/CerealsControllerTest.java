/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.market;

import com.restfull.flexcore.controllers.ProductsController;
import com.restfull.flexcore.services.ProductsService;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author Dario
 */
public class CerealsControllerTest {
 
    private ProductsController cerealsController;
    private ProductsService cerealsServices;
 
    /*@Before
    public void init(){
        sampleService = mock(SampleService.class);
        sampleController = new SampleController(sampleService);
    }
 
    @Test
    public void sampleControllerShouldCallService() {
        String userName = "nroales";
        String expectedMessage = "message";
 
        when(sampleService.welcome(userName)).thenReturn(expectedMessage);
 
        String message = sampleController.welcome(userName);
 
        verify(sampleService).welcome(userName);
        assertTrue(message.equals(expectedMessage));    
    }*/
}