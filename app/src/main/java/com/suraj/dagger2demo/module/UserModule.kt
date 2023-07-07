package com.suraj.dagger2demo.module

import com.suraj.dagger2demo.FireBaseUserRepository
import com.suraj.dagger2demo.SqlUserRepository
import com.suraj.dagger2demo.UserRepo
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserModule {
//    @Provides
//    fun getUserRepo(): UserRepo {
//        return SqlUserRepository()
//    }

//    @Provides
//    fun getSqlRepository(sqlUserRepository: SqlUserRepository) : UserRepo{
//        return sqlUserRepository
//    }

    @Binds
    @Singleton
    abstract fun getSqlRepository(sqlUserRepository: SqlUserRepository) : UserRepo
}