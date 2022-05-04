package org.knoldus.boostrap.userManagement

import TestData._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserSpec extends AnyFlatSpec with Matchers {

    "new Customer(\"Bob\")" should "instantiate Customer with username: Bob and userType: customer" in {

        customer1.username shouldEqual "Bob"
        customer1.userType shouldEqual "customer"

    }

    "new Admin(\"Carmen\")" should "instantiate Admin with username: Carmen and userType: admin" in {

        admin1.username shouldEqual "Carmen"
        admin1.userType shouldEqual "admin"

    }

    "new User(\"Anne\")" should "instantiate User with username: Anne and userType: user" in {

        user1.username shouldEqual "Anne"
        user1.userType shouldEqual "user"

    }

    "customer2.updateUsername(\"Pawel\")" should "change the username of customer2 from Piotr to Pawel" in {

        customer2.username shouldEqual "Piotr"
        
        customer2.updateUsername("Pawel") shouldEqual "Pawel"
        customer2.username shouldEqual "Pawel"

    }
    
}