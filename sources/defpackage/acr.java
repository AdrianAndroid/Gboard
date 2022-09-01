package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: acr  reason: default package */
/* loaded from: classes.dex */
public final class acr {
    static int a(TextView textView) {
        return textView.getBreakStrategy();
    }

    static int b(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    static ColorStateList c(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    static PorterDuff.Mode d(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    static void e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    static void h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
