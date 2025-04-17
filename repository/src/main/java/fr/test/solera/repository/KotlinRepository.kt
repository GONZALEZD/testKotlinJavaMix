package fr.test.solera.repository

import fr.test.solera.repository.model.LombokData
import javax.inject.Inject

class KotlinRepository @Inject constructor() : IKotlinRepository {
    override fun getVersion(): LombokData =
        LombokData(142)
}