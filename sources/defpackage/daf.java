package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: daf  reason: default package */
/* loaded from: classes.dex */
public final class daf implements ipj {
    public static final daf a = new daf();
    private static final llw b;

    static {
        lls h = llw.h();
        h.a("selection_hint", ngf.LONG);
        h.a("language_tag", ngf.STRING);
        h.a("gboard_version_code", ngf.INT);
        b = h.l();
    }

    private daf() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        return new ivg((eeu) nfm.z(eeu.g, bArr, nfb.b()), 1);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof eeu) {
            return new ivg((eeu) ngzVar, 1);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.android.apps.inputmethod.libs.search.proto.TrainingCacheDataProto.TrainingData");
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
