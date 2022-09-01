package defpackage;

import android.content.Context;
import android.util.Printer;
import j$.util.function.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cie  reason: default package */
/* loaded from: classes.dex */
class cie implements cjh {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/BasicExpressionCandidateSupplierModuleImpl");
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final Context d;
    private final hso e;
    private final idk f;
    private final Supplier g;
    private final leq h;

    public cie(Context context, hso hsoVar, idk idkVar, Supplier supplier, leq leqVar) {
        this.d = context;
        this.e = hsoVar;
        this.f = idkVar;
        this.g = supplier;
        this.h = leqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x031f, code lost:
        if (r12 != 4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0348, code lost:
        defpackage.ijl.b().g(new defpackage.cis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0346, code lost:
        if (r12 == 4) goto L31;
     */
    @Override // defpackage.cjg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cjd c(defpackage.mty r11, boolean r12, boolean r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cie.c(mty, boolean, boolean, java.util.List):cjd");
    }

    @Override // defpackage.gzv
    public void dump(Printer printer, boolean z) {
        boolean z2 = this.c.get();
        printer.println("initialized=" + z2);
    }

    @Override // defpackage.gzv
    public String getDumpableTag() {
        return "BasicExpressionCandidateSupplierModuleImpl";
    }

    @Override // defpackage.ifw
    public void gm(Context context, igg iggVar) {
        this.c.set(true);
    }

    @Override // defpackage.ifw
    public void gn() {
        this.c.set(false);
        this.e.close();
        llp llpVar = (llp) this.g.get();
        int size = llpVar.size();
        for (int i = 0; i < size; i++) {
            ((cjb) llpVar.get(i)).close();
        }
    }
}
