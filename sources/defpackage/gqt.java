package defpackage;

import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gqt  reason: default package */
/* loaded from: classes.dex */
public final class gqt implements gzv {
    public final gqs a;
    public boolean b;
    private final hst c;
    private final gqk d;
    private final gqh e;
    private boolean f;
    private boolean g;
    private boolean h = false;

    public gqt(gqh gqhVar, gqh gqhVar2, gqs gqsVar) {
        gqh gqhVar3;
        gqr gqrVar = new gqr(this);
        this.c = gqrVar;
        this.a = gqsVar;
        String str = gqhVar.a;
        this.d = new gqk(0, str, gqhVar, gqhVar2);
        ial b = gqhVar2.b();
        if (b != null) {
            gqe a = gqn.a(gqn.c(str), false);
            a.c(b);
            gqhVar3 = a.a();
        } else {
            gqhVar3 = null;
        }
        this.e = gqhVar3;
        gqrVar.g(gyc.a);
    }

    public final void a() {
        this.c.h();
        this.b = false;
        d();
        this.g = true;
    }

    public final void b() {
        if (!this.f) {
            return;
        }
        this.f = false;
        d();
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        d();
    }

    public final void d() {
        int i;
        if (this.g) {
            return;
        }
        if (this.f) {
            i = 1;
        } else {
            i = true != this.b ? 2 : 0;
        }
        this.d.a(i);
        gqh gqhVar = this.e;
        if (gqhVar == null) {
            return;
        }
        if (i == 1) {
            gqq.b(R.id.key_pos_header_access_points_menu, gqhVar);
            this.h = true;
        } else if (!this.h) {
        } else {
            grd.b(R.id.key_pos_header_access_points_menu, gqhVar.a);
            this.h = false;
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.b;
        printer.println("isAccessPointVisible = " + z2);
        boolean z3 = this.f;
        printer.println("isFeatureLaunched = " + z3);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
