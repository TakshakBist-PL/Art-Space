package com.example.artspace.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ArtworkModel(
   @DrawableRes val imageResourceId: Int,
   @StringRes val imageDescriptionResourceId: Int,
   @StringRes val artistNameResourceId: Int,
   @StringRes val artworkTitleResourceId: Int,
   @StringRes val artworkDateResourceId: Int
)
