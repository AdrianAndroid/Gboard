package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: ixc  reason: default package */
/* loaded from: classes.dex */
public final class ixc implements ijh {
    public final String a = "trainingcachev3.db";
    public final llp b;

    public ixc(llp llpVar) {
        this.b = llpVar;
    }

    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Supported protos provided to training cache storage adapter: ".concat(String.valueOf(String.valueOf(this.b))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SupportedProtosNotification";
    }
}
