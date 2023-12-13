# Solstice

### Overview

Solstice is an application tracking system being built for the University of Tahimi.

You have been contracted to help build a part of this system. Your task is to add
a RESTful API that allows creating and updating users to the system.

A skeleton implementation has been provided. The implementation current 
only supports retrieving the list of all users in the system. It needs to be 
extended to allow adding and updating users.

Thing to know:
- The application uses a layered architecture with a presentation layer, service layer and a data access layer
- The entry point to the presentation layer is in `UsersResource` class
- The service layer can be found in `UserServiceImpl` class
- The data access layer is in the `src/main/java/com/tempo/tycho/persistence` folder 

Technologies/Libraries used:

- Java
- Spring boot
- H2 (in-memory database)
- QueryDSL
- Liquibase
- Gradle

### Task

1. Add an endpoint that allows users to be added
2. Add an endpoint that allows users to be updated
3. Add unit tests (and integration tests)


