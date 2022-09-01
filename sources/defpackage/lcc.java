package defpackage;

/* compiled from: PG */
/* renamed from: lcc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lcc implements mix {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lcc(ett ettVar, int i, int i2) {
        this.c = i2;
        this.b = ettVar;
        this.a = i;
    }

    public /* synthetic */ lcc(lcg lcgVar, int i, int i2) {
        this.c = i2;
        this.b = lcgVar;
        this.a = i;
    }

    @Override // defpackage.mix
    public final mko a() {
        if (this.c == 0) {
            return ((lcg) this.b).d(this.a);
        }
        Object obj = this.b;
        int i = this.a;
        ett ettVar = (ett) obj;
        bze bzeVar = ettVar.d;
        jsu j = jsv.j();
        j.a = (String) ett.b.c();
        j.d(2);
        j.g(((bzr) ettVar.d).j.a() ? 1 : 0);
        return bzeVar.e("theme_indices", i, j.a());
    }
}
