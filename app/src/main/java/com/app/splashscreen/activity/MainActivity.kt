package com.app.splashscreen.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.app.splashscreen.R
import com.app.splashscreen.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var mainLayout: ConstraintLayout
    lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnListView.setOnClickListener(btnClickEvents)
        mBinding.btnRecyclerView.setOnClickListener(btnClickEvents)
        mBinding.btnAlertBox.setOnClickListener(btnClickEvents)
        mBinding.btnSnackBar.setOnClickListener(btnClickEvents)
        mBinding.btnPassData.setOnClickListener(btnClickEvents)
        mBinding.btnGridView.setOnClickListener(btnClickEvents)
        mBinding.btnFragment.setOnClickListener(btnClickEvents)
        mBinding.btnWebView.setOnClickListener(btnClickEvents)
//        mBinding.btnRoomDB.setOnClickListener(btnClickEvents)
    }


    private val btnClickEvents = View.OnClickListener { view ->
        when (view.id) {
            R.id.btnListView -> goToListActivity()
            R.id.btnRecyclerView -> goToRecyclerActivity()
            R.id.btnAlertBox -> showAlertBox()
            R.id.btnSnackBar -> showSnackBar()
            R.id.btnPassData -> passData()
            R.id.btnGridView -> gridView()
            R.id.btnFragment -> fragments()
            R.id.btnWebView -> openWebView()
//            R.id.btnRoomDB -> goToRoomDbActivity()
        }
    }

    /*private fun goToRoomDbActivity() {
        val intent = Intent(this, RoomDataActivity::class.java)
        startActivity(intent)
    }*/

    private fun openWebView() {
        val intent = Intent(this, WebViewActivity::class.java)
        startActivity(intent)
    }

    private fun fragments() {
        val intent = Intent(this, FragmentViewActivity::class.java)
        startActivity(intent)
    }

    private fun gridView() {
        val intent = Intent(this, GridViewActivity::class.java)
        startActivity(intent)
    }


    private fun goToListActivity() {
        val intent = Intent(this, ListViewActivity::class.java)
        startActivity(intent)
    }

    private fun passData() {
        val intent = Intent(this, PassDataActivity::class.java)
        startActivity(intent)
    }

    private fun goToRecyclerActivity() {
        val intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
    }

    private fun showAlertBox() {
        var builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
        builder.setMessage("Are You Sure You Want to exit from The App ?")
        builder.setTitle("Warning !!!")
        builder.setCancelable(false)

        builder.setPositiveButton("Yes") { dialog, which ->
            onBackPressed()
            finish()
        }

        builder.setNegativeButton("No") { dialog, which ->
            dialog.cancel()
        }

        val alertDialog = builder.create()
        alertDialog.show()
    }

    private fun showSnackBar() {
        val snackbar = Snackbar.make(mainLayout, "You're Showing a Snackbar", Snackbar.LENGTH_LONG)
            .setAction("UNDO") {
                val snackbar =
                    Snackbar.make(mainLayout, "Yes I am still here", Snackbar.LENGTH_LONG)
                snackbar.show()
            }
        snackbar.show()
    }
}