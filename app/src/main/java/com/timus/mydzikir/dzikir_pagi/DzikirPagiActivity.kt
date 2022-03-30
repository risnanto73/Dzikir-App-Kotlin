package com.timus.mydzikir.dzikir_pagi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.timus.mydzikir.R
import com.timus.mydzikir.dzikir_pagi.adapter.H_Fragment
import com.timus.mydzikir.dzikir_pagi.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_dzikir_pagi.*

class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)
        setupTabs()
    }

    private fun setupTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(A_Ayat_Kursi_Fragment(),"1")
        adapter.addFragment(B_Al_Ikhlas_Fragment(),"2")
        adapter.addFragment(C_Al_Falaq_Fragment(),"3")
        adapter.addFragment(D_An_Naas_Fragment(),"4")
        adapter.addFragment(E_Doa_Perlinungan_Fragment(),"5")
        adapter.addFragment(F_DoaBerserah_Diri_Fragment(),"6")
        adapter.addFragment(G_Sayyidul_Istighfar_Fragment(),"7")
        adapter.addFragment(H_Fragment(),"8")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.dots)
        tabs.getTabAt(1)!!.setIcon(R.drawable.dots)
        tabs.getTabAt(2)!!.setIcon(R.drawable.dots)
        tabs.getTabAt(3)!!.setIcon(R.drawable.dots)
        tabs.getTabAt(4)!!.setIcon(R.drawable.dots)
        tabs.getTabAt(5)!!.setIcon(R.drawable.dots)
        tabs.getTabAt(6)!!.setIcon(R.drawable.dots)
        tabs.getTabAt(7)!!.setIcon(R.drawable.dots)




    }
}