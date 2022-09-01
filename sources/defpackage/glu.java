package defpackage;

/* compiled from: PG */
/* renamed from: glu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class glu implements gmb {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ glu(glv glvVar, blq blqVar, int i) {
        this.c = i;
        this.a = glvVar;
        this.b = blqVar;
    }

    public /* synthetic */ glu(glv glvVar, gmb gmbVar, int i) {
        this.c = i;
        this.b = glvVar;
        this.a = gmbVar;
    }

    public /* synthetic */ glu(nox noxVar, gmb gmbVar, int i) {
        this.c = i;
        this.a = noxVar;
        this.b = gmbVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [nox, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, gmb] */
    /* JADX WARN: Type inference failed for: r4v0, types: [blq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, gmb] */
    @Override // defpackage.gmb
    public final gma a(bmi bmiVar, blw blwVar) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                glv glvVar = (glv) this.a;
                return new gkz(bmiVar, blwVar, this.b, glvVar.i, glvVar.g);
            }
            Object obj = this.b;
            ?? r6 = this.a;
            long j = bky.d.a;
            glv glvVar2 = (glv) obj;
            lfb lfbVar = glvVar2.d;
            bmr bmrVar = glvVar2.l;
            return new gmc(bmiVar, blwVar, (int) j, lfbVar, r6);
        }
        return new gls(bmiVar, blwVar, this.a, this.b);
    }
}
