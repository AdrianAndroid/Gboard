package defpackage;

/* compiled from: PG */
/* renamed from: cxw  reason: default package */
/* loaded from: classes.dex */
public final class cxw extends czd {
    public String a;
    public String b;
    public String c;
    public int d;
    private lfb e;
    private lfb f;

    public cxw() {
        ldu lduVar = ldu.a;
        this.e = lduVar;
        this.f = lduVar;
    }

    public cxw(cze czeVar) {
        ldu lduVar = ldu.a;
        this.e = lduVar;
        this.f = lduVar;
        cxx cxxVar = (cxx) czeVar;
        this.a = cxxVar.a;
        this.b = cxxVar.b;
        this.c = cxxVar.c;
        this.e = cxxVar.d;
        this.f = cxxVar.e;
        this.d = cxxVar.f;
    }

    @Override // defpackage.czd, defpackage.cyt
    /* renamed from: a */
    public final cze b() {
        if (this.a == null || this.b == null || this.c == null || this.d == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" baseUrl");
            }
            if (this.b == null) {
                sb.append(" query");
            }
            if (this.c == null) {
                sb.append(" contentFilterLevel");
            }
            if (this.d == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cxx(this.a, this.b, this.c, this.e, this.f, this.d);
    }

    @Override // defpackage.czd, defpackage.cyv
    public final /* synthetic */ void d(lfb lfbVar) {
        this.f = lfbVar;
    }

    @Override // defpackage.czd, defpackage.cyt
    public final /* bridge */ /* synthetic */ void g(String str) {
        this.e = lfb.g(str);
    }
}
