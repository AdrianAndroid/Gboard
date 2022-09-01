package defpackage;

/* compiled from: PG */
/* renamed from: jja  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jja implements miy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jja(jjb jjbVar, boolean z, int i) {
        this.c = i;
        this.b = jjbVar;
        this.a = z;
    }

    public /* synthetic */ jja(jkk jkkVar, boolean z, int i) {
        this.c = i;
        this.b = jkkVar;
        this.a = z;
    }

    @Override // defpackage.miy
    public final mko a(Object obj) {
        int i = this.c;
        if (i == 0) {
            Object obj2 = this.b;
            Void r5 = (Void) obj;
            jjb jjbVar = (jjb) obj2;
            return jjbVar.c.b(this.a, jjbVar.f);
        } else if (i != 1) {
            jig jigVar = (jig) obj;
            jkk jkkVar = (jkk) this.b;
            return jkkVar.m(jkkVar.j(jigVar, this.a), new jke(jigVar, 4));
        } else {
            Object obj3 = this.b;
            Void r52 = (Void) obj;
            jjb jjbVar2 = (jjb) obj3;
            return jjbVar2.c.b(this.a, jjbVar2.f);
        }
    }
}
