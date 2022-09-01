package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: dsz  reason: default package */
/* loaded from: classes.dex */
public class dsz implements ijh {
    public final dsx a;

    public dsz(dsx dsxVar) {
        this.a = dsxVar;
    }

    public static dsx b() {
        dsz dszVar = (dsz) ijl.b().a(dsz.class);
        return dszVar != null ? dszVar.a : dsx.a;
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println(this.a.toString());
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
