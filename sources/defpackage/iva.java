package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: iva  reason: default package */
/* loaded from: classes.dex */
public final class iva implements ipj {
    public static final iva a = new iva();
    private static final llw b = lrq.b;

    private iva() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        iyh iyhVar = (iyh) nfm.z(iyh.a, bArr, nfb.b());
        return new iuz(0);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof iyh) {
            iyh iyhVar = (iyh) ngzVar;
            return new iuz(0);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.android.libraries.inputmethod.userfeaturecache.AutoCorrectionStatsProto.AutoCorrectionStats");
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
