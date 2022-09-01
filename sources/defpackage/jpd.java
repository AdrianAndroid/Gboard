package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jpd  reason: default package */
/* loaded from: classes.dex */
public final class jpd extends jqm {
    public final String a;
    public final int b;
    public final llw c;
    private final llw d;
    private volatile transient jtr e;
    private volatile transient jsq f;
    private volatile transient String g;

    public jpd(String str, int i, llw llwVar, llw llwVar2) {
        this.a = str;
        this.b = i;
        if (llwVar != null) {
            this.d = llwVar;
            if (llwVar2 != null) {
                this.c = llwVar2;
                return;
            }
            throw new NullPointerException("Null packs");
        }
        throw new NullPointerException("Null extraMap");
    }

    @Override // defpackage.jqm
    public final int a() {
        return this.b;
    }

    @Override // defpackage.jqm
    public final llw b() {
        return this.c;
    }

    @Override // defpackage.jqm
    public final String c() {
        return this.a;
    }

    @Override // defpackage.jqm
    public final jsq d() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    jyu g = jsq.g();
                    g.d(this.d);
                    this.f = g.b();
                    if (this.f == null) {
                        throw new NullPointerException("extras() cannot return null");
                    }
                }
            }
        }
        return this.f;
    }

    @Override // defpackage.jqm
    public final jtr e() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = jtr.c(this.a, this.b);
                    if (this.e == null) {
                        throw new NullPointerException("versionedName() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.jqm
    public final String toString() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = e().toString();
                    if (this.g == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.g;
    }
}
