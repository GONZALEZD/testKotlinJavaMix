package fr.test.solera.testmixjavakotlin.repository

import fr.test.solera.testmixjavakotlin.model.LombokData
import javax.inject.Inject

class KotlinRepository @Inject constructor() : IKotlinRepository {
    override fun getVersion(): LombokData = LombokData(142)
}