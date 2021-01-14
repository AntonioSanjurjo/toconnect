package com.example.prueba_desconecta.ui.ui.elije

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba_desconecta.R
import kotlinx.android.synthetic.main.activity_elige.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.nav_view

lateinit var toggle: ActionBarDrawerToggle

class Elige : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elige)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        toggle = ActionBarDrawerToggle(this, drawer2, R.string.open, R.string.close)
        drawer2.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.Experience -> {
                    //(val a = Intent(this, VisitasPasadas::class.java)
                    //startActivity(a)
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(toggle.onOptionsItemSelected(item)){return true}
        return super.onOptionsItemSelected(item)
    }

}