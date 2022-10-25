package com.bignerdranch.android.sandboxskyskanner

data class CreateRequest(
val market:String,
val locale:String,
val currency:String,
val queryLegs:List<QueryLegs>,
val cabinClass:String,
val adults:Int,
val childrenAges:List<Int>,
val includedCarriersIds:List<String>,
val excludedCarriersIds:List<String>,
val includedAgentsIds:List<String>,
val excludedAgentsIds:List<String>,
val includeSustainabilityData:Boolean,
val nearbyAirports:Boolean
)


data class QueryLegs(
    val originPlaceId:OriginPlaceId,
    val destinationPlaceId:DestinationPlaceId,
    val date: Date
    )
data class OriginPlaceId(
    val iata:String,
    val entityId:String
)
data class DestinationPlaceId(
    val iata: String,
    val entityId: String
)
data class Date(
    val year:Int,
    val month:Int,
    val day:Int
)
