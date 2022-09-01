package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jse  reason: default package */
/* loaded from: classes.dex */
public final class jse implements jrz {
    final /* synthetic */ jsf a;
    private final String b;
    private int c = 2;
    private long d;

    public jse(jsf jsfVar, String str) {
        this.a = jsfVar;
        this.b = str;
    }

    @Override // defpackage.jrz
    public final void a(String str, String str2, Object... objArr) {
        synchronized (this.a) {
            jzr jzrVar = this.a.b;
            if (jzrVar != null) {
                jzrVar.b(this.b, str, str2, 1, 0, 0L, objArr);
            }
        }
    }

    @Override // defpackage.jrz
    public final void b(String str, String str2, Object... objArr) {
        synchronized (this.a) {
            jzr jzrVar = this.a.b;
            if (jzrVar != null) {
                jzrVar.b(this.b, str, str2, 2, 0, 0L, objArr);
            }
        }
    }

    @Override // defpackage.jrz
    public final void c(String str, String str2, Object... objArr) {
        synchronized (this.a) {
            jzr jzrVar = this.a.b;
            if (jzrVar != null) {
                jzrVar.b(this.b, str, str2, 4, this.c, 0L, objArr);
            }
        }
    }

    @Override // defpackage.jrz
    public final void d(Object... objArr) {
        synchronized (this.a) {
            jzr jzrVar = this.a.b;
            if (jzrVar != null) {
                jzrVar.b(this.b, "files", "deleted", 3, 0, this.d, objArr);
            }
        }
    }

    @Override // defpackage.jrz
    public final void e(long j) {
        this.d = j;
    }

    @Override // defpackage.jrz
    public final void f(int i) {
        this.c = i;
    }
}
