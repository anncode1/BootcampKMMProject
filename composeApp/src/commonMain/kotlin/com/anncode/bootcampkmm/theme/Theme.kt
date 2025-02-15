package com.anncode.bootcampkmm.theme

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
import com.anncode.bootcampkmm.theme.backgroundDark
import com.anncode.bootcampkmm.theme.backgroundDarkHighContrast
import com.anncode.bootcampkmm.theme.backgroundDarkMediumContrast
import com.anncode.bootcampkmm.theme.backgroundLight
import com.anncode.bootcampkmm.theme.backgroundLightHighContrast
import com.anncode.bootcampkmm.theme.backgroundLightMediumContrast
import com.anncode.bootcampkmm.theme.errorContainerDark
import com.anncode.bootcampkmm.theme.errorContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.errorContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.errorContainerLight
import com.anncode.bootcampkmm.theme.errorContainerLightHighContrast
import com.anncode.bootcampkmm.theme.errorContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.errorDark
import com.anncode.bootcampkmm.theme.errorDarkHighContrast
import com.anncode.bootcampkmm.theme.errorDarkMediumContrast
import com.anncode.bootcampkmm.theme.errorLight
import com.anncode.bootcampkmm.theme.errorLightHighContrast
import com.anncode.bootcampkmm.theme.errorLightMediumContrast
import com.anncode.bootcampkmm.theme.inverseOnSurfaceDark
import com.anncode.bootcampkmm.theme.inverseOnSurfaceDarkHighContrast
import com.anncode.bootcampkmm.theme.inverseOnSurfaceDarkMediumContrast
import com.anncode.bootcampkmm.theme.inverseOnSurfaceLight
import com.anncode.bootcampkmm.theme.inverseOnSurfaceLightHighContrast
import com.anncode.bootcampkmm.theme.inverseOnSurfaceLightMediumContrast
import com.anncode.bootcampkmm.theme.inversePrimaryDark
import com.anncode.bootcampkmm.theme.inversePrimaryDarkHighContrast
import com.anncode.bootcampkmm.theme.inversePrimaryDarkMediumContrast
import com.anncode.bootcampkmm.theme.inversePrimaryLight
import com.anncode.bootcampkmm.theme.inversePrimaryLightHighContrast
import com.anncode.bootcampkmm.theme.inversePrimaryLightMediumContrast
import com.anncode.bootcampkmm.theme.inverseSurfaceDark
import com.anncode.bootcampkmm.theme.inverseSurfaceDarkHighContrast
import com.anncode.bootcampkmm.theme.inverseSurfaceDarkMediumContrast
import com.anncode.bootcampkmm.theme.inverseSurfaceLight
import com.anncode.bootcampkmm.theme.inverseSurfaceLightHighContrast
import com.anncode.bootcampkmm.theme.inverseSurfaceLightMediumContrast
import com.anncode.bootcampkmm.theme.onBackgroundDark
import com.anncode.bootcampkmm.theme.onBackgroundDarkHighContrast
import com.anncode.bootcampkmm.theme.onBackgroundDarkMediumContrast
import com.anncode.bootcampkmm.theme.onBackgroundLight
import com.anncode.bootcampkmm.theme.onBackgroundLightHighContrast
import com.anncode.bootcampkmm.theme.onBackgroundLightMediumContrast
import com.anncode.bootcampkmm.theme.onErrorContainerDark
import com.anncode.bootcampkmm.theme.onErrorContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.onErrorContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.onErrorContainerLight
import com.anncode.bootcampkmm.theme.onErrorContainerLightHighContrast
import com.anncode.bootcampkmm.theme.onErrorContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.onErrorDark
import com.anncode.bootcampkmm.theme.onErrorDarkHighContrast
import com.anncode.bootcampkmm.theme.onErrorDarkMediumContrast
import com.anncode.bootcampkmm.theme.onErrorLight
import com.anncode.bootcampkmm.theme.onErrorLightHighContrast
import com.anncode.bootcampkmm.theme.onErrorLightMediumContrast
import com.anncode.bootcampkmm.theme.onPrimaryContainerDark
import com.anncode.bootcampkmm.theme.onPrimaryContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.onPrimaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.onPrimaryContainerLight
import com.anncode.bootcampkmm.theme.onPrimaryContainerLightHighContrast
import com.anncode.bootcampkmm.theme.onPrimaryContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.onPrimaryDark
import com.anncode.bootcampkmm.theme.onPrimaryDarkHighContrast
import com.anncode.bootcampkmm.theme.onPrimaryDarkMediumContrast
import com.anncode.bootcampkmm.theme.onPrimaryLight
import com.anncode.bootcampkmm.theme.onPrimaryLightHighContrast
import com.anncode.bootcampkmm.theme.onPrimaryLightMediumContrast
import com.anncode.bootcampkmm.theme.onSecondaryContainerDark
import com.anncode.bootcampkmm.theme.onSecondaryContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.onSecondaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.onSecondaryContainerLight
import com.anncode.bootcampkmm.theme.onSecondaryContainerLightHighContrast
import com.anncode.bootcampkmm.theme.onSecondaryContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.onSecondaryDark
import com.anncode.bootcampkmm.theme.onSecondaryDarkHighContrast
import com.anncode.bootcampkmm.theme.onSecondaryDarkMediumContrast
import com.anncode.bootcampkmm.theme.onSecondaryLight
import com.anncode.bootcampkmm.theme.onSecondaryLightHighContrast
import com.anncode.bootcampkmm.theme.onSecondaryLightMediumContrast
import com.anncode.bootcampkmm.theme.onSurfaceDark
import com.anncode.bootcampkmm.theme.onSurfaceDarkHighContrast
import com.anncode.bootcampkmm.theme.onSurfaceDarkMediumContrast
import com.anncode.bootcampkmm.theme.onSurfaceLight
import com.anncode.bootcampkmm.theme.onSurfaceLightHighContrast
import com.anncode.bootcampkmm.theme.onSurfaceLightMediumContrast
import com.anncode.bootcampkmm.theme.onSurfaceVariantDark
import com.anncode.bootcampkmm.theme.onSurfaceVariantDarkHighContrast
import com.anncode.bootcampkmm.theme.onSurfaceVariantDarkMediumContrast
import com.anncode.bootcampkmm.theme.onSurfaceVariantLight
import com.anncode.bootcampkmm.theme.onSurfaceVariantLightHighContrast
import com.anncode.bootcampkmm.theme.onSurfaceVariantLightMediumContrast
import com.anncode.bootcampkmm.theme.onTertiaryContainerDark
import com.anncode.bootcampkmm.theme.onTertiaryContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.onTertiaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.onTertiaryContainerLight
import com.anncode.bootcampkmm.theme.onTertiaryContainerLightHighContrast
import com.anncode.bootcampkmm.theme.onTertiaryContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.onTertiaryDark
import com.anncode.bootcampkmm.theme.onTertiaryDarkHighContrast
import com.anncode.bootcampkmm.theme.onTertiaryDarkMediumContrast
import com.anncode.bootcampkmm.theme.onTertiaryLight
import com.anncode.bootcampkmm.theme.onTertiaryLightHighContrast
import com.anncode.bootcampkmm.theme.onTertiaryLightMediumContrast
import com.anncode.bootcampkmm.theme.outlineDark
import com.anncode.bootcampkmm.theme.outlineDarkHighContrast
import com.anncode.bootcampkmm.theme.outlineDarkMediumContrast
import com.anncode.bootcampkmm.theme.outlineLight
import com.anncode.bootcampkmm.theme.outlineLightHighContrast
import com.anncode.bootcampkmm.theme.outlineLightMediumContrast
import com.anncode.bootcampkmm.theme.outlineVariantDark
import com.anncode.bootcampkmm.theme.outlineVariantDarkHighContrast
import com.anncode.bootcampkmm.theme.outlineVariantDarkMediumContrast
import com.anncode.bootcampkmm.theme.outlineVariantLight
import com.anncode.bootcampkmm.theme.outlineVariantLightHighContrast
import com.anncode.bootcampkmm.theme.outlineVariantLightMediumContrast
import com.anncode.bootcampkmm.theme.primaryContainerDark
import com.anncode.bootcampkmm.theme.primaryContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.primaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.primaryContainerLight
import com.anncode.bootcampkmm.theme.primaryContainerLightHighContrast
import com.anncode.bootcampkmm.theme.primaryContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.primaryDark
import com.anncode.bootcampkmm.theme.primaryDarkHighContrast
import com.anncode.bootcampkmm.theme.primaryDarkMediumContrast
import com.anncode.bootcampkmm.theme.primaryLight
import com.anncode.bootcampkmm.theme.primaryLightHighContrast
import com.anncode.bootcampkmm.theme.primaryLightMediumContrast
import com.anncode.bootcampkmm.theme.scrimDark
import com.anncode.bootcampkmm.theme.scrimDarkHighContrast
import com.anncode.bootcampkmm.theme.scrimDarkMediumContrast
import com.anncode.bootcampkmm.theme.scrimLight
import com.anncode.bootcampkmm.theme.scrimLightHighContrast
import com.anncode.bootcampkmm.theme.scrimLightMediumContrast
import com.anncode.bootcampkmm.theme.secondaryContainerDark
import com.anncode.bootcampkmm.theme.secondaryContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.secondaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.secondaryContainerLight
import com.anncode.bootcampkmm.theme.secondaryContainerLightHighContrast
import com.anncode.bootcampkmm.theme.secondaryContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.secondaryDark
import com.anncode.bootcampkmm.theme.secondaryDarkHighContrast
import com.anncode.bootcampkmm.theme.secondaryDarkMediumContrast
import com.anncode.bootcampkmm.theme.secondaryLight
import com.anncode.bootcampkmm.theme.secondaryLightHighContrast
import com.anncode.bootcampkmm.theme.secondaryLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceBrightDark
import com.anncode.bootcampkmm.theme.surfaceBrightDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceBrightDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceBrightLight
import com.anncode.bootcampkmm.theme.surfaceBrightLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceBrightLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerDark
import com.anncode.bootcampkmm.theme.surfaceContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighDark
import com.anncode.bootcampkmm.theme.surfaceContainerHighDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighLight
import com.anncode.bootcampkmm.theme.surfaceContainerHighLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighestDark
import com.anncode.bootcampkmm.theme.surfaceContainerHighestDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighestDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighestLight
import com.anncode.bootcampkmm.theme.surfaceContainerHighestLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerHighestLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLight
import com.anncode.bootcampkmm.theme.surfaceContainerLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowDark
import com.anncode.bootcampkmm.theme.surfaceContainerLowDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowLight
import com.anncode.bootcampkmm.theme.surfaceContainerLowLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowestDark
import com.anncode.bootcampkmm.theme.surfaceContainerLowestDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowestDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowestLight
import com.anncode.bootcampkmm.theme.surfaceContainerLowestLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceContainerLowestLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceDark
import com.anncode.bootcampkmm.theme.surfaceDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceDimDark
import com.anncode.bootcampkmm.theme.surfaceDimDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceDimDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceDimLight
import com.anncode.bootcampkmm.theme.surfaceDimLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceDimLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceLight
import com.anncode.bootcampkmm.theme.surfaceLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceLightMediumContrast
import com.anncode.bootcampkmm.theme.surfaceVariantDark
import com.anncode.bootcampkmm.theme.surfaceVariantDarkHighContrast
import com.anncode.bootcampkmm.theme.surfaceVariantDarkMediumContrast
import com.anncode.bootcampkmm.theme.surfaceVariantLight
import com.anncode.bootcampkmm.theme.surfaceVariantLightHighContrast
import com.anncode.bootcampkmm.theme.surfaceVariantLightMediumContrast
import com.anncode.bootcampkmm.theme.tertiaryContainerDark
import com.anncode.bootcampkmm.theme.tertiaryContainerDarkHighContrast
import com.anncode.bootcampkmm.theme.tertiaryContainerDarkMediumContrast
import com.anncode.bootcampkmm.theme.tertiaryContainerLight
import com.anncode.bootcampkmm.theme.tertiaryContainerLightHighContrast
import com.anncode.bootcampkmm.theme.tertiaryContainerLightMediumContrast
import com.anncode.bootcampkmm.theme.tertiaryDark
import com.anncode.bootcampkmm.theme.tertiaryDarkHighContrast
import com.anncode.bootcampkmm.theme.tertiaryDarkMediumContrast
import com.anncode.bootcampkmm.theme.tertiaryLight
import com.anncode.bootcampkmm.theme.tertiaryLightHighContrast
import com.anncode.bootcampkmm.theme.tertiaryLightMediumContrast
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

