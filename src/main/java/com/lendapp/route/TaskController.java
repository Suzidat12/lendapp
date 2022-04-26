/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lendapp.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author OLASUNKANMI
 */
@RestController
@RequestMapping("/task")
public class TaskController {
    Logger logger = LoggerFactory.getLogger(TaskController.class);
  @GetMapping("/fetch")
    public ResponseEntity fetch(){
      logger.error("Error happend");
        return  ResponseEntity.ok("Task saved successfully");

  }
}
