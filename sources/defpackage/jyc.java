package defpackage;

/* compiled from: PG */
/* renamed from: jyc  reason: default package */
/* loaded from: classes.dex */
public final class jyc {
    public juu a;
    public jsz b;
    public jxy c = jxy.DOWNLOAD_STOP_REASON_UNSPECIFIED;
    private final jws d;
    private mko e;

    public jyc(juu juuVar, jws jwsVar) {
        this.a = juuVar;
        this.b = jzk.a(juuVar);
        this.d = jwsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.e != null;
    }

    public final void b(jxy jxyVar, jls jlsVar) {
        String a;
        if (!a()) {
            try {
                ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/scheduling/ActiveDownloads$DownloadContext", "pause", 265, "ActiveDownloads.java")).G("Pausing download %s, reason: %s", this.a.f().f(), jxyVar.name());
                jsr e = jsr.e(this.a.l());
                jws jwsVar = this.d;
                synchronized (jwsVar) {
                    jwr jwrVar = (jwr) jwsVar.c.get(e);
                    a = jwrVar != null ? jwrVar.a() : null;
                }
                jlsVar.a(new jqn(this, a, jxyVar, 3));
                this.c = jxyVar;
                this.e = this.d.b(e);
            } catch (IllegalStateException e2) {
                ((luc) ((luc) ((luc) jsh.a.c()).i(e2)).k("com/google/android/libraries/micore/superpacks/scheduling/ActiveDownloads$DownloadContext", "pause", 289, "ActiveDownloads.java")).w("Failed to parse download %s for canceling", this.a.f().f());
            }
        }
    }

    public final String toString() {
        String l = this.a.l();
        String valueOf = String.valueOf(this.b);
        return "{" + l + ", " + valueOf + "}";
    }
}
