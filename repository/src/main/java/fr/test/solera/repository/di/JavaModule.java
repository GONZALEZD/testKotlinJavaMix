package fr.test.solera.repository.di;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import fr.test.solera.repository.IJavaRepository;
import fr.test.solera.repository.JavaRepository;

@Module
@InstallIn(SingletonComponent.class)
public interface JavaModule {
    @Binds
    @Singleton
    IJavaRepository providesJavaRepository(JavaRepository impl);

//    @Binds
//    @Singleton
//    IKotlinRepository providesKotlinRepository(KotlinRepository impl);
}
