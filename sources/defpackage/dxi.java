package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: dxi  reason: default package */
/* loaded from: classes.dex */
public final class dxi implements dxg {
    public Context a;
    public dxm b;
    public hqy c;
    private final hst d = new dxh(this);

    public final void c() {
        dxm dxmVar = this.b;
        if (dxmVar != null) {
            dxmVar.m();
            this.b = null;
        }
    }

    @Override // defpackage.idp
    public final Collection d(Context context, idi idiVar) {
        return llp.r(new dxn(idiVar, 0));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.a = context;
        this.d.g(gyc.b);
        this.c = hrx.y(this.a);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.d.h();
        c();
    }
}
