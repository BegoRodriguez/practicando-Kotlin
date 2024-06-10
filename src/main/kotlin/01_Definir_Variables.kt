package org.example

/*
https://developer.android.com/codelabs/basic-android-kotlin-compose-variables?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-1%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-variables#2
Realiza un programa que imprima lo siguiente:

100 photos
10 photos deleted
90 photos left*/

fun main() {
    val initialPhotos = 100
    val deletedPhotos = 10

    println("$initialPhotos photos")
    println("$deletedPhotos deleted")
    println("${initialPhotos - deletedPhotos} left")
}