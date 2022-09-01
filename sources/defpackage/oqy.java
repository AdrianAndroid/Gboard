package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: oqy  reason: default package */
/* loaded from: classes2.dex */
public final class oqy {
    final oqz a;
    final boolean[] b;
    final /* synthetic */ orb c;
    private boolean d;

    public oqy(orb orbVar, oqz oqzVar) {
        this.c = orbVar;
        this.a = oqzVar;
        this.b = oqzVar.e ? null : new boolean[orbVar.d];
    }

    public final ovn a(int i) {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException();
            }
            oqz oqzVar = this.a;
            if (oqzVar.f == this) {
                if (!oqzVar.e) {
                    this.b[i] = true;
                }
                try {
                    return new oqx(this, this.c.b.a(oqzVar.d[i]));
                } catch (FileNotFoundException unused) {
                    return oix.f();
                }
            }
            return oix.f();
        }
    }

    public final void b() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException();
            }
            if (this.a.f == this) {
                this.c.c(this, false);
            }
            this.d = true;
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException();
            }
            if (this.a.f == this) {
                this.c.c(this, true);
            }
            this.d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.a.f == this) {
            int i = 0;
            while (true) {
                orb orbVar = this.c;
                if (i < orbVar.d) {
                    try {
                        orbVar.b.b(this.a.d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                } else {
                    this.a.f = null;
                    return;
                }
            }
        }
    }
}
