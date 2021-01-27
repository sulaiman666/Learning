package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

private const val PRICE_PER_CUPCAKE: Double = 2.00
private const val PRICE_FOR_SAME_DAY_PICKUP: Double = 3.0
private const val PRICE_FOR_SPECIAL_FLAVOR: Double = 0.75

class OrderViewModel : ViewModel() {

    private var _specialFlavor = "Special Flavor"

    private val _quantity = MutableLiveData<Int>()
    val quantity: LiveData<Int> = _quantity

    private val _flavor = MutableLiveData<String>()
    val flavor: LiveData<String> = _flavor

    private val _date = MutableLiveData<String>()
    val date: LiveData<String> = _date

    private val _price = MutableLiveData<Double>()
    val price: LiveData<String> = Transformations.map(_price) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    val dateOption = getPickupOptions()

    init {
        resetOrder()
    }

    fun setQuantity(numberCupcakes: Int) {
        _quantity.value = numberCupcakes
        updatePrice()
    }

    fun setFlavor(desiredFlavour: String) {
        _flavor.value = desiredFlavour
        _date.value = dateOption[1]
        isItSpecialFlavor()
        updatePrice()
    }

    fun setDate(pickupDate: String) {
        _date.value = pickupDate
        updatePrice()
    }

    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }

    private fun getPickupOptions(): List<String> {
        val option = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()
        repeat(4) {
            option.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return option
    }

    fun resetOrder() {
        _quantity.value = 0
        _flavor.value = ""
        _date.value = dateOption[1]
        _price.value = 0.0
    }

    fun updatePrice() {
        var calculatedPrice =
            if (_flavor.value == _specialFlavor) (_quantity.value ?: 0) * (PRICE_PER_CUPCAKE + PRICE_FOR_SPECIAL_FLAVOR)
            else (_quantity.value ?: 0) * PRICE_PER_CUPCAKE
        if (dateOption[0] == _date.value) {
            calculatedPrice += PRICE_FOR_SAME_DAY_PICKUP
        }
        _price.value = calculatedPrice
    }

    fun isItSpecialFlavor(): Boolean = _flavor.value == _specialFlavor

    fun specialFlavorDate() {
        _date.value =
            if (isItSpecialFlavor()) dateOption[1]
            else dateOption[0]
        updatePrice()
    }

}