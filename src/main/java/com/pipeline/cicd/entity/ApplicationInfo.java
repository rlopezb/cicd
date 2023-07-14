package com.pipeline.cicd.entity;

import java.util.Calendar;
import java.util.Date;

public class ApplicationInfo {
  public final String description = "CI/CD SpringBoot application example";
  public final String author = "rlopezb@gmail.com";
  public final String github = "https://github.com/rlopezb";
  public final Date compiled;
  public final String version = "0.0.2-SNAPSHOT";
  public final Date now = new Date();

  public ApplicationInfo() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2023, Calendar.JULY, 14, 19, 28,0);
    calendar.set(Calendar.MILLISECOND, 0);
    compiled = calendar.getTime();
  }

  public Date getCompiled() {
    return compiled;
  }

  public String getDescription() {
    return description;
  }

  public Date getNow() {
    return now;
  }

  public String getVersion() {
    return version;
  }

  public String getAuthor() {
    return author;
  }

  public String getGithub() {
    return github;
  }
}
