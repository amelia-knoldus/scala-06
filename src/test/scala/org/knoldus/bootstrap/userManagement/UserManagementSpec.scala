package org.knoldus.bootstrap.userManagement
import org.knoldus.boostrap.userManagement.UserManagement

//import TestData._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserManagementSpec extends AnyFlatSpec with Matchers {

    "addUser(\"Priya\", \"customer\")" should "create new customer with username: Priya and increase size of allUsers by 1" in {
        val customer3 = UserManagement.addUser("Priya", "customer")
        
        customer3.username shouldEqual "Priya"
        customer3.userType shouldEqual "customer"

        UserManagement.numUsers shouldEqual 1

    }

    "addUser(\"Leah\", \"admin\")" should "create new admin with username: Leah and increase size of allUsers by 1" in {
        val admin2 = UserManagement.addUser("Leah", "admin")
        
        admin2.username shouldEqual "Leah"
        admin2.userType shouldEqual "admin"

        UserManagement.numUsers shouldEqual 2

    }

    "addUser(\"Manny\")" should "create new user with username: Manny and increase size of allUsers by 1" in {
        val user2 = UserManagement.addUser("Manny", "user")
        
        user2.username shouldEqual "Manny"
        user2.userType shouldEqual "user"

        UserManagement.numUsers shouldEqual 3

    }

    "deleteUser(\"Leah\")" should "delete the user with username: Leah and decrease size of allUsers by 1" in {
        UserManagement.deleteUser("Leah")

        UserManagement.numUsers shouldEqual 2

    }

    "trying to delete a user that does not exist" should "not change the size of allUsers" in {
        UserManagement.deleteUser("Jerome")

        UserManagement.numUsers shouldEqual 2

    }

    "listUsers" should "print a list of all users" in {
        
        UserManagement.listUsers shouldEqual ()

    }

}