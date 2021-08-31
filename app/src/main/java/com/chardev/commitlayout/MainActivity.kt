package com.chardev.commitlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import androidx.core.widget.addTextChangedListener
import com.chardev.commitlayout.databinding.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
//    val binding by lazy { MamafafaMainBinding.inflate(layoutInflater) }
    //val binding by lazy { RadioBtnStudyBinding.inflate(layoutInflater) }
//    val binding by lazy{CheckCheckBinding.inflate(layoutInflater)}
//    val listener by lazy {CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
//        when(compoundButton.id){
//            R.id.checkBox -> Log.d("chk1", "chk1선택")
//            R.id.checkBox2 -> Log.d("chk2", "chk2선택")
//            R.id.checkBox3 -> Log.d("chk3", "chk3선택")
//        }
//        if(isChecked){
//            when(buttonView.id){
//                R.id.checkBox -> Log.d("chk1", "chk1 chk")
//                R.id.checkBox2 -> Log.d("chk2", "chk2 chk")
//                R.id.checkBox3 -> Log.d("chk3", "chk3 chk")
//            }
//        }else{
//            when(buttonView.id){
//                R.id.checkBox -> Log.d("chk1", "chk1 chkfa")
//                R.id.checkBox2 -> Log.d("chk2", "chk2 chkfa")
//                R.id.checkBox3 -> Log.d("chk3", "chk3 chkfa")
//            }
//        }
//    }}

    val binding by lazy { ProgressbarBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        //binding.editText.addTextChangedListener {
//            Log.d("EditText", "현재 입력된 값= ${it.toString()}")
//            if(it.toString().length > 8){
//                Log.d("글자수 인식", "글자수 ${it.toString().length}")
//            }
        //}

//        binding.que1.setOnCheckedChangeListener{ quebtn, checkedId ->
//            when(checkedId){
//                R.id.go -> Log.d("간다를 선택함","간다")
//                R.id.notgo -> Log.d("안간다를 선택함","간다")
//            }
//        }

//        binding.checkBox.setOnCheckedChangeListener(listener)
//        binding.checkBox2.setOnCheckedChangeListener(listener)
//        binding.checkBox3.setOnCheckedChangeListener(listener)
       thread(start=true) {//서브스레드
           Thread.sleep(3000)
           runOnUiThread{
               showProgress(false)
           }
       }
    }

    fun showProgress(show: Boolean){
//        if(show){
//            binding.progressLayout.visibility = View.VISIBLE
//        }else{
//            binding.progressLayout.visibility = View.GONE
//        }

        binding.progressLayout.visibility = if(show) View.VISIBLE else View.GONE
    }
}