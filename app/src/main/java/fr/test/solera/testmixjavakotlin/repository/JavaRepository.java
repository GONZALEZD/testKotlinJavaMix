package fr.test.solera.testmixjavakotlin.repository;

import javax.inject.Inject;

import fr.test.solera.testmixjavakotlin.model.LombokData;

public class JavaRepository implements IJavaRepository{
    @Inject
    public JavaRepository() {}

    @Override
    public LombokData getVersion() {
        return new LombokData(42);
    }
}
