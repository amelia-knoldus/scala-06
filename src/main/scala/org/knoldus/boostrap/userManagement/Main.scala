package org.knoldus.boostrap.userManagement

object Main {
    def main(args: Array[String]): Unit = {

        println("\nWelcome to User Management\n")

        val customer1 = UserManagement.addUser("Johnny", "customer")

        val admin1 = UserManagement.addUser("Jane", "admin")

        println("--- All Users ---\n")
        UserManagement.listUsers

        println("\n> Updating admin {username: Jane} ...\n")
        
        admin1.updateUsername("Marybeth")

        println("--- All Users ---\n")
        UserManagement.listUsers

        println("\n> Deleting customer {username: Johnny} ...\n")

        UserManagement.deleteUser("Johnny")

        println("--- All Users ---\n")
        UserManagement.listUsers

    }


}