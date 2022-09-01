package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fcn  reason: default package */
/* loaded from: classes.dex */
public final class fcn {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoicePromoBanner");

    public static fbm a(boolean z) {
        if (z) {
            return fbm.ROMANIZED_INDIC_VOICE_PROMO_STATUS;
        }
        return fbm.GENERAL_VOICE_PROMO_STATUS;
    }

    public static void b(Context context, boolean z) {
        fbr.h();
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoicePromoBanner", "onClickVoicePromoBanner", 109, "VoicePromoBanner.java")).t("send launch-voice-event to input bundle from voice promo banner");
        ino.K(context, null).f("has_voice_promo_clicked", true);
        ieh.j().e(a(z), 2);
    }
}
