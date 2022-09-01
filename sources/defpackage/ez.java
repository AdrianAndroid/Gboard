package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: ez  reason: default package */
/* loaded from: classes.dex */
public final class ez {
    public static int a(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    public static Drawable b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    public static void c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void d(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            oc.a(view, charSequence);
            return;
        }
        oe oeVar = oe.a;
        if (oeVar != null && oeVar.c == view) {
            oe.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            oe oeVar2 = oe.b;
            if (oeVar2 != null && oeVar2.c == view) {
                oeVar2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new oe(view, charSequence);
    }
}
