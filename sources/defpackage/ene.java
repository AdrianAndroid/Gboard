package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: ene  reason: default package */
/* loaded from: classes.dex */
public class ene implements ijh {
    private final end a;

    public ene(end endVar) {
        this.a = endVar;
    }

    public static end b() {
        ene eneVar;
        if (irs.d() && (eneVar = (ene) ijl.b().a(ene.class)) != null) {
            return eneVar.a;
        }
        return null;
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
