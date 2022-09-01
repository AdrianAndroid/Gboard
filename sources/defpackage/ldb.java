package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ldb  reason: default package */
/* loaded from: classes.dex */
public final class ldb implements mka {
    final /* synthetic */ lcx a;
    final /* synthetic */ mka b;

    public ldb(lcx lcxVar, mka mkaVar) {
        this.a = lcxVar;
        this.b = mkaVar;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        lcx f = ldh.f(this.a);
        try {
            this.b.a(th);
        } finally {
            ldh.f(f);
        }
    }

    @Override // defpackage.mka
    public final void b(Object obj) {
        lcx f = ldh.f(this.a);
        try {
            this.b.b(obj);
        } finally {
            ldh.f(f);
        }
    }
}
