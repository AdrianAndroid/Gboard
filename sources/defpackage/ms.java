package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: ms  reason: default package */
/* loaded from: classes2.dex */
final class ms implements mt {
    @Override // defpackage.mt
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) ms.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                ez.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
            }
        }
        return null;
    }
}
