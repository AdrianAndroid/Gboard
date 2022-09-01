package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivd  reason: default package */
/* loaded from: classes.dex */
public final class ivd implements ipj {
    public static final ivd a = new ivd();
    private static final llw b = lrq.b;

    private ivd() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        iyr iyrVar = (iyr) nfm.z(iyr.a, bArr, nfb.b());
        return new iuz(4);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof iyr) {
            iyr iyrVar = (iyr) ngzVar;
            return new iuz(4);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.android.libraries.inputmethod.userfeaturecache.ParamSpaceProto.KcThreshold");
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
