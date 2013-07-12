package org.example.broker.service

import org.fusesource.hawtdispatch._
import org.fusesource.hawtdispatch.DispatchQueue
import org.apache.activemq.apollo.broker.Broker
import org.apache.activemq.apollo.util._

class TestService extends BaseService with Logging {

  /* It will be injected */
  var broker: Broker = null
  override val dispatch_queue: DispatchQueue = createQueue("Hello plugin queue")

  protected def _start(on_completed: Task) = {
    info("Hello world!")

    System.out.println("[TestService] starting up")

    on_completed.run()
  }

  protected def _stop(on_completed: Task) = {
    info("Bye world!")

    System.out.println("[TestService] stopping")

    on_completed.run()
  }

}
