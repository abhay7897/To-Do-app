package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
          displaythings()
        }
    }
    var c=0
    var filled= arrayOf(0,0,0)
    private fun displaythings() {
//        binding.enter.hint="Enter work"
//        binding.enter.text="A"
        c=c+1
        Log.d("abhay",c.toString())
        val t=binding.enter.text.toString()
        if(c<=3 && filled[0]==0)
        {
            binding.t1.text=t.toString()
            binding.textView.text="Remove"
            filled[0]=1
        }
        else if(c<=3 && filled[1]==0)
        {
            binding.t2.text=t.toString()
            binding.textView2.text="Remove"
            filled[1]=1
        }else if(c<=3 && filled[2]==0)
        {
            binding.t3.text=t.toString()
            binding.textView3.text="Remove"
            filled[2]=1
        }
        else
        {
            Toast.makeText(this,"Cant add more than 3",Toast.LENGTH_SHORT).show()
            c-=1
        }
        binding.textView.setOnClickListener{
            binding.textView.text=""
            binding.t1.text=""
            c-=1
            filled[0]=0
            Log.d("filled",filled[0].toString())
        }
        binding.textView2.setOnClickListener{
            binding.textView2.text=""
            binding.t2.text=""
            c-=1
            filled[1]=0
        }
        binding.textView3.setOnClickListener{
            binding.textView3.text=""
            binding.t3.text=""
            c-=1
            filled[2]=0
        }
    }
}