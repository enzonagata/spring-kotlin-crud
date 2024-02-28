package com.nagata.crud.service

import com.nagata.crud.model.User

interface UserService {

    fun getUsers(page: Int, size: Int): List<User>

    fun getUser(id: Long): User

    fun saveUser(user: User): User

    fun deleteUser(id: Long)
}