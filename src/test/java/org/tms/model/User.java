package org.tms.model;

public class User {

  //это тестовые креды для всех пользователей, указанные разработчиками на самом сайте https://www.saucedemo.com/
  
  private String name = System.getenv("username");
  private String password = System.getenv("password");

  public User() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
