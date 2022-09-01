package defpackage;

/* compiled from: PG */
/* renamed from: jyv  reason: default package */
/* loaded from: classes.dex */
public final class jyv implements jzm {
    public final llp a;

    public jyv() {
    }

    public jyv(llp llpVar) {
        this.a = llpVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lfe] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, jzm] */
    private final jzm f(jsz jszVar) {
        llp llpVar = this.a;
        int i = ((lrl) llpVar).c;
        int i2 = 0;
        while (i2 < i) {
            jma jmaVar = (jma) llpVar.get(i2);
            i2++;
            if (jmaVar.b.a(jszVar)) {
                return jmaVar.a;
            }
        }
        throw new IllegalArgumentException("No scheduler found for params: ".concat(String.valueOf(String.valueOf(jszVar))));
    }

    @Override // defpackage.jzm
    public final void a(jsz jszVar) {
        f(jszVar).a(jszVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, jzm] */
    @Override // defpackage.jzm
    public final void b() {
        llp llpVar = this.a;
        int i = ((lrl) llpVar).c;
        llk llkVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                ((jma) llpVar.get(i2)).a.b();
            } catch (Throwable th) {
                if (llkVar == null) {
                    llkVar = llp.e();
                }
                llkVar.h(th);
            }
        }
        if (llkVar == null) {
            return;
        }
        throw new jye(jro.a("Some schedulers failed to cancel all tasks", llkVar.g()));
    }

    @Override // defpackage.jzm
    public final void c(jsz jszVar) {
        f(jszVar).c(jszVar);
    }

    @Override // defpackage.jzm
    public final void d(jsz jszVar, int i) {
        f(jszVar).d(jszVar, i);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, jzm] */
    @Override // defpackage.jzm
    public final boolean e(jsz jszVar) {
        llp llpVar = this.a;
        int i = ((lrl) llpVar).c;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (((jma) llpVar.get(i2)).a.e(jszVar)) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jyv)) {
            return false;
        }
        return lre.I(this.a, ((jyv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return "ForwardingTaskScheduler{schedulers=" + valueOf + "}";
    }
}
