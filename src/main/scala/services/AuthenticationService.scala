package services

import managers.DatabaseManager

object AuthenticationService {

  def authenticate(message: String): Boolean = {
    val accounts = DatabaseManager.loadData("accounts").fields
    val credentials = message.split("\\[").flatMap(s => s.split("\\]")).apply(1).split(":")

    while (accounts.hasNext) {
      val account = accounts.next
      return account.getKey == credentials(0) && account.getValue.asText() == credentials(1)
    }
    false
  }

}
