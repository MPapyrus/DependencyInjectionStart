package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.Component

@Component(
    modules = [
        DomainModule::class,
        DataModule::class,
        ContextModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

}