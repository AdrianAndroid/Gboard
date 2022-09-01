package defpackage;

/* compiled from: PG */
/* renamed from: n  reason: default package */
/* loaded from: classes2.dex */
public final class n extends l {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private k aj = this.j;
    public int ai = 0;

    public n() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        this.q.clear();
        if (this.ai == 1) {
            this.aj = this.i;
        } else {
            this.aj = this.j;
        }
        this.q.add(this.aj);
    }

    @Override // defpackage.l
    public final k t(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                }
            }
            if (this.ai != 0) {
                return null;
            }
            return this.aj;
        }
        if (this.ai == 1) {
            return this.aj;
        }
        return null;
    }

    @Override // defpackage.l
    public final void x(i iVar) {
        l lVar = this.r;
        if (lVar == null) {
            return;
        }
        k t = lVar.t(2);
        k t2 = lVar.t(4);
        if (this.ai == 0) {
            t = lVar.t(3);
            t2 = lVar.t(5);
        }
        if (this.ag != -1) {
            iVar.g(i.c(iVar, iVar.e(this.aj), iVar.e(t), this.ag, false));
        } else if (this.ah != -1) {
            iVar.g(i.c(iVar, iVar.e(this.aj), iVar.e(t2), -this.ah, false));
        } else if (this.af == -1.0f) {
        } else {
            j e = iVar.e(this.aj);
            j e2 = iVar.e(t);
            j e3 = iVar.e(t2);
            float f = this.af;
            g a = iVar.a();
            a.d.f(e, -1.0f);
            a.d.f(e2, 1.0f - f);
            a.d.f(e3, f);
            iVar.g(a);
        }
    }

    @Override // defpackage.l
    public final void y() {
        if (this.r == null) {
            return;
        }
        int p = i.p(this.aj);
        if (this.ai != 1) {
            this.w = 0;
            this.x = p;
            p(this.r.h());
            j(0);
            return;
        }
        this.w = p;
        this.x = 0;
        j(this.r.d());
        p(0);
    }
}
