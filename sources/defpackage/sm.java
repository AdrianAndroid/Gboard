package defpackage;

/* compiled from: PG */
/* renamed from: sm  reason: default package */
/* loaded from: classes2.dex */
public final class sm extends sl {
    public int m;

    public sm(st stVar) {
        super(stVar);
        this.l = stVar instanceof sq ? 2 : 3;
    }

    @Override // defpackage.sl
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        for (sj sjVar : this.j) {
            sjVar.f();
        }
    }
}
