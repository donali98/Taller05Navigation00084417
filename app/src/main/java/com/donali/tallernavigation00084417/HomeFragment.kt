package com.donali.tallernavigation00084417


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_send_action.setOnClickListener {
//            val random = Random()
            val nextAction = HomeFragmentDirections.nextAction()
//            nextAction.numOfCamera = random.nextInt(100)

            Navigation.findNavController(it).navigate(nextAction)
        }
    }


}
