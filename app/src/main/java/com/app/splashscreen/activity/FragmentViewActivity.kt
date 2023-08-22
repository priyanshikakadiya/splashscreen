package com.app.splashscreen.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.app.splashscreen.R
import com.app.splashscreen.databinding.ActivityFragmentViewBinding
import com.app.splashscreen.fragments.FragmentOne
import com.app.splashscreen.fragments.FragmentThree
import com.app.splashscreen.fragments.FragmentTwo

class FragmentViewActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityFragmentViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityFragmentViewBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        replaceFragment(FragmentOne())

        mBinding.btnOneFrag.setOnClickListener {
            replaceFragment(FragmentOne())
        }

        mBinding.btnTwoFrag.setOnClickListener {
            replaceFragment(FragmentTwo())
        }

        mBinding.btnThreeFrag.setOnClickListener {
            replaceFragment(FragmentThree())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentDemo, fragment)
        fragmentTransaction.commit()
    }
}