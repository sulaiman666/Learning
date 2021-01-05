package com.tedasa.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringSourceID: Int,
    @DrawableRes val imageResourceID: Int
)