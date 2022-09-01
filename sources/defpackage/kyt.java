package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: kyt  reason: default package */
/* loaded from: classes.dex */
public final class kyt implements alj {
    public int a;
    public int b;
    private final WeakReference c;

    public kyt(kyv kyvVar) {
        this.c = new WeakReference(kyvVar);
    }

    @Override // defpackage.alj
    public final void a(int i) {
        this.a = this.b;
        this.b = i;
    }

    @Override // defpackage.alj
    public final void b(int i, float f, int i2) {
        kyv kyvVar = (kyv) this.c.get();
        if (kyvVar != null) {
            int i3 = this.b;
            boolean z = false;
            boolean z2 = i3 != 2 || this.a == 1;
            if (i3 != 2 || this.a != 0) {
                z = true;
            }
            kyvVar.j(i, f, z2, z);
        }
    }

    @Override // defpackage.alj
    public final void c(int i) {
        kyv kyvVar = (kyv) this.c.get();
        if (kyvVar == null || kyvVar.a() == i || i >= kyvVar.b()) {
            return;
        }
        int i2 = this.b;
        boolean z = true;
        if (i2 != 0 && (i2 != 2 || this.a != 0)) {
            z = false;
        }
        kyvVar.h(kyvVar.c(i), z);
    }
}
