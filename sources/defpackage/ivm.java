package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivm  reason: default package */
/* loaded from: classes.dex */
public final class ivm implements ipj {
    public static final ivm a = new ivm();
    private static final llw b = lrq.b;

    private ivm() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        izn iznVar = (izn) nfm.z(izn.a, bArr, nfb.b());
        return new iuz(11);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof izn) {
            izn iznVar = (izn) ngzVar;
            return new iuz(11);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.android.libraries.inputmethod.userfeaturecache.TypoStatsProto.UserTypoStats");
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
