package defpackage;

import android.icu.util.ULocale;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: xm  reason: default package */
/* loaded from: classes2.dex */
public final class xm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ULocale a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ULocale b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Object obj) {
        return ((ULocale) obj).getScript();
    }

    public static int d(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float e = e(((i >> 16) & 255) / 255.0f);
        float e2 = e(((i >> 8) & 255) / 255.0f);
        float e3 = e((i & 255) / 255.0f);
        float e4 = e(((i2 >> 16) & 255) / 255.0f);
        float e5 = e(((i2 >> 8) & 255) / 255.0f);
        float e6 = e((i2 & 255) / 255.0f);
        return (Math.round((f2 + (f * ((((i2 >> 24) & 255) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(f(e + ((e4 - e) * f)) * 255.0f) << 16) | (Math.round(f(e2 + ((e5 - e2) * f)) * 255.0f) << 8) | Math.round(f(e3 + ((e6 - e3) * f)) * 255.0f);
    }

    private static float e(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float f(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
