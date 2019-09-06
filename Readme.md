## Comod Event Aggregator/Delegator

Comod is an event aggregator/delegator and light function as a service context for events!

with an increase in the number of services, handling events are extremely mind-blowing! An extra interface needed to be designed for each specific event type on each of the services, mainly the events that sourced from a third-party publisher like Github. Meanwhile, passing an event rawly to all services is a dangerously easy way out! each service just needed a part of data that bundled on an event and passing all part of data to all services can put an overhead on your network I/O and make your service-mesh less reliable in the face of event data structure changes! Comod as an event aggregator/delegator can handle all event-based stuff on your service mesh, Catch an event from a publisher, review the received event and shrink it to multi parts, send each part to the consumer services, save important parts on several data sources, notify external webhooks, change event structure and run scripts.

### System Diagram

![module diagram](/assets/sys_diagram.svg?sanitize=1)

## Source

The source code of Comod is in it's initial state and is available under [develop](https://github.com/makbn/comod/tree/develop) branch
## Technologies

* [Akka HTTP](https://doc.akka.io/docs/akka-http/current/introduction.html)
* [Akka Actor](https://doc.akka.io/docs/akka/current/guide/introduction.html)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Framwork](https://spring.io/projects/spring-framework)
* Java 8


## License

Comod is licensed under the [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
