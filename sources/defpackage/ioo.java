package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: ioo  reason: default package */
/* loaded from: classes.dex */
public final class ioo implements ifw {
    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        oll.e(context, "applicationContext");
        Object U = ndb.U(context, iol.class);
        oll.d(U, "get(applicationContext, …esEntryPoint::class.java)");
        iol iolVar = (iol) U;
        ieh j = ieh.j();
        kbj a = iolVar.a();
        iolVar.c();
        j.u(new iom(a));
    }

    @Override // defpackage.ifw
    public final void gn() {
        ieh.j().x(iom.class);
    }
}
