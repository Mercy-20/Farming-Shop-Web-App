# Farming-Shop-Web-App


.Clone the repository to your local folder and unzip it after<br>
# Launch your netbeans
# Create database
.Click on services tab on your netbeans, expand database option, right click on java-db<br>
Database name:FarmingShopDB<br>
username: app<br>
password:123, click ok after<br>
.After it has been created, right-click on the database and select "connect"
# Connect the database to the application server
.Click on Services tab on your netbeans, start the server which is Glassfish server<br>
.Right-click on the server and select View Domain Admin Console<br>
Under Common Tasks panel, expand JDBC and Click on JDBC Connection Pools<br>
.Click on the DerbyPool link<br>
.Click on Additional Properties<br>
.Click on Add Property and add a url property with the following value: jdbc:derby://localhost1527/FarmingShopDB the url u can get it on the database that you created<br>
.Fill in all the information you used when creating database and save changes by clicking save button<br>
.Check if the created connection pool is working. Do this by clicking the Ping
button
# To test the application:
.Go to file and open the cloned project<br>
.deploy then run the application



