package defpackage;

import android.content.Context;
import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: flk  reason: default package */
/* loaded from: classes.dex */
public final class flk {
    private final Context a;
    private final String b;
    private final lgb c = cqg.j;
    private EnumSet d = fmd.e;

    public flk(Context context, String str) {
        fyb.ax(context);
        this.a = context;
        fyb.aF(str);
        this.b = str;
    }

    public final flo a() {
        flo.i(this.d);
        Context context = this.a;
        return new flo(context, this.b, this.d, fmi.c(context, this.c), new fmn(this.a));
    }

    public final void b(EnumSet enumSet) {
        fyb.ax(enumSet);
        this.d = enumSet;
        flo.f(enumSet);
    }
}
