package defpackage;

/* compiled from: PG */
/* renamed from: fd  reason: default package */
/* loaded from: classes.dex */
public final class fd implements fk {
    final fk a;
    public int b = 0;
    public int c = -1;
    public int d = -1;
    Object e = null;

    public fd(fk fkVar) {
        this.a = fkVar;
    }

    public final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            fk fkVar = this.a;
            ((fc) fkVar).a.hk(this.c, this.d);
        } else if (i != 2) {
            fk fkVar2 = this.a;
            ((fc) fkVar2).a.a.d(this.c, this.d, this.e);
        } else {
            fk fkVar3 = this.a;
            ((fc) fkVar3).a.hl(this.c, this.d);
        }
        this.e = null;
        this.b = 0;
    }

    public final void b(int i, int i2) {
        a();
        ((fc) this.a).a.hj(i, i2);
    }

    public final void c(int i, Object obj) {
        int i2;
        int i3;
        int i4;
        if (this.b != 3 || i > (i3 = this.d + (i2 = this.c)) || (i4 = i + 1) < i2 || this.e != obj) {
            a();
            this.c = i;
            this.d = 1;
            this.e = obj;
            this.b = 3;
            return;
        }
        this.c = Math.min(i, i2);
        this.d = Math.max(i3, i4) - this.c;
    }
}
