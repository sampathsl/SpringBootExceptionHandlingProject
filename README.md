# Sample SpringBoot 2.x Exception Handling Project
    Sample Spring Boot 2.x Exception Handling Project
    
## Getting Started
    
    First clone the project - git clone https://github.com/sampathsl/SpringBootExceptionHandlingProject.git
    Go to the SpringBootExceptionHandlingProject folder.
    Execute command (in this case it will automatically download the dependencies) - mvn clean install
    To run the project you need to have configure the maven in your machine.
    Run the project - mvn spring-boot:run

## Acknowledgments

    https://gist.github.com/jonikarppinen/662c38fb57a23de61c8b
    https://www.javadevjournal.com/spring/exception-handling-for-rest-with-spring/
    https://www.logicbig.com/tutorials/spring-framework/spring-boot/implementing-error-controller.html
    https://www.javainuse.com/spring/boot-exception-handling
    http://www.springboottutorial.com/spring-boot-unit-testing-and-mocking-with-mockito-and-junit
    https://www.baeldung.com/injecting-mocks-in-spring
    
## Analyzing a Maven Project using sonarQube :

    Put the settings.xml file to .m2 folder (.m2 folder is located at your OS profile folder)
    Example :
    On Linux or MacOS -> /home/<profile_name>/.m2
    On Windows -> C:\Users\<profile_name>/.m2
    After that load a command prompt and run following command.
    mvn clean verify sonar:sonar
    Test Coverage : 100%
    
## License

    This project is licensed under the MIT License (Feel free to edit)