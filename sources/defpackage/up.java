package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: up  reason: default package */
/* loaded from: classes2.dex */
public final class up {
    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static void b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static ActionMode.Callback c(ActionMode.Callback callback) {
        return (!(callback instanceof act) || Build.VERSION.SDK_INT < 26) ? callback : ((act) callback).a;
    }

    public static ActionMode.Callback d(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof act) || callback == null) ? callback : new act(callback, textView);
    }

    public static void e(TextView textView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 24) {
            acr.f(textView, colorStateList);
        } else if (!(textView instanceof acv)) {
        } else {
            ((acv) textView).eU(colorStateList);
        }
    }

    public static void f(TextView textView, int i) {
        int i2;
        nq.e(i);
        if (Build.VERSION.SDK_INT >= 28) {
            acs.b(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (acp.c(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i <= Math.abs(i2)) {
            return;
        }
        textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
    }

    public static void g(TextView textView, int i) {
        int i2;
        nq.e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (acp.c(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void h(TextView textView, int i) {
        nq.e(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        acq.d(textView, drawable, drawable2, drawable3, null);
    }
}
