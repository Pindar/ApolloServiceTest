# Installation / Packaging

call
```
mvn package
```

Then copy the generated JAR-file to the lib directory of your apollo activemq installation. Also add
```
<service id="myservice" kind="org.example.broker.service.TestService"/>
```
to the apollo.xml of your installation.

For more information consult http://activemq.apache.org/apollo/versions/1.6/website/documentation/extending-guide.html#Plugging_into_the_Broker_Lifecycle