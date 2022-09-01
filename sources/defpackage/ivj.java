package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivj  reason: default package */
/* loaded from: classes.dex */
public final class ivj implements ipj {
    public static final ivj a = new ivj();
    private static final llw b = lrq.b;

    private ivj() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        mre mreVar = (mre) nfm.z(mre.b, bArr, nfb.b());
        return new iuz(8);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof mre) {
            mre mreVar = (mre) ngzVar;
            return new iuz(8);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.decoder.InputProcessProtos.TrimmedInputActionCollection");
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
