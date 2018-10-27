package services

import java.util.concurrent.atomic.AtomicInteger

class StatusService {



}

object StatusService {
  val totalConnectionsNumber = new AtomicInteger(0)
  val currentConnectionsNumber = new AtomicInteger(0)
}