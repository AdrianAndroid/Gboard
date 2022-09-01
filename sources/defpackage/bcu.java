package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: bcu  reason: default package */
/* loaded from: classes.dex */
public final class bcu implements bcv {
    private final axp a;
    private final bcv b;
    private final bcv c;

    public bcu(axp axpVar, bcv bcvVar, bcv bcvVar2) {
        this.a = axpVar;
        this.b = bcvVar;
        this.c = bcvVar2;
    }

    @Override // defpackage.bcv
    public final axh a(axh axhVar, ava avaVar) {
        Drawable drawable = (Drawable) axhVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(bbn.g(((BitmapDrawable) drawable).getBitmap(), this.a), avaVar);
        }
        if (!(drawable instanceof bck)) {
            return null;
        }
        return this.c.a(axhVar, avaVar);
    }
}
