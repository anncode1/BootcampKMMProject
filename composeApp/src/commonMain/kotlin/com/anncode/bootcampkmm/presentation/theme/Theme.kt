package com.anncode.bootcampkmm.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import bootcampkmmproject.composeapp.generated.resources.Overlock_Bold
import bootcampkmmproject.composeapp.generated.resources.Overlock_Regular
import bootcampkmmproject.composeapp.generated.resources.Res
import com.anncode.bootcampkmm.presentation.theme.backgroundDark
import com.anncode.bootcampkmm.presentation.theme.backgroundDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.backgroundDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.backgroundLight
import com.anncode.bootcampkmm.presentation.theme.backgroundLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.backgroundLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.errorContainerDark
import com.anncode.bootcampkmm.presentation.theme.errorContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.errorContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.errorContainerLight
import com.anncode.bootcampkmm.presentation.theme.errorContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.errorContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.errorDark
import com.anncode.bootcampkmm.presentation.theme.errorDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.errorDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.errorLight
import com.anncode.bootcampkmm.presentation.theme.errorLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.errorLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.inverseOnSurfaceDark
import com.anncode.bootcampkmm.presentation.theme.inverseOnSurfaceDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.inverseOnSurfaceDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.inverseOnSurfaceLight
import com.anncode.bootcampkmm.presentation.theme.inverseOnSurfaceLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.inverseOnSurfaceLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.inversePrimaryDark
import com.anncode.bootcampkmm.presentation.theme.inversePrimaryDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.inversePrimaryDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.inversePrimaryLight
import com.anncode.bootcampkmm.presentation.theme.inversePrimaryLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.inversePrimaryLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.inverseSurfaceDark
import com.anncode.bootcampkmm.presentation.theme.inverseSurfaceDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.inverseSurfaceDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.inverseSurfaceLight
import com.anncode.bootcampkmm.presentation.theme.inverseSurfaceLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.inverseSurfaceLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onBackgroundDark
import com.anncode.bootcampkmm.presentation.theme.onBackgroundDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onBackgroundDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onBackgroundLight
import com.anncode.bootcampkmm.presentation.theme.onBackgroundLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onBackgroundLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorContainerDark
import com.anncode.bootcampkmm.presentation.theme.onErrorContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorContainerLight
import com.anncode.bootcampkmm.presentation.theme.onErrorContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorDark
import com.anncode.bootcampkmm.presentation.theme.onErrorDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorLight
import com.anncode.bootcampkmm.presentation.theme.onErrorLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onErrorLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryContainerDark
import com.anncode.bootcampkmm.presentation.theme.onPrimaryContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryContainerLight
import com.anncode.bootcampkmm.presentation.theme.onPrimaryContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryDark
import com.anncode.bootcampkmm.presentation.theme.onPrimaryDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryLight
import com.anncode.bootcampkmm.presentation.theme.onPrimaryLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onPrimaryLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryContainerDark
import com.anncode.bootcampkmm.presentation.theme.onSecondaryContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryContainerLight
import com.anncode.bootcampkmm.presentation.theme.onSecondaryContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryDark
import com.anncode.bootcampkmm.presentation.theme.onSecondaryDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryLight
import com.anncode.bootcampkmm.presentation.theme.onSecondaryLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSecondaryLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceDark
import com.anncode.bootcampkmm.presentation.theme.onSurfaceDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceLight
import com.anncode.bootcampkmm.presentation.theme.onSurfaceLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceVariantDark
import com.anncode.bootcampkmm.presentation.theme.onSurfaceVariantDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceVariantDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceVariantLight
import com.anncode.bootcampkmm.presentation.theme.onSurfaceVariantLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onSurfaceVariantLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryContainerDark
import com.anncode.bootcampkmm.presentation.theme.onTertiaryContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryContainerLight
import com.anncode.bootcampkmm.presentation.theme.onTertiaryContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryDark
import com.anncode.bootcampkmm.presentation.theme.onTertiaryDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryLight
import com.anncode.bootcampkmm.presentation.theme.onTertiaryLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.onTertiaryLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.outlineDark
import com.anncode.bootcampkmm.presentation.theme.outlineDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.outlineDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.outlineLight
import com.anncode.bootcampkmm.presentation.theme.outlineLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.outlineLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.outlineVariantDark
import com.anncode.bootcampkmm.presentation.theme.outlineVariantDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.outlineVariantDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.outlineVariantLight
import com.anncode.bootcampkmm.presentation.theme.outlineVariantLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.outlineVariantLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.primaryContainerDark
import com.anncode.bootcampkmm.presentation.theme.primaryContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.primaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.primaryContainerLight
import com.anncode.bootcampkmm.presentation.theme.primaryContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.primaryContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.primaryDark
import com.anncode.bootcampkmm.presentation.theme.primaryDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.primaryDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.primaryLight
import com.anncode.bootcampkmm.presentation.theme.primaryLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.primaryLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.scrimDark
import com.anncode.bootcampkmm.presentation.theme.scrimDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.scrimDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.scrimLight
import com.anncode.bootcampkmm.presentation.theme.scrimLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.scrimLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryContainerDark
import com.anncode.bootcampkmm.presentation.theme.secondaryContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryContainerLight
import com.anncode.bootcampkmm.presentation.theme.secondaryContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryDark
import com.anncode.bootcampkmm.presentation.theme.secondaryDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryLight
import com.anncode.bootcampkmm.presentation.theme.secondaryLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.secondaryLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceBrightDark
import com.anncode.bootcampkmm.presentation.theme.surfaceBrightDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceBrightDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceBrightLight
import com.anncode.bootcampkmm.presentation.theme.surfaceBrightLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceBrightLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerDark
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighDark
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighLight
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighestDark
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighestDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighestDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighestLight
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighestLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerHighestLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLight
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowDark
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowLight
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowestDark
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowestDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowestDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowestLight
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowestLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceContainerLowestLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceDark
import com.anncode.bootcampkmm.presentation.theme.surfaceDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceDimDark
import com.anncode.bootcampkmm.presentation.theme.surfaceDimDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceDimDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceDimLight
import com.anncode.bootcampkmm.presentation.theme.surfaceDimLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceDimLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceLight
import com.anncode.bootcampkmm.presentation.theme.surfaceLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceVariantDark
import com.anncode.bootcampkmm.presentation.theme.surfaceVariantDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceVariantDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceVariantLight
import com.anncode.bootcampkmm.presentation.theme.surfaceVariantLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.surfaceVariantLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryContainerDark
import com.anncode.bootcampkmm.presentation.theme.tertiaryContainerDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryContainerLight
import com.anncode.bootcampkmm.presentation.theme.tertiaryContainerLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryContainerLightMediumContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryDark
import com.anncode.bootcampkmm.presentation.theme.tertiaryDarkHighContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryDarkMediumContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryLight
import com.anncode.bootcampkmm.presentation.theme.tertiaryLightHighContrast
import com.anncode.bootcampkmm.presentation.theme.tertiaryLightMediumContrast
import org.jetbrains.compose.resources.Font

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colorScheme = if (darkTheme) darkScheme else lightScheme

    val typography = Typography(
        displayLarge = TextStyle(
            fontSize = 57.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        displayMedium = TextStyle(
            fontSize = 45.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        displaySmall = TextStyle(
            fontSize = 36.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        headlineLarge = TextStyle(
            fontSize = 32.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        headlineMedium = TextStyle(
            fontSize = 28.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        headlineSmall = TextStyle(
            fontSize = 24.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        titleLarge = TextStyle(
            fontSize = 22.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        titleMedium = TextStyle(
            fontSize = 18.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        titleSmall = TextStyle(
            fontSize = 16.sp,
            //fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Bold)
            )
        ),
        bodyLarge = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Regular)
            )
        ),
        bodyMedium = TextStyle(
            fontSize = 14.sp,
            fontWeight =  FontWeight.Normal,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Regular)
            )
        ),
        bodySmall = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Regular)
            )
        ),
        labelLarge = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Regular)
            )
        ),
        labelMedium = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Regular)
            )
        ),
        labelSmall = TextStyle(
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily(
                Font(Res.font.Overlock_Regular)
            )
        )
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )
}

