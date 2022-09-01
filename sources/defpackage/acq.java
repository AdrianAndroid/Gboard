package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: acq  reason: default package */
/* loaded from: classes.dex */
public final class acq {
    static int a(View view) {
        return view.getLayoutDirection();
    }

    static int b(View view) {
        return view.getTextDirection();
    }

    static Locale c(TextView textView) {
        return textView.getTextLocale();
    }

    public static void d(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    static void e(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    static void f(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    static void g(View view, int i) {
        view.setTextDirection(i);
    }

    public static Drawable[] h(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
