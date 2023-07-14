package com.pipeline.cicd.controller;

import com.pipeline.cicd.entity.ApplicationInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cicd")
public class CicdController {
  @GetMapping("now")
  public ApplicationInfo now(){
    return new ApplicationInfo();
  }
}
