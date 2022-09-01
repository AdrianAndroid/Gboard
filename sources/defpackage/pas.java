package defpackage;

/* compiled from: PG */
/* renamed from: pas  reason: default package */
/* loaded from: classes2.dex */
final class pas extends ozs implements pam {
    final ozs a;
    final ozk b;
    Object c;
    Throwable d;

    public pas(ozs ozsVar, ozk ozkVar) {
        this.a = ozsVar;
        this.b = ozkVar;
    }

    @Override // defpackage.pam
    public final void a() {
        try {
            Throwable th = this.d;
            if (th != null) {
                this.d = null;
                this.a.il(th);
            } else {
                Object obj = this.c;
                this.c = null;
                this.a.b(obj);
            }
        } finally {
            this.b.d();
        }
    }

    @Override // defpackage.ozs
    public final void b(Object obj) {
        this.c = obj;
        this.b.im(this);
    }

    @Override // defpackage.ozs
    public final void il(Throwable th) {
        this.d = th;
        this.b.im(this);
    }
}
