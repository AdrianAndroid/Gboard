package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: iew  reason: default package */
/* loaded from: classes.dex */
public abstract class iew implements ier {
    private final ino a;
    private boolean b;
    public final List d = new ArrayList();

    public iew(ino inoVar) {
        this.a = inoVar;
    }

    protected abstract void a();

    protected abstract void b();

    public final void c() {
        boolean z;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((ies) it.next()).b()) {
                z = false;
                break;
            }
        }
        if (jbt.G(this.b, z)) {
            a();
            this.b = true;
        } else if (!jbt.F(this.b, z)) {
        } else {
            b();
            this.b = false;
        }
    }

    public final void d() {
        this.d.add(new iev(this, this.a));
    }

    @Override // defpackage.ier
    public final void e() {
        for (ies iesVar : this.d) {
            iesVar.a();
        }
        c();
    }
}
