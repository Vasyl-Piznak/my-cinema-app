# <img height="30" src="https://cdn-icons-png.flaticon.com/512/3418/3418886.png" width="30"/> Cinema-app <img height="30" src="https://cdn-icons-png.flaticon.com/512/3418/3418886.png" width="30"/>
## Project description:

This project is an imitation of working cinema app for registered users, where they can purchase tickets for a movie.
The app supports registration, authentication, authorization (that based to roles of users) and CRUD operations.


<img height="500" src="https://www.linguahouse.com/linguafiles/md5/c1a891a2958ae7c85915f28d4aaa3da1" width="950"/>


 ##  <img height="30" src="https://cdn-icons-png.flaticon.com/512/2790/2790295.png" width="30"/> Project structure:

- Data access tier -> handled by DAO;
- Business logic tier -> handled by Service;
- Presentation tier -> handled by Controllers.


 ## <img height="30" src="https://img.freepik.com/free-vector/illustration-social-media-concept_53876-18383.jpg?w=2000" width="30"/> Technologies used:

- <img height="30" src="https://cdn-icons-png.flaticon.com/512/5968/5968282.png" width="36"/> Java (version 18.0.1)
- <img height="30" src="https://images.sftcdn.net/images/t_app-logo-xl,f_auto,dpr_2/p/6ca8194c-164f-4718-930a-2bed171d0430/1359200834/apache-maven-maven-logo.png" width="36"/> Maven (version 3.11.4)
- <img height="30" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsGDWZvGnIggXi_v9xMGaW9qZrlPaFz_Cjjw&usqp=CAU" width="36"/> JDBC for connection to DB
- <img height="30" src="https://camo.githubusercontent.com/f85f882cb31eeaeee657ec955313015c30378e8f56c3dc2f06933b617a276cfd/68747470733a2f2f77372e706e6777696e672e636f6d2f706e67732f3734372f3739382f706e672d7472616e73706172656e742d6d7973716c2d6c6f676f2d6d7973716c2d64617461626173652d7765622d646576656c6f706d656e742d636f6d70757465722d736f6674776172652d646f6c7068696e2d6d6172696e652d6d616d6d616c2d616e696d616c732d746578742d7468756d626e61696c2e706e67" width="36"/> MySQL as database (version 8.0.22)
- <img height="30" src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Apache_Tomcat_logo.svg/1280px-Apache_Tomcat_logo.svg.png" width="36"/> Apache Tomcat as web server (version 9.0.73)
- <img height="30" src="https://static-00.iconduck.com/assets.00/hibernate-icon-491x512-qd6jy16p.png" width="30"/> Hibernate (version 6.1.6.Final)
- <img height="30" src="https://www.svgrepo.com/show/354380/spring-icon.svg" width="30"/> Spring, Spring MVC, Spring Security (version 5.3.20)

## <img height="30" src="https://www.svgrepo.com/show/224774/database.svg" width="30"/> DataBase structure:
![image](https://github.com/Vasyl-Piznak/my-cinema-app/assets/106866989/d095ac55-8132-4c75-844a-2801f684e467)


 ## <img height="30" src="https://cdn4.iconfinder.com/data/icons/survey-3/48/bl_478_real_time_features_live_internet_streaming_results_statistics_reports-512.png" width="30"/> Functionalities (access to endpoints by users roles):

When you enter the site, you will be a guest and you will have access to such services:
* Login
* Register

When you log in as a `USER`, you will be able to do this actions:
* See all information of movies, cinema halls and movies sessions
* Add a ticket to the shopping cart
* Create order
* See order history
* Logout

When you log in as a `ADMIN`, you will be able to do this actions:
* See all information of movies, cinema halls and movies sessions
* Create, modify and delete cinema-hall, movies, and movie sessions from the database
* Get info about user by email
* Logout

## <img height="30" src="https://cdn-icons-png.flaticon.com/512/4703/4703650.png" width="30"/> How to launch the project on your PC:

### Necessary tools :
* Intellij IDEA Ultimate
* MySql
* Apache Tomcat

1. Clone this project
2. Add new configuration TomCat Local server
3. Change username and password in db.properties
4. Create schema in MySQL
5. Run the application
6. Use Postman for sending your requests during testing this application
