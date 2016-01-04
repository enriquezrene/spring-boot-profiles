# spring-boot-profiles
A project showing the profiles feature in spring boot

## Two profiles configured 
<pre>
	src/main/resources/application.yml
</pre>

- prod
- dev


You can test them, changing the values in application.yml file in this section:
<pre>
spring:
  profiles.active: prod
</pre>


This property is being used here:

<pre>
package com.ioet;

...

@Controller
@EnableAutoConfiguration
public class SampleController {

    @Value("${doge.wow}")
    private String name;

</pre>

Right click on Application.java file and run the app. Open the browser and request this link:


<pre>
http://localhost:8080/
</pre>

You will see the response:
<pre>
	Hello World! 4
	Hello World! 10
</pre>
