package com.suraj.dagger2demo.module

import com.suraj.dagger2demo.services.AnalyticsService
import com.suraj.dagger2demo.services.MixPanel
import dagger.Module
import dagger.Provides

@Module
class AnalyticModule {

    @Provides
    fun getAnalyticService() : AnalyticsService{
        return MixPanel()
    }

}