package fr.test.solera.repository

import fr.test.solera.repository.model.LombokData

interface IKotlinRepository {

    fun getVersion(): LombokData
}