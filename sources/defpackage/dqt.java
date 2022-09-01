package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dqt  reason: default package */
/* loaded from: classes.dex */
public final class dqt implements dqr {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/mozc/extension/JapaneseMozcExtension");
    public Executor b;
    public dri c;
    private final hsw d = new dqs(this);

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        dri driVar = this.c;
        if (driVar == null) {
            printer.println("Not activated.");
        } else {
            driVar.dump(printer, z);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "JapaneseMozcExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        gxp a2 = gxp.a();
        mks c = a2.c(a2.a);
        this.b = c;
        this.d.e(c);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.d.f();
    }
}
