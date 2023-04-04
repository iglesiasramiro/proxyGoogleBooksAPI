Coding Exercise
=========================
Design a simple restful application which queries Google Book's API based on Author name and Book Title and stores the search results in a database asynchronously. The application also needs to have a lookup interface which can look up for data first in the DB based on Author or Title (and then the Google API). Also the application needs to be packaged and run as a container. User's should be able to invoke the API by tools such as PostMan/SOAPUI or should have a UI from which the data can be searched/stored and retrieved.

Prerequisites for runing with IDE
-------------
- JDK 1.8+
- MongoDB installed


Run with Docker
---
1. docker-compose up -d
2. go to swagger: http://localhost:8080/proxy-google-books/swagger-ui.html#/volume-controller/searchUsingGET
3. try searching book with author=Nadia Ghulam and title=La primera estrella de la noche


Description
---
The project has a docker-compose to run the app without any installation.
It has the app build/deploy and the mongodb service.
The requirements are Docker and docker-compose.  
