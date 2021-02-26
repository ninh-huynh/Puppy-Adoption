package com.example.androiddevchallenge

import kotlinx.serialization.Serializable

@Serializable
data class Pet(
    val petId: Int = 0,
    val name: String = "Finn",
    val about: String = "The beagle is a breed of small hound that is similar in appearance " +
            "to the much larger foxhound. The beagle is a scent hound, developed primarily " +
            "for hunting hare (beagling). Possessing a great sense of smell and " +
            "superior tracking instincts, the beagle is the primary breed used as detection dogs " +
            "for prohibited agricultural imports and foodstuffs in quarantine around the world. " +
            "The beagle is intelligent. It is a popular pet due to its size, good temper, and " +
            "a lack of inherited health problems.",
    val gender: String = "Male",
    val breed: String = "Beagle",
    val imageUrl: String = "https://upload.wikimedia.org/wikipedia/commons/d/de/Beagle_Upsy.jpg",
)
