/*
Copyright 2016 StepStone Services

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package net.aimn.materialdesign.stepper

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.stepstone.stepper.StepperLayout
import net.aimn.materialdesign.stepper.adapter.DelayedTransitionFragmentStepAdapter

import butterknife.BindView
import butterknife.ButterKnife
import net.aimn.materialdesign.R

class DelayedTransitionStepperActivity : AppCompatActivity() {

    companion object {

        private const val CURRENT_STEP_POSITION_KEY = "position"
    }

    @BindView(R.id.stepperLayout)
    lateinit var mStepperLayout: StepperLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Stepper sample"

        setContentView(R.layout.activity_delayed_transition)
        ButterKnife.bind(this)
        val startingStepPosition = savedInstanceState?.getInt(CURRENT_STEP_POSITION_KEY) ?: 0
        mStepperLayout.setAdapter(DelayedTransitionFragmentStepAdapter(supportFragmentManager, this), startingStepPosition)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(CURRENT_STEP_POSITION_KEY, mStepperLayout.currentStepPosition)
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        val currentStepPosition = mStepperLayout.currentStepPosition
        if (currentStepPosition > 0) {
            mStepperLayout.onBackClicked()
        } else {
            finish()
        }
    }

}
