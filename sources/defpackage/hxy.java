package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: hxy  reason: default package */
/* loaded from: classes.dex */
public class hxy implements ijh {
    public final mvi a;

    public hxy(mvi mviVar) {
        this.a = mviVar;
    }

    public static mvi b() {
        hxy hxyVar = (hxy) ijl.b().a(hxy.class);
        if (hxyVar != null) {
            return hxyVar.a;
        }
        return null;
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
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
