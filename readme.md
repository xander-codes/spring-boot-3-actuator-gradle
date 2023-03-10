_https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html_  

**endpoints:**  
auditevents: Exposes audit events information for the current application. Requires an AuditEventRepository bean.  

beans: Displays a complete list of all the Spring beans in your application.  

caches: Exposes available caches.  

conditions: Shows the conditions that were evaluated on configuration and auto-configuration classes and the reasons why they did or did not match.  

configprops: Displays a collated list of all @ConfigurationProperties.  

env: Exposes properties from Spring’s ConfigurableEnvironment.  

flyway: Shows any Flyway database migrations that have been applied. Requires one or more Flyway beans.  

health: Shows application health information.  

httpexchanges: Displays HTTP exchange information (by default, the last 100 HTTP request-response exchanges). Requires an HttpExchangeRepository bean.  

info: Displays arbitrary application info.  

integrationgraph: Shows the Spring Integration graph. Requires a dependency on spring-integration-core.  

loggers: Shows and modifies the configuration of loggers in the application.  

liquibase: Shows any Liquibase database migrations that have been applied. Requires one or more Liquibase beans.  

metrics: Shows “metrics” information for the current application.  

mappings: Displays a collated list of all @RequestMapping paths.  

quartz: Shows information about Quartz Scheduler jobs.  

scheduledtasks: Displays the scheduled tasks in your application.  

sessions: Allows retrieval and deletion of user sessions from a Spring Session-backed session store. Requires a servlet-based web application that uses Spring Session.  

shutdown: Lets the application be gracefully shutdown. Only works when using jar packaging. Disabled by default.  

startup: Shows the startup steps data collected by the ApplicationStartup. Requires the SpringApplication to be configured with a BufferingApplicationStartup.  

threaddump: Performs a thread dump.  
  
**If your application is a web application (Spring MVC, Spring WebFlux, or Jersey), you can use the following additional endpoints:**  

heapdump: Returns a heap dump file. On a HotSpot JVM, an HPROF-format file is returned. On an OpenJ9 JVM, a PHD-format file is returned.  

logfile: Returns the contents of the logfile (if the logging.file.name or the logging.file.path property has been set). Supports the use of the HTTP Range header to retrieve part of the log file’s content.  

prometheus: Exposes metrics in a format that can be scraped by a Prometheus server. Requires a dependency on micrometer-registry-prometheus.  
