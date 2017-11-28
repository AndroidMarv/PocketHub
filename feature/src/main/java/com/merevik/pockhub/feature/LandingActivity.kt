/*
 * Copyright (c) 2017.
 * Some Rights Reserved.
 *
 *       NOTICE:  All information contained herein is, and remains
 *       the property of Manan Sharma.  The intellectual and technical concepts contained
 *       herein are proprietary to Manan Sharma and Mapprr, IVY Terrace, 502, WestWing,
 *       Kavuri Hills, Hyderabad, Telangana 500081 and and may be covered
 *       by U.S., Indian and Foreign laws.
 *       Dissemination of this information or reproduction of this material
 *       is strictly forbidden unless prior written permission is obtained
 *       from Manan Sharma or Mapprr.
 *
 *        This file is subject to the terms and conditions defined in
 *        file 'LICENSE.md', which is part of this source code package.
 *
 *       This file, LandingActivity.kt  was created on 28/11/17 1:34 PM and was modified on 28/11/17 1:34 PM.
 *       LandingActivity.kt is a part of PockHub, feature.
 *
 */

package com.merevik.pockhub.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_landing.*

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        sample_text.text = stringFromJNI()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        init {
            System.loadLibrary("native-lib")
        }
    }
}
