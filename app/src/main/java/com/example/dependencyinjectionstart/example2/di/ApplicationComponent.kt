package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example1.Activity
import com.example.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.example.dependencyinjectionstart.example2.data.network.ExampleApiService
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(
    modules = [
        DomainModule::class,
        DataModule::class,
    ]
)
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}