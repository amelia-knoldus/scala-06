package org.knoldus.boostrap.userManagement

object UserManagement {
    private var allUsers = List[User]()

    def numUsers: Int = allUsers.size

    def addUser(username: String, userType: String = "user"): User = {
    
        val newUser = userType match {
            case "customer" => new Customer(s"$username")
            case "admin" => new Admin(s"$username")
            case _ => new User(s"$username")
        }
        
        allUsers = newUser +: allUsers

        newUser

    }

    def listUsers: Unit = for (user <- allUsers) println(s"${user.toString}")

    def deleteUser(username: String): List[User] = {
        
        val oldNumUsers = numUsers

        if (numUsers == 0) println("No users to delete!")
        else 
            allUsers = allUsers.filter(_.username != username)
            if (oldNumUsers == numUsers) println("No such user!")
            
        allUsers

    }
}