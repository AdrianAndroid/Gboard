package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ozt  reason: default package */
/* loaded from: classes2.dex */
public final class ozt implements ozj, ozu {
    public final pbk a;
    public long b;
    public paw c;
    final ozs d;
    Object e;
    int f;

    protected ozt() {
        this.b = Long.MIN_VALUE;
        this.a = new pbk();
    }

    public ozt(ozs ozsVar) {
        this();
        this.d = ozsVar;
    }

    @Override // defpackage.ozj
    public final void a(Throwable th) {
        if (this.f == 2) {
            pbp.b(th);
            return;
        }
        this.e = null;
        this.d.il(th);
    }

    public final void b() {
        int i = this.f;
        if (i == 0) {
            this.d.il(new NoSuchElementException());
        } else if (i != 1) {
        } else {
            this.f = 2;
            Object obj = this.e;
            this.e = null;
            this.d.b(obj);
        }
    }

    public final void c(Object obj) {
        int i = this.f;
        if (i == 0) {
            this.f = 1;
            this.e = obj;
        } else if (i != 1) {
        } else {
            this.f = 2;
            this.d.il(new IndexOutOfBoundsException("The upstream produced more than one value"));
        }
    }

    @Override // defpackage.ozu
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.a.b;
    }
}
