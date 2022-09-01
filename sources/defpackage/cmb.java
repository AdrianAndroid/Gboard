package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cmb  reason: default package */
/* loaded from: classes.dex */
public final class cmb implements cma {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/data/gif/GifFetcherImpl");
    public final cri b;
    public final dxs c;
    private final crt d;
    private final Executor e;

    public cmb(crt crtVar, dxs dxsVar, cri criVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.d = crtVar;
        this.c = dxsVar;
        this.b = criVar;
        this.e = executor;
    }

    @Override // defpackage.cma
    public final hiz a() {
        return hiz.p(new bof(this, 8), this.e);
    }

    @Override // defpackage.cma
    public final hja b(cmc cmcVar) {
        crt crtVar = this.d;
        hew a2 = cru.a();
        String str = cmcVar.a;
        if (str != null) {
            a2.a = str;
            hja g = hjg.g(hjg.f(new cjq(crtVar, a2.e(), 4)), cli.e, mjl.a);
            dxs dxsVar = this.c;
            cyk l = cyl.l();
            String str2 = cmcVar.a;
            if (str2 == null) {
                throw new NullPointerException("Null query");
            }
            cxu cxuVar = (cxu) l;
            cxuVar.b = str2;
            lfb lfbVar = cmcVar.b;
            if (lfbVar == null) {
                throw new NullPointerException("Null component");
            }
            cxuVar.c = lfbVar;
            lfb lfbVar2 = cmcVar.c;
            if (lfbVar2 == null) {
                throw new NullPointerException("Null limit");
            }
            cxuVar.d = lfbVar2;
            l.c(cmcVar.d);
            return hjg.d(lre.R(hjg.d(lre.S(hjg.g(dxsVar.k(l.a()), cli.d, mjl.a), new byi(g, 12))), g));
        }
        throw new NullPointerException("Null query");
    }
}
