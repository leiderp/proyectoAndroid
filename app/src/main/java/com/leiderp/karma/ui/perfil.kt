package com.leiderp.karma.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.leiderp.karma.R
import com.leiderp.karma.viewModel.AuthViewModel
import kotlinx.android.synthetic.main.fragment_perfil.*
import kotlinx.android.synthetic.main.fragment_perfil.view.*

class perfil : Fragment() {
    //private val viewModel : AuthViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)
        //view.buttonSalir.setOnClickListener{
          //  viewModel.logout()
            //Navigation.findNavController(view).navigate(R.id.action_perfil_to_mainActivity)
        //}
        return view
    }

}