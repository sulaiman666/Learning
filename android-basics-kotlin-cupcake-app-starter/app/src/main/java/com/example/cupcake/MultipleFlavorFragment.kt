package com.example.cupcake

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.cupcake.databinding.FragmentMultipleFlavorBinding
import com.example.cupcake.model.OrderViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MultipleFlavorFragment: Fragment() {
    // Binding object instance corresponding to the fragment_flavor.xml layout
    // This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
    // when the view hierarchy is attached to the fragment.
    private var binding: FragmentMultipleFlavorBinding? = null
    private val sharedViewModel: OrderViewModel by activityViewModels()
    private var allowed: Boolean = true

    lateinit var vanilla: CheckBox
    lateinit var chocolate: CheckBox
    lateinit var redVelvet: CheckBox
    lateinit var saltedCaramel: CheckBox
    lateinit var coffee: CheckBox
    lateinit var specialFlavor: CheckBox
    var numberOfFlavor = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentMultipleFlavorBinding.inflate(inflater,container,false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            flavorFragment = this@MultipleFlavorFragment
        }
    }

    override fun onResume() {
        super.onResume()
        sharedViewModel.setDate("1")
    }

    // example changing xml visibility
    // findViewById<TextView>(R.id.errorText).visibility = View.VISIBLE

    /**
     * Navigate to the next screen to choose pickup date.
     */
    fun goToNextScreen() {
        sharedViewModel.setFlavor(setMultipleFlavor())
        sharedViewModel.specialFlavorDate()
        if (allowed) findNavController().navigate(R.id.action_multipleFlavorFragment_to_pickupFragment)
        else errorDialogue()
    }

    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun cancelOrder() {
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_multipleFlavorFragment_to_startFragment)
    }

    fun specialFlavorPriceCheck() = sharedViewModel.setFlavor(setMultipleFlavor())

    private fun setMultipleFlavor(): String{
        numberOfFlavor = 0
        val separator = ", "

        val multipleFlavor: MutableList<String> = mutableListOf()

        vanilla = binding?.root?.findViewById(R.id.vanilla)!!
        chocolate = binding?.root?.findViewById(R.id.chocolate)!!
        redVelvet = binding?.root?.findViewById(R.id.red_velvet)!!
        saltedCaramel = binding?.root?.findViewById(R.id.salted_caramel)!!
        coffee = binding?.root?.findViewById(R.id.coffee)!!
        specialFlavor = binding?.root?.findViewById(R.id.special_flavor)!!

        if (vanilla.isChecked) {
            multipleFlavor.add(getString(R.string.vanilla))
            numberOfFlavor++
        }
        if (chocolate.isChecked) {
            multipleFlavor.add(getString(R.string.chocolate))
            numberOfFlavor++
        }
        if (redVelvet.isChecked) {
            multipleFlavor.add(getString(R.string.red_velvet))
            numberOfFlavor++
        }
        if (saltedCaramel.isChecked) {
            multipleFlavor.add(getString(R.string.salted_caramel))
            numberOfFlavor++
        }
        if (coffee.isChecked) {
            multipleFlavor.add(getString(R.string.coffee))
            numberOfFlavor++
        }
        if (specialFlavor.isChecked) {
            multipleFlavor.add(getString(R.string.special_flavor))
            numberOfFlavor++
        }

        allowed = sharedViewModel.limitFlavor(numberOfFlavor)

        return multipleFlavor.joinToString(separator)
    }

    private fun errorDialogue() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(getString(R.string.error_title))
            .setMessage(getString(R.string.error_massage, sharedViewModel.chooseNumber.value, sharedViewModel.maxNumberOfFlavor.value))
            .show()
    }

}