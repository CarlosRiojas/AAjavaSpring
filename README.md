# AAjavaSpring - core
 
## What did I Learned in this course?

I learned what core Spring is, what is it used for, and the amount of libraries it can hold,the concept of Inversion of control, JPA and Spring Data, connecting our app to a SQL database, mapping objects as table entities and manipulate them, access the database using CrudRepository and create a controller and define end points.


## How is this repository structured?

The course led to the creation of a marketplace called platzi market,so it´s divided into the common backend layers, the domain,the persistance and the web layer; in the Domain layer, we have the DTO which we used to authenticate the user, the Repository, which refers to the interface that provides the methods to make queries to the DB,and the service package is used to generate the service methods that provide the communication between the repository and the persistance layer.

In the persistance Layer,we have the CRUD,the Entities and the Mapper; this is the bottomest of layers in which the business logic is written,in the CRUD, we  write to add, read update and delete items to our database, then there's the Entity package which is where we hold the information regarding each table entity and map those objects that represent the tables to our database tables, we also define relationships there.The mapper, maps the repository methods and connects them to the entities so we can later on move those repository methods to the controllers.

in the Web layer is where our controllers are, which is the highest layer of our system, is the last line that communicates,recieves and gives requests in the shape of GET POST or DELETE, there's a swagger file in case you want to see the end point in a graphical interface.

* [Main Layers](../master/src/main/java/com/platzy/market)
*  [Domain](../master/src/main/java/com/platzy/market/domain)
*  [Repository](../master/src/main/java/com/platzy/market/domain/repository)
*  [dto](../master/src/main/java/com/platzy/market/domain/dto)



