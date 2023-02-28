package com.example.edmpet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard);
        val fragmentHome = FragmentHome()
        val fragmentWallet = FragmentWallet()
        val fragmentInvest = FragmentInvest()
        val fragmentAccount = FragmentAccount()

        makeCurrentFragment(FragmentHome)

        navigation_b
    }

    private fun makeCurrentFragment(fragmen: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.menu_dashboard, fragmen)
            commit()
        }
}