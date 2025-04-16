package fr.test.solera.testmixjavakotlin.repository.di;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import fr.test.solera.testmixjavakotlin.repository.IJavaRepository;
import fr.test.solera.testmixjavakotlin.repository.IKotlinRepository;
import fr.test.solera.testmixjavakotlin.repository.JavaRepository;
import fr.test.solera.testmixjavakotlin.repository.KotlinRepository;

@Module
@InstallIn(SingletonComponent.class)
public interface JavaModule {
    @Binds
    @Singleton
    IJavaRepository providesJavaRepository(JavaRepository impl);

    @Binds
    @Singleton
    IKotlinRepository providesKotlinRepository(KotlinRepository impl);
}
