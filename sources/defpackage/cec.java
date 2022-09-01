package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: cec  reason: default package */
/* loaded from: classes.dex */
public class cec implements ijh {
    private final llw a;

    private cec(llw llwVar) {
        this.a = llwVar;
    }

    public static llw b() {
        cec cecVar = (cec) ijl.b().a(cec.class);
        return cecVar == null ? lrq.b : cecVar.a;
    }

    public static void c(llw llwVar) {
        if (lre.z(b(), llwVar)) {
            return;
        }
        ijl.b().g(new cec(llwVar));
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
