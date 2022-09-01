package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivk  reason: default package */
/* loaded from: classes.dex */
public final class ivk implements ipj {
    public static final ivk a = new ivk();
    private static final llw b = lrq.b;

    private ivk() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        mwk mwkVar = (mwk) nfm.z(mwk.e, bArr, nfb.b());
        return new iuz(9);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof mwk) {
            mwk mwkVar = (mwk) ngzVar;
            return new iuz(9);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.decoder.UnifiedParamsProtos.UnifiedParams");
    }

    @Override // defpackage.ipj
    public final ngf c(String str) {
        return (ngf) b.get(str);
    }

    @Override // defpackage.ipj
    public final Collection d() {
        return b.keySet();
    }
}
