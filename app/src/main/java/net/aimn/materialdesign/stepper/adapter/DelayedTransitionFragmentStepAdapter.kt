package net.aimn.materialdesign.stepper.adapter

import android.content.Context
import android.support.annotation.IntRange
import android.support.v4.app.FragmentManager

import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter

import com.stepstone.stepper.viewmodel.StepViewModel
import net.aimn.materialdesign.R
import net.aimn.materialdesign.stepper.step.fragment.DelayedTransitionStepFragmentSample


class DelayedTransitionFragmentStepAdapter(fm: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fm, context) {

    override fun createStep(position: Int): Step {
        return DelayedTransitionStepFragmentSample.newInstance()
    }

    override fun getViewModel(@IntRange(from = 0) position: Int): StepViewModel {
        return StepViewModel.Builder(context)
                .setTitle(R.string.tab_title)
                .create()
    }

    override fun getCount(): Int {
        return 3
    }
}