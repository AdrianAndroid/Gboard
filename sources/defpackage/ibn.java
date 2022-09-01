package defpackage;

/* compiled from: PG */
/* renamed from: ibn  reason: default package */
/* loaded from: classes.dex */
public final class ibn {
    public boolean a;
    public long b;
    public final gvy c;

    public ibn(boolean z, long j, int[] iArr) {
        gvy gvyVar = new gvy(2);
        this.c = gvyVar;
        this.a = z;
        this.b = j;
        if (iArr != null) {
            gvyVar.c(iArr);
        }
    }

    public final ibo a() {
        return new ibo(this);
    }

    public final void b(int... iArr) {
        this.c.c(iArr);
    }
}
