package fr.test.solera.repository;

import javax.inject.Inject;

import fr.test.solera.repository.model.LombokData;

public class JavaRepository implements IJavaRepository{
    @Inject
    public JavaRepository() {}

    @Override
    public LombokData getVersion() {
        return new LombokData(42);
    }
}
