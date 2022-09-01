package defpackage;

/* compiled from: PG */
/* renamed from: cxu  reason: default package */
/* loaded from: classes.dex */
public final class cxu extends cyk {
    public String a;
    public String b;
    public lfb c;
    public lfb d;
    public String e;
    private lfb f;
    private lfb g;
    private lfb h;
    private int i;

    public cxu() {
        ldu lduVar = ldu.a;
        this.c = lduVar;
        this.f = lduVar;
        this.g = lduVar;
        this.d = lduVar;
        this.h = lduVar;
    }

    public cxu(cyl cylVar) {
        ldu lduVar = ldu.a;
        this.c = lduVar;
        this.f = lduVar;
        this.g = lduVar;
        this.d = lduVar;
        this.h = lduVar;
        cxv cxvVar = (cxv) cylVar;
        this.a = cxvVar.a;
        this.b = cxvVar.b;
        this.c = cxvVar.c;
        this.f = cxvVar.d;
        this.g = cxvVar.e;
        this.d = cxvVar.f;
        this.e = cxvVar.g;
        this.h = cxvVar.h;
        this.i = cxvVar.i;
    }

    @Override // defpackage.cyk, defpackage.cyt
    /* renamed from: a */
    public final cyl b() {
        if (this.a == null || this.b == null || this.e == null || this.i == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" baseUrl");
            }
            if (this.b == null) {
                sb.append(" query");
            }
            if (this.e == null) {
                sb.append(" contentFilterLevel");
            }
            if (this.i == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cxv(this.a, this.b, this.c, this.f, this.g, this.d, this.e, this.h, this.i);
    }

    @Override // defpackage.cyk
    public final cyk c(int i) {
        if (i != 0) {
            this.i = i;
            return this;
        }
        throw new NullPointerException("Null priority");
    }

    @Override // defpackage.cyk, defpackage.cyv
    public final /* synthetic */ void d(lfb lfbVar) {
        this.h = lfbVar;
    }

    @Override // defpackage.cyk, defpackage.cyt
    public final /* bridge */ /* synthetic */ void g(String str) {
        this.g = lfb.g(str);
    }
}
