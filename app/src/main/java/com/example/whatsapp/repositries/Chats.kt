package com.example.whatsapp.repositries

import com.example.whatsapp.R

data class Chats(val imageCover: Int, val name: String, val message:String , val date:String)
val chat_one =  Chats(R.drawable.image1,"Alaa","Stay positive and keep pushing forward. ","16/4/2023")
val chat_two =  Chats(R.drawable.image2,"Nour","Believe in yourself, and you're halfway there.","13/4/2023")
val chat_three =  Chats(R.drawable.image3,"Aya Elsayed","Small steps today lead to big dreams tomorrow.","12/4/2023")
val chat_four =  Chats(R.drawable.image4,"Samaa","You are stronger than you think.","12/4/2023")
val chat_five=  Chats(R.drawable.image5,"Aya Hassan","Every day is a new chance to make a difference.","11/4/2023")
val chat_sex=  Chats(R.drawable.image6,"Sara","Difficult roads often lead to beautiful destinations.","10/4/2023")
val chat_seven =  Chats(R.drawable.image7,"Rana","Progress, not perfection.","10/4/2023")
val chat_eight =  Chats(R.drawable.image8,"Doaa","Chase your dreams, not your fears.","15/2/2023")
val chat_nine =  Chats(R.drawable.image9,"Amira","Don't wait for opportunity, create it.","30/1/2023")
val chat_ten =  Chats(R.drawable.image10,"Omar","Keep going, you're on the right track.","17/1/2023")
val chat_eleven=Chats(R.drawable.image4,"Mom","You are stronger than you think.","12/4/2023")
val chat_twe =  Chats(R.drawable.image11,"Dad","Keep going, you're on the right track.","17/1/2023")

val chats_container= arrayListOf(chat_one,chat_twe, chat_five, chat_ten,
    chat_four, chat_three, chat_two, chat_sex, chat_eight, chat_nine, chat_seven, chat_eleven)