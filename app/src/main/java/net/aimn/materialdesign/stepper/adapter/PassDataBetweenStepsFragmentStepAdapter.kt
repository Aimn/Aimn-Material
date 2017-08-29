package net.aimn.materialdesign.stepper.adapter

import android.content.Context
import android.support.v4.app.FragmentManager

import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import net.aimn.materialdesign.stepper.step.fragment.PassDataBetweenStepsFirstStepFragment
import net.aimn.materialdesign.stepper.step.fragment.PassDataBetweenStepsSecondStepFragment

class PassDataBetweenStepsFragmentStepAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {

    override fun createStep(position: Int): Step {
        when (position) {
            0 -> return PassDataBetweenStepsFirstStepFragment.newInstance()
            1 -> return PassDataBetweenStepsSecondStepFragment.newInstance()
            else -> throw IllegalArgumentException("Unsupported position: " + position)
        }
    }

    override fun getCount(): Int {
        return 2
    }
}