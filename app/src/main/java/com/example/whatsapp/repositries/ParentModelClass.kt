package com.example.whatsapp.repositries


data class ParentModelClass(var title: String, var childModelClassList: List<GeneralModel>)

val top_scientists = ParentModelClass("Top Scientists", ContactList)
val top_companies = ParentModelClass("Top Companies", ContactList2)
val stories= ParentModelClass("Stories" , StoriesList)

val parent_List = arrayListOf(
     stories, top_scientists, top_companies
)