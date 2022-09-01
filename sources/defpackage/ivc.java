package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivc  reason: default package */
/* loaded from: classes.dex */
public final class ivc implements ipj {
    public static final ivc a = new ivc();
    private static final llw b = lrq.b;

    private ivc() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        mrd mrdVar = (mrd) nfm.z(mrd.b, bArr, nfb.b());
        return new iuz(3);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof mrd) {
            mrd mrdVar = (mrd) ngzVar;
            return new iuz(3);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.decoder.InputProcessProtos.InputActionCollection");
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
