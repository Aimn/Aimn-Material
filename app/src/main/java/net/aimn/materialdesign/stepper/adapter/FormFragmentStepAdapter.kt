package net.aimn.materialdesign.stepper.adapter

import android.content.Context
import android.support.v4.app.FragmentManager

import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import net.aimn.materialdesign.stepper.step.fragment.FormStepFragment


class FormFragmentStepAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {

    override fun createStep(position: Int): Step {
        return FormStepFragment.newInstance()
    }

    override fun getCount(): Int {
        return 3
    }
}