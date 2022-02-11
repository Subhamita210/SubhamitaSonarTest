package com.subhamita.sonarTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SonarTestApplication {

  public static void main(String[] args) {
    //		SpringApplication.run(SonarTestApplication.class, args);

    for (int i = 0; i <= 10; i++) {
      log.info("run");
      //      log.error("""
      //              !!!!!!!!!!!!!!!
      //                   ERROR
      //              !!!!!!!!!!!!!!!
      //              """);
      log.info("demo");
    }
    System.out.println("Hi");
  }
}
