package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: iut  reason: default package */
/* loaded from: classes.dex */
public final class iut implements ifw, iwm {
    public final Context a;

    public iut(Context context) {
        this.a = context;
    }

    @Override // defpackage.iwm
    public final idm c(ixj ixjVar) {
        return new iuv(this.a, ixjVar, ieh.j(), new dpt(this, 4));
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
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
