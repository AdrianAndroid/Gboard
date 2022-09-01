package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mr  reason: default package */
/* loaded from: classes2.dex */
public final class mr implements mt {
    private final /* synthetic */ int a;

    public mr(int i) {
        this.a = i;
    }

    @Override // defpackage.mt
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i = this.a;
        if (i == 0) {
            try {
                return akf.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        } else if (i == 1) {
            try {
                return eq.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        } else {
            try {
                return akp.b(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e3);
                return null;
            }
        }
    }
}
