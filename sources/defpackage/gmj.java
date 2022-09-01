package defpackage;

/* compiled from: PG */
/* renamed from: gmj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gmj implements gnk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ gmj(glv glvVar, blq blqVar, bmi bmiVar, blw blwVar, int i) {
        this.e = i;
        this.c = glvVar;
        this.d = blqVar;
        this.b = bmiVar;
        this.a = blwVar;
    }

    public /* synthetic */ gmj(gmk gmkVar, gmm gmmVar, gmm gmmVar2, blo bloVar, int i) {
        this.e = i;
        this.a = gmkVar;
        this.b = gmmVar;
        this.c = gmmVar2;
        this.d = bloVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [blq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [glu, gmb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, blw] */
    /* JADX WARN: Type inference failed for: r5v6, types: [glt] */
    /* JADX WARN: Type inference failed for: r7v0, types: [blo, java.lang.Object] */
    @Override // defpackage.gnk
    public final Object a() {
        if (this.e == 0) {
            Object obj = this.a;
            gmk gmkVar = (gmk) obj;
            return mio.h(gmkVar.e.a(), new fem(gmkVar, (gmm) this.b, (gmm) this.c, (blo) this.d, 2), mjl.a);
        }
        Object obj2 = this.c;
        ?? r1 = this.d;
        Object obj3 = this.b;
        ?? r3 = this.a;
        final glv glvVar = (glv) obj2;
        final glu gluVar = new glu(glvVar, (blq) r1, 1);
        if (glvVar.e.e()) {
            final nox noxVar = (nox) glvVar.e.a();
            gluVar = new gmb() { // from class: glt
                @Override // defpackage.gmb
                public final gma a(bmi bmiVar, blw blwVar) {
                    glv glvVar2 = glv.this;
                    return new gla(bmiVar, blwVar, noxVar, glvVar2.j, glvVar2.h, glvVar2.i, glvVar2.k, gluVar);
                }
            };
        }
        if (glvVar.f.e()) {
            gluVar = new glu((nox) glvVar.f.a(), gluVar, 0);
        }
        ?? gluVar2 = new glu(glvVar, gluVar, 2);
        bmh bmhVar = new bmh((bmi) obj3);
        String str = glvVar.a.e() ? (String) ((lgb) glvVar.a.a()).a() : null;
        if (str != null) {
            bmhVar.c("User-Agent", str);
        }
        if (((bmm) glvVar.b.a()).c()) {
            bmhVar.c("Save-Data", "on");
        }
        return gluVar2.a(bmhVar.a(), r3).c();
    }
}
