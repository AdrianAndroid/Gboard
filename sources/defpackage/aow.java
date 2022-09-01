package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aow  reason: default package */
/* loaded from: classes.dex */
public final class aow {
    private static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public aow(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = String.valueOf(str).concat("/");
        }
        if (!(callback instanceof View)) {
            asa.a("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.c = map;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (d) {
            ((amz) this.c.get(str)).e = bitmap;
        }
    }
}
