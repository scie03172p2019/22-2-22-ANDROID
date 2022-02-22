package com.example.revision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //http calls
        val queue = Volley.newRequestQueue(this)
        val url = "https://mtekcdnstoragev2.blob.core.windows.net/admin/mcfish/students.json"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->

                Log.i("RESPONSE", "The response is:$response")

            },
            Response.ErrorListener { Log.e("ERROR", "FEtch unsuccessful ",) })

        queue.add(stringRequest)
    }


