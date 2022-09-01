package defpackage;

/* compiled from: PG */
/* renamed from: cxs  reason: default package */
/* loaded from: classes.dex */
public final class cxs extends cyh {
    public String a;
    public int b;
    private lfb c;
    private lfb d;
    private lfb e;
    private lfb f;
    private long g;
    private byte h;

    public cxs() {
        ldu lduVar = ldu.a;
        this.c = lduVar;
        this.d = lduVar;
        this.e = lduVar;
        this.f = lduVar;
    }

    public cxs(cyi cyiVar) {
        ldu lduVar = ldu.a;
        this.c = lduVar;
        this.d = lduVar;
        this.e = lduVar;
        this.f = lduVar;
        cxt cxtVar = (cxt) cyiVar;
        this.a = cxtVar.a;
        this.c = cxtVar.b;
        this.d = cxtVar.c;
        this.e = cxtVar.d;
        this.f = cxtVar.e;
        this.g = cxtVar.f;
        this.b = cxtVar.g;
        this.h = (byte) 1;
    }

    @Override // defpackage.cyh, defpackage.cyt
    /* renamed from: a */
    public final cyi b() {
        String str;
        int i;
        if (this.h != 1 || (str = this.a) == null || (i = this.b) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" baseUrl");
            }
            if (this.h == 0) {
                sb.append(" cacheExpirationTimeInSeconds");
            }
            if (this.b == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cxt(str, this.c, this.d, this.e, this.f, this.g, i);
    }

    @Override // defpackage.cyh
    public final void c(long j) {
        this.g = j;
        this.h = (byte) 1;
    }

    @Override // defpackage.cyh
    public final void d(String str) {
        this.d = lfb.g(str);
    }

    @Override // defpackage.cyh
    public final void e() {
        this.e = lfb.g("proactive");
    }

    @Override // defpackage.cyh
    public final void f(String str) {
        this.c = lfb.g(str);
    }

    @Override // defpackage.cyh, defpackage.cyt
    public final /* bridge */ /* synthetic */ void g(String str) {
        this.f = lfb.g(str);
    }
}
