package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: beb  reason: default package */
/* loaded from: classes.dex */
public final class beb extends an {
    public final bcx a;
    private beb ac;
    public atw c;
    public an d;
    public final bdp b = new bea(this, 0);
    private final Set e = new HashSet();

    public beb() {
        bcx bcxVar = new bcx();
        this.a = bcxVar;
    }

    public static bi a(an anVar) {
        while (true) {
            an anVar2 = anVar.C;
            if (anVar2 != null) {
                anVar = anVar2;
            } else {
                return anVar.z;
            }
        }
    }

    private final void n() {
        beb bebVar = this.ac;
        if (bebVar != null) {
            bebVar.e.remove(this);
            this.ac = null;
        }
    }

    @Override // defpackage.an
    public final void R() {
        super.R();
        this.a.b();
        n();
    }

    @Override // defpackage.an
    public final void fX(Context context) {
        super.fX(context);
        bi a = a(this);
        if (a == null) {
            if (!Log.isLoggable("SupportRMFragment", 5)) {
                return;
            }
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            return;
        }
        try {
            m(fS(), a);
        } catch (IllegalStateException e) {
            if (!Log.isLoggable("SupportRMFragment", 5)) {
                return;
            }
            Log.w("SupportRMFragment", "Unable to register fragment with root", e);
        }
    }

    @Override // defpackage.an
    public final void fY() {
        super.fY();
        this.d = null;
        n();
    }

    @Override // defpackage.an
    public final void i() {
        super.i();
        this.a.c();
    }

    @Override // defpackage.an
    public final void j() {
        super.j();
        this.a.d();
    }

    public final void m(Context context, bi biVar) {
        n();
        beb h = atb.b(context).d.h(biVar, null);
        this.ac = h;
        if (!equals(h)) {
            this.ac.e.add(this);
        }
    }

    @Override // defpackage.an
    public final String toString() {
        String anVar = super.toString();
        an anVar2 = this.C;
        if (anVar2 == null) {
            anVar2 = this.d;
        }
        String valueOf = String.valueOf(anVar2);
        return anVar + "{parent=" + valueOf + "}";
    }
}
