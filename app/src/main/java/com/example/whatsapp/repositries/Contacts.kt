package com.example.whatsapp.repositries

import com.example.whatsapp.R

data class Stories(val imageCover:Int,val name:String , val phone_number:String)

val story_one =  Stories(R.drawable.image1,"Alaa","0102436680")
val story_two =  Stories(R.drawable.image2,"Nour","0115478890")
val story_three =  Stories(R.drawable.image3,"Aya Elsayed","0123678904")
val story_four =  Stories(R.drawable.image4,"Samaa","0198759334")
val story_five=  Stories(R.drawable.image5,"Aya Hassan","0918745110")
val story_sex=  Stories(R.drawable.image6,"Sara","0109553910")
val story_seven =  Stories(R.drawable.image7,"Rana","0112843633")
val story_eight =  Stories(R.drawable.image8,"Doaa","0111678833")
val story_nine =  Stories(R.drawable.image9,"Amira","0102435669")
val story_ten =  Stories(R.drawable.image10,"Omar","0100623599")
val story_eleven=Stories(R.drawable.image11,"Ziad","0100038568")
val story_twe =  Stories(R.drawable.image10,"Salma","0144678904")
val story_thirteen =  Stories(R.drawable.image2,"Mom","010172287")

val Stories_container= arrayListOf(story_one,story_twe, story_five, story_ten,
    story_four, story_three, story_two, story_sex, story_eight, story_nine, story_seven, story_eleven,
    story_thirteen)