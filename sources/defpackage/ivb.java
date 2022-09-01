package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivb  reason: default package */
/* loaded from: classes.dex */
public final class ivb implements ipj {
    public static final ivb a = new ivb();
    private static final llw b = lrq.b;

    private ivb() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        mxi mxiVar = (mxi) nfm.z(mxi.a, bArr, nfb.b());
        return new iuz(2);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof mxi) {
            mxi mxiVar = (mxi) ngzVar;
            return new iuz(2);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.nebulae.MetricProtos.Counts");
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
