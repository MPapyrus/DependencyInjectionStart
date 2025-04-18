package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        DomainModule::class,
        DataModule::class,
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)


    @Component.Builder
    interface ApplicationComponentBuilder {


        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun currentTime(timeMillis: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent

    }
}