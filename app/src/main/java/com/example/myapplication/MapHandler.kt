package com.example.myapplication

class MapHandler {
    val map: Map1 = Map1()
    fun useMap() {
        map.goToPosition(Pair(0.5, 4.2))
        map.showRoute(listOf(Pair(0.5, 4.2), Pair(0.6, 4.2)))
        map.markArea(Pair(0.5, 4.2), Pair(0.6, 4.2))
    }
}