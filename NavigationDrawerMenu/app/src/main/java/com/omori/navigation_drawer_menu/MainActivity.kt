package com.omori.navigation_drawer_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var toolbar: Toolbar
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.Home -> {
                Toast.makeText(baseContext, "You clicked the Home Button", Toast.LENGTH_SHORT).show()
            }
            R.id.Profile -> {
                Toast.makeText(baseContext, "You clicked the Profile Button", Toast.LENGTH_SHORT).show()
            }
            R.id.AppSettings -> {
                Toast.makeText(baseContext, "You clicked the AppSettings Button", Toast.LENGTH_SHORT).show()
            }
            R.id.Contact -> {
                Toast.makeText(baseContext, "You clicked the Contact Button", Toast.LENGTH_SHORT).show()
            }
        }

        return true
    }
}
