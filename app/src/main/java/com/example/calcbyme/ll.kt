package com.example.calcbyme
/*
import android.R
import android.widget.TextView
import android.widget.Toast
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager


@Throws(ScriptException::class)
fun bEqual(v: View?) {
    val mgr = ScriptEngineManager()
    val engine: ScriptEngine = mgr.getEngineByName("JavaScript")
    val value: String = inputText.getText().toString()
    Toast.makeText(this, value, Toast.LENGTH_LONG).show()
    try {
        result = engine.eval(value) as Double
        Toast.makeText(this, java.lang.String.format("%f", result), Toast.LENGTH_SHORT).show()
    } catch (e: Exception) {
        Toast.makeText(this, "Exception Raised", Toast.LENGTH_SHORT).show()

    }
    val Operation = "5+4-2"
    val engine = ScriptEngineManager().getEngineByName("rhino")

    try {
        val result = engine.eval(Operation)
        Log.d("Calculator", "Operation: $Operation result: $result")
    } catch (e: ScriptException) {
        Log.d("Calculator", " ScriptEngine error: " + e.getMessage())
    }
    val resultTextView: TextView = findViewById(R.id.result_text_view)
    var currentText = resultTextView.text.toString()
    val valid: Boolean = checkForValidity()
    var result = 0.0
    if (valid) {
        val engine = ScriptEngineManager().getEngineByName("rhino")
        try {
            result = engine.eval(currentText) as Double
        } catch (e: java.lang.Exception) {
            Toast.makeText(this, "Exception Raised", Toast.LENGTH_SHORT).show()
        }
        currentText = "$currentText\n=$result"
    }
    resultTextView.text = currentText
}

 */
