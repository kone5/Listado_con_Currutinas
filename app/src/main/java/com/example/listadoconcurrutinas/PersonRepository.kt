package com.example.listadoconcurrutinas

interface PersonRepository {

    fun getPersons() : ArrayList<Person>
}