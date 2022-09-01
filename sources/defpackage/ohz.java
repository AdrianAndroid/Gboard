package defpackage;

/* compiled from: PG */
/* renamed from: ohz  reason: default package */
/* loaded from: classes2.dex */
final class ohz extends ohy {
    private final nsd a;
    private boolean b = false;
    private boolean c = false;

    public ohz(nsd nsdVar) {
        this.a = nsdVar;
    }

    @Override // defpackage.oin
    public final void a() {
        this.a.c();
        this.c = true;
    }

    @Override // defpackage.oin
    public final void b(Throwable th) {
        this.a.b("Cancelled by client with StreamObserver.onError()", th);
        this.b = true;
    }

    @Override // defpackage.oin
    public final void c(Object obj) {
        jdg.G(!this.b, "Stream was terminated by error, no further calls are allowed");
        jdg.G(!this.c, "Stream is already completed, no further calls are allowed");
        this.a.e(obj);
    }

    public final void d() {
        this.a.d(1);
    }
}
