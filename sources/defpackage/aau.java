package defpackage;

/* compiled from: PG */
/* renamed from: aau  reason: default package */
/* loaded from: classes.dex */
public class aau {
    private final abc a;
    vq[] b;

    public aau() {
        this(new abc());
    }

    public aau(abc abcVar) {
        this.a = abcVar;
    }

    public abc a() {
        h();
        return this.a;
    }

    public void b(vq vqVar) {
    }

    public void c(vq vqVar) {
    }

    public void d(vq vqVar) {
    }

    public void e(vq vqVar) {
    }

    public void f(vq vqVar) {
    }

    public void g(int i, vq vqVar) {
        if (this.b == null) {
            this.b = new vq[9];
        }
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i2 & 7) != 0) {
                this.b[tx.b(i2)] = vqVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        vq[] vqVarArr = this.b;
        if (vqVarArr != null) {
            vq vqVar = vqVarArr[tx.b(1)];
            vq vqVar2 = this.b[tx.b(2)];
            if (vqVar2 == null) {
                vqVar2 = this.a.f(2);
            }
            if (vqVar == null) {
                vqVar = this.a.f(1);
            }
            c(vq.b(vqVar, vqVar2));
            vq vqVar3 = this.b[tx.b(16)];
            if (vqVar3 != null) {
                e(vqVar3);
            }
            vq vqVar4 = this.b[tx.b(32)];
            if (vqVar4 != null) {
                d(vqVar4);
            }
            vq vqVar5 = this.b[tx.b(64)];
            if (vqVar5 == null) {
                return;
            }
            f(vqVar5);
        }
    }
}
