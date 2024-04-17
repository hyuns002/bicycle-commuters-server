package com.capstone.jachulsa.repository

import com.capstone.jachulsa.collection.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String>{
    fun findByName(name: String): List<User>
}