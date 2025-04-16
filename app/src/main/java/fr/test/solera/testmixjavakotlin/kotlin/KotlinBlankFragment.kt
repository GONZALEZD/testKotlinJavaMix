package fr.test.solera.testmixjavakotlin.kotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import fr.test.solera.testmixjavakotlin.R
import fr.test.solera.testmixjavakotlin.databinding.FragmentKotlinBlankBinding
import fr.test.solera.testmixjavakotlin.java.JavaBlankFragment

@AndroidEntryPoint
class KotlinBlankFragment : Fragment() {

    companion object {
        fun newInstance() = KotlinBlankFragment()
    }

    private val viewModel: KotlinBlankViewModel by viewModels()

    private lateinit var binding:FragmentKotlinBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKotlinBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.numberLiveData.observe(viewLifecycleOwner) {
            binding.numberTextview.text = it.toString()
        }
        binding.button.setOnClickListener {
            navigateToJavaFragment()
        }
    }

    fun navigateToJavaFragment() {
        Log.e("COUCOU", "navigateToJavaFragment")
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, JavaBlankFragment())
            .commitNow()
    }
}