package fr.test.solera.testmixjavakotlin.java;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import fr.test.solera.testmixjavakotlin.repository.IJavaRepository;

@HiltViewModel
public class JavaBlankViewModel extends ViewModel {
    private MutableLiveData<Integer> numberLiveData = new MutableLiveData<>();

    private final IJavaRepository repository;

    @Inject
    public JavaBlankViewModel(IJavaRepository repository) {
        this.repository = repository;
    }

    public LiveData<Integer> getNumberLiveData() {
        retrieveNumber();
        return numberLiveData;
    }

    private void retrieveNumber() {
        numberLiveData.postValue(repository.getVersion().getNumber());
    }
}