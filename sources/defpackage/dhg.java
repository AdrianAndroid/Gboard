package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dhg  reason: default package */
/* loaded from: classes.dex */
final class dhg extends byr {
    final /* synthetic */ dhj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhg(dhj dhjVar, String str) {
        super(str);
        this.a = dhjVar;
    }

    @Override // defpackage.byr
    protected final void c(boolean z, Throwable th) {
        ((ltd) ((ltd) ((ltd) dhj.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingOnlineSuperpacks$3", "onSyncFailure", 291, "HandwritingOnlineSuperpacks.java")).w("syncInternal(%b)", Boolean.valueOf(z));
        dhj dhjVar = this.a;
        synchronized (dhjVar.b) {
            Iterator it = dhjVar.g.iterator();
            while (it.hasNext()) {
                ((dhi) it.next()).b();
                it.remove();
            }
        }
    }

    @Override // defpackage.byr
    protected final void d(jre jreVar) {
        ((ltd) ((ltd) dhj.a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingOnlineSuperpacks$3", "onSyncSuccess", 285, "HandwritingOnlineSuperpacks.java")).w("syncInternal(): complete %s", jreVar);
        dhj dhjVar = this.a;
        synchronized (dhjVar.b) {
            Iterator it = dhjVar.g.iterator();
            while (it.hasNext()) {
                ((dhi) it.next()).a(jreVar);
                it.remove();
            }
        }
    }
}
