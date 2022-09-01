package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: glr  reason: default package */
/* loaded from: classes.dex */
public final class glr extends bly {
    protected final Object a = new Object();
    public final Deque b = new ArrayDeque();
    public boolean c = false;
    private final blw d;

    public glr(blw blwVar) {
        jdg.v(true);
        this.d = blwVar;
        g(1);
    }

    private final void g(int i) {
        synchronized (this.a) {
            while (this.b.size() < i) {
                this.b.add(this.d.b());
            }
        }
    }

    @Override // defpackage.blw
    public final int a() {
        int a;
        synchronized (this.a) {
            a = this.d.a();
        }
        return a;
    }

    @Override // defpackage.blw
    public final mko b() {
        synchronized (this.a) {
            if (this.c) {
                return kcu.K(new blj(new blb(262182)));
            }
            g(2);
            return (mko) this.b.remove();
        }
    }

    @Override // defpackage.blw
    public final void c() {
        synchronized (this.a) {
            if (!this.c) {
                this.d.c();
                while (!this.b.isEmpty()) {
                    kcu.U((mko) this.b.remove(), new cbx(14), mjl.a);
                }
                this.c = true;
            }
        }
    }

    @Override // defpackage.bly, defpackage.blw
    public final boolean e() {
        boolean e;
        synchronized (this.a) {
            e = this.d.e();
        }
        return e;
    }

    @Override // defpackage.bly, defpackage.blw
    /* renamed from: f */
    public final glr d() {
        glr glrVar;
        synchronized (this.a) {
            glrVar = new glr(this.d.d());
        }
        return glrVar;
    }
}
