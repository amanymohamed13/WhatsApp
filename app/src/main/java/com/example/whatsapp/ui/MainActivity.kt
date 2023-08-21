package com.example.whatsapp.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.whatsapp.R
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragmentChat=ChatFragment()
        val fragmentStory=StoriesFragments()
        val fragmentNested=NewsFragment()
        addFragment(fragmentChat)
    val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment,ChatFragment() )
                .commit()
        }

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.chats->
                {
                    replaceFragment(fragmentChat)
                    true
                }
                R.id.calls->{
                    replaceFragment(fragmentNested)
                    true
                }
                R.id.contacts->{
                    replaceFragment(fragmentStory)
                    true
                }
                else->false
            }
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
         transaction.replace(R.id.fragment,fragment)
        transaction.commit()
    }
    private fun addFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment,fragment)
        transaction.commit()
    }
}




