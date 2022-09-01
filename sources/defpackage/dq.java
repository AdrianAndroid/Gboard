package defpackage;

import android.view.Window;

/* compiled from: PG */
/* renamed from: dq  reason: default package */
/* loaded from: classes.dex */
public final class dq implements gy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dq(dr drVar, int i) {
        this.b = i;
        this.a = drVar;
    }

    public dq(hs hsVar, int i) {
        this.b = i;
        this.a = hsVar;
    }

    @Override // defpackage.gy
    public final boolean b(gm gmVar) {
        Window.Callback B;
        int i = this.b;
        if (i == 0) {
            if (gmVar == gmVar.a()) {
                dr drVar = (dr) this.a;
                if (drVar.z && (B = drVar.B()) != null && !((dr) this.a).G) {
                    B.onMenuOpened(108, gmVar);
                }
            }
            return true;
        } else if (i == 1) {
            Window.Callback B2 = ((dr) this.a).B();
            if (B2 != null) {
                B2.onMenuOpened(108, gmVar);
            }
            return true;
        } else {
            Object obj = this.a;
            if (gmVar == ((hs) obj).c) {
                return false;
            }
            go goVar = ((hg) gmVar).k;
            gy gyVar = ((gc) obj).e;
            if (gyVar == null) {
                return false;
            }
            return gyVar.b(gmVar);
        }
    }

    @Override // defpackage.gy
    public final void a(gm gmVar, boolean z) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((dr) this.a).F(gmVar);
                return;
            }
            if (gmVar instanceof hg) {
                gmVar.a().i(false);
            }
            gy gyVar = ((gc) this.a).e;
            if (gyVar == null) {
                return;
            }
            gyVar.a(gmVar, z);
            return;
        }
        gm a = gmVar.a();
        dp A = ((dr) this.a).A(a != gmVar ? a : gmVar);
        if (A == null) {
            return;
        }
        if (a != gmVar) {
            ((dr) this.a).E(A.a, A, a);
            ((dr) this.a).G(A, true);
            return;
        }
        ((dr) this.a).G(A, z);
    }
}
