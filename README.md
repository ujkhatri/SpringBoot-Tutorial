# SpringBoot-Tutorial
This repository contains code examples of different use cases in SpringBoot and resources to learn Spring Boot.

<H2>Examples in this repository:</H2>
<ul>
    <li>GET and POST API implementation</li>
    <li>RestTemplate implementation - Making a POST API call</li>
    <li>@Cache annotation</li>
    <li>@Scheduled annotation</li>
    <li>@Bean annotation</li>
    <li>@Async annotation</li>
    <li>H2 In memory database</li>
    <li>Docker compose configuration</li>
    <li>Kibana logs</li>
    <li>MongoDB integration</li>
</ul>
<br>

<h3> Component Details </h3>
    <h4>H2 in-memory database</h4>
        <div> The H2 is the in-memory relational database that you can run as part of your spring-boot application, so you don't need to worry about running a database on local machine separately.</div>
        <div> Configuration: The configuration can be found in application.properties file</div>
        <div> H2 console can be accessed using the url: </div>


```
http://localhost:8080/h2-console
```
<br>

<h4> Docker-Compose file </h4>
    <div>docker-compose.yml file is the place where you can configure all your services at one place that you want to run with docker</div>
    <div>All the services defined can be created and run with a single command </div>

```
docker-compose up
```
<br>

<h4> The ELK stack - ElasticSearch, Logstash and Kibana </h4>
    <div> Kibana is a visualizer tool for the ElasticSearch Data </div>
    <div> You can access kibana at the following url</div>

```
http://localhost:5601/app/home#/
```
<br>

<h4> MongoDB </h4>
    <div>MongoDB is a very popular NoSQL database</div>
    <div> You can install MongoDB Compass to visualize and manage your MongoDB running instance</div>

<img alt="img.png" src="src/main/resources/readmeImages/MongoDB Compass.png"/>

<br>

<H3> Resources to learn Spring Boot </H3>
<ul>
    <li> Spring Framework Documentation - https://docs.spring.io/spring-framework/docs/current/reference/html/ </li>
    <li> Spring Boot Reference Documentation - https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/ </li>
    <li> Core Technologies - https://docs.spring.io/spring-framework/docs/current/reference/html/core.html </li>
    <li> Docker Compose - https://docs.docker.com/compose/ </li>
    <li> H2 - https://www.h2database.com/html/main.html </li>
</ul>
