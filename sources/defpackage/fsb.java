package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fsb  reason: default package */
/* loaded from: classes.dex */
public final class fsb extends fnz {
    private static final fgy a;
    private static final ijk k;

    static {
        fsa fsaVar = new fsa();
        a = fsaVar;
        k = new ijk("ClientTelemetry.API", fsaVar, null, null, null);
    }

    public fsb(Context context, frv frvVar) {
        super(context, k, frvVar, fny.a, null, null, null, null);
    }

    public final void a(fru fruVar) {
        fqf b = fqg.b();
        b.b = new fmv[]{fmr.a};
        b.b();
        b.a = new flc(fruVar, 4);
        k(b.a());
    }
}
