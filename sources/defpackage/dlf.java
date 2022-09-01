package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dlf  reason: default package */
/* loaded from: classes.dex */
public final class dlf {
    public final llp a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private final dlg d;
    private final dkx e;
    private boolean f;

    public dlf(llp llpVar, dlg dlgVar, deb debVar, int i, int i2, int i3) {
        this.a = llpVar;
        this.d = dlgVar;
        this.e = new dkx(debVar, llpVar, i3, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Integer) this.b.get(i - 1)).intValue() + 1;
    }

    public final void b(int i) {
        if (!this.f) {
            for (int i2 = 0; i2 < i && d(); i2++) {
            }
            if (a(this.b.size()) >= this.a.size()) {
                return;
            }
            gyc.b.execute(new dgd(this, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (!this.e.hasNext()) {
            return false;
        }
        int size = this.b.size();
        int a = a(this.b.size());
        mhe next = this.e.next();
        this.c.add(next);
        this.b.add(Integer.valueOf((a + next.b) - 1));
        this.d.hi(size);
        return true;
    }
}
