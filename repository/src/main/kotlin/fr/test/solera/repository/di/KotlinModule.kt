package fr.test.solera.repository.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.test.solera.repository.IKotlinRepository
import fr.test.solera.repository.KotlinRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface KotlinModule {
    @Binds
    @Singleton
    fun provideKotlinRepository(impl:KotlinRepository): IKotlinRepository
}