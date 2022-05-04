package org.knoldus.boostrap.userManagement

class User(var username: String) {
    override def toString = s"username: $username; user type: $userType"

    val userType = "user"

    def updateUsername(newUsername: String): String = {
        username = newUsername

        username
    }

}
class Customer(username: String) extends User(username) {
    override val userType = "customer"

}

class Admin(username: String) extends User(username) {
    override val userType = "admin"

}