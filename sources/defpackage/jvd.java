package defpackage;

/* compiled from: PG */
/* renamed from: jvd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jvd implements leq {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ jvd(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            boolean z = this.a;
            jvb jvbVar = (jvb) obj;
            int i2 = juz.a;
            return z ? jvbVar.a.f() : jvbVar.a.toString();
        } else if (i == 1) {
            Void r3 = (Void) obj;
            return Boolean.valueOf(this.a);
        } else {
            boolean z2 = this.a;
            jss jssVar = (jss) obj;
            int i3 = juz.a;
            if (z2) {
                return jssVar.b().f();
            }
            return jssVar.b().toString();
        }
    }
}
