package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* renamed from: jf  reason: default package */
/* loaded from: classes.dex */
public final class jf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
