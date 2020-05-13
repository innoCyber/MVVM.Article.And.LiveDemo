package com.innocyber.mvvmarticlelivedemo.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class],version = 1)
abstract class UserDatabase:RoomDatabase() {

    abstract fun getUserDao(): UserDao

    companion object{
        @Volatile
        private var instance: UserDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance?:createDb(context).also {
                instance=it
            }
        }

        private fun createDb(context: Context)= Room.databaseBuilder(context.applicationContext,UserDatabase::class.java,"userdb.db").build()
    }
}