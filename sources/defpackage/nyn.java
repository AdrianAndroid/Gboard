package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: nyn  reason: default package */
/* loaded from: classes2.dex */
final class nyn extends nzh {
    final /* synthetic */ ofi a;
    final /* synthetic */ nyq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyn(nyq nyqVar, ofi ofiVar) {
        super(nyqVar.b.d);
        this.b = nyqVar;
        this.a = ofiVar;
    }

    @Override // defpackage.nzh
    public final void a() {
        int i = oiw.a;
        if (this.b.a != null) {
            oao.e(this.a);
            return;
        }
        while (true) {
            InputStream g = this.a.g();
            if (g == null) {
                return;
            }
            try {
                nyq nyqVar = this.b;
                nyqVar.c.g(nyqVar.b.a.e.b(g));
                g.close();
            } catch (Throwable th) {
                oao.f(g);
                throw th;
            }
        }
    }
}
