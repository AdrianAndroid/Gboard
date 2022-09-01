package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: jgt  reason: default package */
/* loaded from: classes.dex */
public final class jgt {
    public final CopyOnWriteArrayList a;
    public long d;
    public boolean e;
    private boolean f;
    private final jez h = new jgr(this);
    private final jgm g = new jgs(this);
    public final qv b = new qv(1);
    public int c = 1;

    public jgt(jgq... jgqVarArr) {
        this.a = new CopyOnWriteArrayList(jgqVarArr);
        for (int i = 0; i <= 0; i++) {
            jgqVarArr[i].f(this.h);
            this.b.put(jgqVarArr[i], true);
        }
    }

    public final void a() {
        if (this.e || !this.f || this.c == 0) {
            return;
        }
        this.e = true;
        jgo.c().a(this.g);
    }

    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.d = -1L;
        a();
    }

    public final void c() {
        if (this.f) {
            if (this.e) {
                this.e = false;
                jgo.c().b(this.g);
            }
            this.f = false;
        }
    }
}
