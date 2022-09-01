package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ivh  reason: default package */
/* loaded from: classes.dex */
public final class ivh implements ipj {
    public static final ivh a = new ivh();
    private static final llw b;

    static {
        lls h = llw.h();
        h.a("field_id", ngf.INT);
        h.a("package_name", ngf.STRING);
        h.a("gboard_version_code", ngf.INT);
        h.a("locales", ngf.STRING);
        h.a("klp_locales", ngf.STRING);
        h.a("klp_versions", ngf.STRING);
        h.a("experiment_ids", ngf.STRING);
        b = h.l();
    }

    private ivh() {
    }

    @Override // defpackage.ipj
    public final ipi a(byte[] bArr) {
        return new ivg((mxa) nfm.z(mxa.u, bArr, nfb.b()), 0);
    }

    @Override // defpackage.ipj
    public final ipi b(ngz ngzVar) {
        if (ngzVar instanceof mxa) {
            return new ivg((mxa) ngzVar, 0);
        }
        throw new IllegalArgumentException("Message is not instance of com.google.inputmethod.keyboard.nebulae.BasicProto.Session");
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
