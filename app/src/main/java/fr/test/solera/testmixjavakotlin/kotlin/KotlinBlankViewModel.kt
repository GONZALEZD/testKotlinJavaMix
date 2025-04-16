package fr.test.solera.testmixjavakotlin.kotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.test.solera.testmixjavakotlin.repository.IKotlinRepository
import javax.inject.Inject

@HiltViewModel
class KotlinBlankViewModel @Inject constructor(val repository: IKotlinRepository) : ViewModel() {
    val numberLiveData:LiveData<Int> by lazy {
        val liveData = MutableLiveData<Int>()
        liveData.postValue(retrieveNumber())
        liveData
    }

    private fun retrieveNumber(): Int = repository.getVersion().number
}