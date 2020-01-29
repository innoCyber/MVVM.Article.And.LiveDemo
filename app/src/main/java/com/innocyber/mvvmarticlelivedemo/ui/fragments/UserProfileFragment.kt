package com.innocyber.mvvmarticlelivedemo.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels

import com.innocyber.mvvmarticlelivedemo.R
import com.innocyber.mvvmarticlelivedemo.viewmodel.UserProfileViewModel

/**
 * A simple [Fragment] subclass.
 */
class UserProfileFragment : Fragment() {

    private val viewModel: UserProfileViewModel by viewModels(
        factoryProducer = { SavedStateVMFactory(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_profile, container, false)
    }




}
