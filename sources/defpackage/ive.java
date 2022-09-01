package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ive  reason: default package */
/* loaded from: classes.dex */
public final class ive implements ipj {
    public static final ive a = new ive();
    private static final llw b = lrq.b;

    private ive() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        mrm mrmVar = (mrm) nfm.z(mrm.p, bArr, nfb.b());
        return new iuz(5);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof mrm) {
            mrm mrmVar = (mrm) ngzVar;
            return new iuz(5);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.decoder.KeyboardData.KeyboardLayout");
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
