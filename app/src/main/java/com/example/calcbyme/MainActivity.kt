package com.example.calcbyme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView2.setOnClickListener {
            try {
                textView.text = textView.text.substring(0, textView.text.length - 1)
                editText.text.clear()
            }catch (ex:Exception){}
        }

    }
    var enable = true
    var enable3 = true
    var enable4 = true
    var enable5 = true
    var ss=true
    var vv=true
    var Res:Any=0
    fun EventClick(view: View) {
        try {
            if (ss)
                editText.text.clear()
            if (textView.text.contains("="))
                textView.text=""


            ss = false
            val button = view as Button
            when (button.id) {
                R.id.bu0 -> {
                    editText.append(bu0.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu1 -> {
                    editText.append(bu1.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu2 -> {
                    editText.append(bu2.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu3 -> {
                    editText.append(bu3.text)

                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu4 -> {
                    editText.append(bu4.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu5 -> {
                    editText.append(bu5.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu6 -> {
                    editText.append(bu6.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu7 -> {
                    editText.append(bu7.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu8 -> {
                    editText.append(bu8.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.bu9 -> {
                    editText.append(bu9.text)
                    enable3 = true
                    enable4 = true
                    enable5 = true
                }
                R.id.buAC -> {
                    editText.text.clear()
                    textView.text = ""
                    enable = true
                    ss = true
                }
                R.id.buDot -> {
                    if (enable) {
                        editText.append(".")
                        enable = false
                    }
                }
                R.id.buMod -> {
                    editText.append(buMod.text)
                }
            }
        }catch (ex:Exception){}
    }
    fun OpClick(view:View)
    {
        try {
            if (textView.text.contains("=")) {

                textView.text = Res.toString()
            }
            textView.append(editText.text)
            val button = view as Button
            if (vv)
                textView.text = textView.text.toString().replace("=", "")
            when (button.id) {
                R.id.buDiv -> {
                    if (enable5 && textView.text.isNotEmpty() && textView.text.get(textView.text.lastIndex) != '+'
                            && textView.text.get(textView.text.lastIndex) != '*'
                            && textView.text.get(textView.text.lastIndex) != '-') {
                        textView.append(buDiv.text)
                        enable5 = false
                    }
                    ss = true
                    enable = true
                    editText.text.clear()
                }
                R.id.buMult -> {
                    if (enable4 && textView.text.isNotEmpty() && textView.text.get(textView.text.lastIndex) != '+'
                            && textView.text.get(textView.text.lastIndex) != '/'
                            && textView.text.get(textView.text.lastIndex) != '-') {
                        textView.append("*")
                        enable4 = false
                    }
                    ss = true
                    enable = true
                    editText.text.clear()
                }
                R.id.buSub -> {
                    if (textView.text.get(textView.text.lastIndex) != '+'
                            && textView.text.get(textView.text.lastIndex) != '-'
                            && textView.text.get(textView.text.lastIndex) != '*'
                            && textView.text.get(textView.text.lastIndex) != '/') {
                        textView.append(buSub.text)
                    }
                    ss = true
                    enable = true
                    editText.text.clear()
                }
                R.id.buSum -> {
                    if (enable3 && textView.text.isNotEmpty() && textView.text.get(textView.text.lastIndex) != '/'
                            && textView.text.get(textView.text.lastIndex) != '*'
                            && textView.text.get(textView.text.lastIndex) != '-') {
                        textView.append(buSum.text)
                        enable3 = false
                    }
                    ss = true
                    enable = true
                    editText.text.clear()
                }
            }
        }catch (ex:Exception){}
    }
    fun EqualClick(view: View) {
        try {
            textView.append(editText.text)
            editText.text.clear()
            var ex = ExpressionBuilder(textView.text.toString()).build()
             Res = ex.evaluate()
            if (Res.toString().contains(".0")) {
                 val s= Res.toString().subSequence(0,Res.toString().length-2)
                  Res=s
                textView.text = textView.text.toString() + "=" + s
            }
            else
                textView.text=textView.text.toString()+"="+Res.toString()
            ss=true
        } catch (ex: Exception) {
        }
    }

}