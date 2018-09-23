package io.github.sampathsl.SpringBootExceptionHandling;

import io.github.sampathsl.springboot.exceptionhandling.SpringBootExceptionHandlingApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootExceptionHandlingApplication.class)
public class SpringBootExceptionHandlingApplicationTests {

  @Test
  public void contextLoads() {}

  @Test
  public void main() {
    SpringBootExceptionHandlingApplication.main(new String[] {});
  }
}
