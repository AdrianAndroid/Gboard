package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ldc  reason: default package */
/* loaded from: classes.dex */
public final class ldc implements leq {
    final /* synthetic */ lcx a;
    final /* synthetic */ leq b;

    public ldc(lcx lcxVar, leq leqVar) {
        this.a = lcxVar;
        this.b = leqVar;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        lcx f = ldh.f(this.a);
        try {
            return this.b.a(obj);
        } finally {
            ldh.f(f);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return "propagating=[" + valueOf + "]";
    }
}
