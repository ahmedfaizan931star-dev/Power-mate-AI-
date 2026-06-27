package com.powermate.ai.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

// ── Core Surface Colors ────────────────────────────────────────────────────
val AmoledBlack    = Color(0xFF020912)
val SurfaceDark    = Color(0xFF0A1628)
val CardDark       = Color(0xFF0F1C2E)
val CardElevated   = Color(0xFF162236)
val CardHighlight  = Color(0xFF1E2D42)
// Used for the bottom navigation bar — sits between AmoledBlack and SurfaceDark in the
// same tonal family so it reads as "the same dark surface system" rather than a separate hue.
val NavSurface     = Color(0xFF060D17)

// ── Brand Colors ───────────────────────────────────────────────────────────
val PrimaryBlue    = Color(0xFF2563EB)
val PrimaryBlueDeep = Color(0xFF001A72)
val SoftPrimary    = Color(0xFFB4C5FF)
val Cyan           = Color(0xFF22D3EE)
val CyanDeep       = Color(0xFF0891B2)
val ElectricBlue   = Color(0xFF3B82F6)

// ── Status Colors ──────────────────────────────────────────────────────────
val SuccessGreen   = Color(0xFF22C55E)
val SuccessDeep    = Color(0xFF16A34A)
val WarningAmber   = Color(0xFFF59E0B)
val WarningDeep    = Color(0xFFD97706)
val DangerRed      = Color(0xFFEF4444)
val DangerDeep     = Color(0xFFDC2626)

// ── Text Colors ────────────────────────────────────────────────────────────
val TextMain       = Color(0xFFF8FAFC)
val TextSecondary  = Color(0xFF94A3B8)
val TextMuted      = Color(0xFF64748B)
val TextAccent     = Color(0xFFE2E8F0)

// ── Gradient Palettes (use with Brush.linearGradient) ─────────────────────
val GradientPrimary   = listOf(Color(0xFF1D4ED8), Color(0xFF22D3EE))
val GradientSuccess   = listOf(Color(0xFF16A34A), Color(0xFF22D3EE))
val GradientWarning   = listOf(Color(0xFFD97706), Color(0xFFF59E0B))
val GradientDanger    = listOf(Color(0xFFDC2626), Color(0xFFF97316))
val GradientPurple    = listOf(Color(0xFF7C3AED), Color(0xFF22D3EE))
val GradientGold      = listOf(Color(0xFFCA8A04), Color(0xFFFBBF24))

private val DarkColors = darkColorScheme(
    primary              = SoftPrimary,
    onPrimary            = PrimaryBlueDeep,
    primaryContainer     = PrimaryBlue,
    onPrimaryContainer   = TextMain,
    secondary            = Cyan,
    onSecondary          = AmoledBlack,
    tertiary             = SuccessGreen,
    onTertiary           = AmoledBlack,
    background           = AmoledBlack,
    onBackground         = TextMain,
    surface              = SurfaceDark,
    onSurface            = TextMain,
    surfaceVariant       = CardElevated,
    onSurfaceVariant     = TextSecondary,
    // These tonal-elevation roles back native Material3 surfaces (TopAppBar, DropdownMenu,
    // Scaffold) — without them M3 falls back to its own blue-gray defaults that clash with
    // this app's custom AMOLED/card palette used everywhere else.
    surfaceContainerLowest  = AmoledBlack,
    surfaceContainerLow     = SurfaceDark,
    surfaceContainer        = CardDark,
    surfaceContainerHigh    = CardElevated,
    surfaceContainerHighest = CardHighlight,
    error                = DangerRed,
    onError              = TextMain,
    outline              = TextMuted,
    outlineVariant       = TextMuted.copy(alpha = 0.4f)
)

// Lighter-weight typography so any native Material3 component that falls back to default
// type styles (menus, dialogs, app bars) matches the lighter, more premium feel used
// throughout the rest of the app's hand-styled text.
private val PowerMateTypography = Typography().let { base ->
    base.copy(
        titleLarge = base.titleLarge.copy(fontWeight = FontWeight.SemiBold),
        titleMedium = base.titleMedium.copy(fontWeight = FontWeight.SemiBold),
        titleSmall = base.titleSmall.copy(fontWeight = FontWeight.Medium),
        bodyLarge = base.bodyLarge.copy(fontWeight = FontWeight.Normal),
        bodyMedium = base.bodyMedium.copy(fontWeight = FontWeight.Normal),
        bodySmall = base.bodySmall.copy(fontWeight = FontWeight.Normal),
        labelLarge = base.labelLarge.copy(fontWeight = FontWeight.Medium),
        labelMedium = base.labelMedium.copy(fontWeight = FontWeight.Medium),
        labelSmall = base.labelSmall.copy(fontWeight = FontWeight.Medium)
    )
}

@Composable
fun PowerMateTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColors,
        typography = PowerMateTypography,
        content = content
    )
}
