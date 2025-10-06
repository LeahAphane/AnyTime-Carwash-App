package com.example.anytimecarwash.data

data class BookingResponse(
    val success: Boolean,
    val message: String,
    val booking: Booking? = null
)