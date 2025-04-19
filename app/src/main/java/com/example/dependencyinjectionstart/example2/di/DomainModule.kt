package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
class DomainModule {

    @Provides
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }

}