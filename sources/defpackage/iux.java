package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: iux  reason: default package */
/* loaded from: classes.dex */
public final class iux implements ipj {
    public static final iux a = new iux();
    private static final llw b = lrq.b;

    private iux() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        iyq iyqVar = (iyq) nfm.z(iyq.a, bArr, nfb.b());
        return new iuz(1);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof iyq) {
            iyq iyqVar = (iyq) ngzVar;
            return new iuz(1);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.android.libraries.inputmethod.userfeaturecache.P13nFeatureProto.ACTThreshold");
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
