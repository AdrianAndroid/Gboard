package defpackage;

/* compiled from: PG */
/* renamed from: fqk  reason: default package */
/* loaded from: classes.dex */
public abstract class fqk {
    public Object d;
    public boolean e = false;
    final /* synthetic */ fqq f;

    public fqk(fqq fqqVar, Object obj) {
        this.f = fqqVar;
        this.d = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void f() {
        e();
        synchronized (this.f.g) {
            this.f.g.remove(this);
        }
    }
}
