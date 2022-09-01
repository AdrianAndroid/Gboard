package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: gqp  reason: default package */
/* loaded from: classes.dex */
public final class gqp implements ijh {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    private gqp(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static void b(boolean z) {
        c(false, z);
    }

    public static void c(boolean z, boolean z2) {
        ijl b = ijl.b();
        gqp gqpVar = (gqp) ijl.b().a(gqp.class);
        boolean z3 = false;
        if (gqpVar != null && gqpVar.b) {
            z3 = true;
        }
        b.g(new gqp(z, z3, z2));
    }

    public static void d(boolean z) {
        ijl b = ijl.b();
        gqp gqpVar = (gqp) ijl.b().a(gqp.class);
        boolean z2 = false;
        if (gqpVar != null && gqpVar.a) {
            z2 = true;
        }
        b.g(new gqp(z2, z, true));
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
        jco.f(this, printer);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
