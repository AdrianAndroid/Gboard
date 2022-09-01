package defpackage;

/* compiled from: PG */
/* renamed from: nsf  reason: default package */
/* loaded from: classes2.dex */
public final class nsf extends nsb {
    private final nsb a;
    private final nse b;

    public nsf(nsb nsbVar, nse nseVar) {
        this.a = nsbVar;
        jdg.Q(nseVar, "interceptor");
        this.b = nseVar;
    }

    @Override // defpackage.nsb
    public final nsd a(nuq nuqVar, nsa nsaVar) {
        return this.b.a(nuqVar, nsaVar, this.a);
    }

    @Override // defpackage.nsb
    public final String b() {
        return this.a.b();
    }
}
