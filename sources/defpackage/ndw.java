package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ndw  reason: default package */
/* loaded from: classes2.dex */
public abstract class ndw implements nhf {
    private static final nfb a = nfb.a();

    private static final void k(ngz ngzVar) {
        if (ngzVar == null || ngzVar.cE()) {
            return;
        }
        throw ndu.r().a();
    }

    @Override // defpackage.nhf
    /* renamed from: a */
    public final ngz h(byte[] bArr, nfb nfbVar) {
        return i(bArr, 0, bArr.length, nfbVar);
    }

    @Override // defpackage.nhf
    /* renamed from: b */
    public final ngz i(byte[] bArr, int i, int i2, nfb nfbVar) {
        ngz c = c(bArr, i, i2, nfbVar);
        k(c);
        return c;
    }

    public ngz c(byte[] bArr, int i, int i2, nfb nfbVar) {
        throw null;
    }

    @Override // defpackage.nhf
    public final /* bridge */ /* synthetic */ Object d(byte[] bArr) {
        return h(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ngz, java.lang.Object] */
    @Override // defpackage.nhf
    public final /* bridge */ /* synthetic */ Object e(nem nemVar, nfb nfbVar) {
        try {
            ner l = nemVar.l();
            ?? j = j(l, nfbVar);
            try {
                l.z(0);
                k(j);
                return j;
            } catch (ngd e) {
                throw e;
            }
        } catch (ngd e2) {
            throw e2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ngz, java.lang.Object] */
    @Override // defpackage.nhf
    public final /* bridge */ /* synthetic */ Object f(ner nerVar, nfb nfbVar) {
        ?? j = j(nerVar, nfbVar);
        k(j);
        return j;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ngz, java.lang.Object] */
    @Override // defpackage.nhf
    public final /* bridge */ /* synthetic */ Object g(InputStream inputStream, nfb nfbVar) {
        ner H = ner.H(inputStream);
        ?? j = j(H, nfbVar);
        try {
            H.z(0);
            k(j);
            return j;
        } catch (ngd e) {
            throw e;
        }
    }
}
