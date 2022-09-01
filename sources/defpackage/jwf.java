package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: jwf  reason: default package */
/* loaded from: classes.dex */
public final class jwf implements jrs {
    private final kcq a;

    public jwf(mkr mkrVar) {
        this.a = kcq.h(mkrVar, "ChecksumValidator");
    }

    public static final boolean c(String str) {
        return (str == null || kcu.t(str) == null) ? false : true;
    }

    public final mko a(juc jucVar, String str, File file) {
        lug lugVar = jsh.a;
        jucVar.o().f();
        return this.a.e(jucVar.o(), new jwe(jucVar, str, file, 0));
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/packs/ChecksumValidator", "cancel", 120, "ChecksumValidator.java")).w("Canceling checksum validation of %s", jsrVar);
        return this.a.d(jsrVar);
    }

    @Override // defpackage.jsj
    public final String d() {
        return "ChecksumValidator";
    }
}
