package defpackage;

/* compiled from: PG */
/* renamed from: mjr  reason: default package */
/* loaded from: classes.dex */
public final class mjr implements mix {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mjr(lcx lcxVar, mix mixVar, int i) {
        this.c = i;
        this.b = lcxVar;
        this.a = mixVar;
    }

    public mjr(mjt mjtVar, mix mixVar, int i) {
        this.c = i;
        this.a = mjtVar;
        this.b = mixVar;
    }

    public final String toString() {
        if (this.c != 0) {
            String valueOf = String.valueOf(this.a);
            return "propagating=[" + valueOf + "]";
        }
        return this.b.toString();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mix] */
    /* JADX WARN: Type inference failed for: r0v7, types: [lcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mix] */
    @Override // defpackage.mix
    public final mko a() {
        if (this.c != 0) {
            lcx f = ldh.f(this.b);
            try {
                return this.a.a();
            } finally {
                ldh.f(f);
            }
        }
        if (!((mjt) this.a).compareAndSet(mjs.NOT_RUN, mjs.STARTED)) {
            return kcu.I();
        }
        return this.b.a();
    }
}
