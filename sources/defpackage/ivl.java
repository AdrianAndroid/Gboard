package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivl  reason: default package */
/* loaded from: classes.dex */
public final class ivl implements ipj {
    public static final ivl a = new ivl();
    private static final llw b = lrq.b;

    private ivl() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        ize izeVar = (ize) nfm.z(ize.b, bArr, nfb.b());
        return new iuz(10);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof ize) {
            ize izeVar = (ize) ngzVar;
            return new iuz(10);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.android.libraries.inputmethod.userfeaturecache.SpatialStatsProto.UserSpatialStats");
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
