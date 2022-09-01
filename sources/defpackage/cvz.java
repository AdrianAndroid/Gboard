package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cvz  reason: default package */
/* loaded from: classes.dex */
public final class cvz implements azo {
    public final Context a;
    private final cvg c;
    private final jls e;
    private final lgb b = new boh(this, 11);
    private final idk d = ieh.j();

    public cvz(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.e = new jls(applicationContext, null, null);
        this.c = cvg.a(applicationContext, new cvj(context, 3));
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        return new cwb(this.e, this.d, this.b, null, null);
    }

    @Override // defpackage.azo
    public final void c() {
        this.c.close();
    }
}
