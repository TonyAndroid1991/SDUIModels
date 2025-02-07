package com.kingmakers.createmodels

interface MappableToDomain<out T> {
    fun toDomain(): T
}