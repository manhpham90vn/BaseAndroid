package com.example.baseandroid.repository

import com.example.baseandroid.data.Storage
import com.example.baseandroid.data.StorageConstants

interface AppLocalDataRepositoryInterface {
    fun isLogin(): Boolean

    fun getToken(): String
    fun setToken(token: String)
    fun cleanToken()

    fun getRefreshToken(): String
    fun setRefreshToken(token: String)
    fun cleanRefreshToken()
}

class AppLocalDataRepository(private val storage: Storage): AppLocalDataRepositoryInterface {
    override fun isLogin(): Boolean {
        return storage.getString(StorageConstants.token).isNotEmpty() && storage.getString(StorageConstants.refreshToken).isNotEmpty()
    }

    override fun getToken(): String {
        return storage.getString(StorageConstants.token)
    }

    override fun setToken(token: String) {
        storage.setString(StorageConstants.token, token)
    }

    override fun cleanToken() {
        storage.clearString(StorageConstants.token)
    }

    override fun getRefreshToken(): String {
        return storage.getString(StorageConstants.refreshToken)
    }

    override fun setRefreshToken(token: String) {
        storage.setString(StorageConstants.refreshToken, token)
    }

    override fun cleanRefreshToken() {
        storage.clearString(StorageConstants.refreshToken)
    }

}