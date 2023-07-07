package com.suraj.dagger2demo.component

import com.suraj.dagger2demo.module.AnalyticModule
import com.suraj.dagger2demo.services.AnalyticsService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticModule::class])
interface AppComponent {
    fun getAnalyticService() : AnalyticsService
}