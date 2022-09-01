package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: igk  reason: default package */
/* loaded from: classes.dex */
public final class igk {
    public final igg a;
    public final ifx b;
    private mkp c;

    public igk(igg iggVar, ifx ifxVar) {
        this.a = iggVar;
        this.b = ifxVar;
    }

    private final mkp e(Context context) {
        mkp a = mkp.a(new gnq(this, context, 9));
        kcu.U(a, new hyw(this, 6), mjl.a);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ifw a() {
        mkp mkpVar = this.c;
        if (mkpVar != null && mkpVar.isDone()) {
            try {
                return (ifw) kcu.S(this.c);
            } catch (ExecutionException e) {
                ((ltd) ((ltd) ((ltd) igr.a.c()).i(e)).k("com/google/android/libraries/inputmethod/module/ModuleManager$ModuleInfo", "getModuleObject", (char) 589, "ModuleManager.java")).t("Failed to get module from moduleFuture");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ifw b(Context context) {
        mkp mkpVar;
        synchronized (this) {
            mkpVar = this.c;
            if (mkpVar == null) {
                mkpVar = e(context);
                this.c = mkpVar;
            }
        }
        try {
            mkpVar.run();
            return (ifw) mkpVar.get(50L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((ltd) ((ltd) ((ltd) igr.a.c()).i(e)).k("com/google/android/libraries/inputmethod/module/ModuleManager$ModuleInfo", "loadModule", (char) 616, "ModuleManager.java")).t("Task interrupted");
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            ((ltd) ((ltd) ((ltd) igr.a.c()).i(e)).k("com/google/android/libraries/inputmethod/module/ModuleManager$ModuleInfo", "loadModule", (char) 613, "ModuleManager.java")).t("Failed to get module from moduleFuture");
            return null;
        } catch (TimeoutException e3) {
            e = e3;
            ((ltd) ((ltd) ((ltd) igr.a.c()).i(e)).k("com/google/android/libraries/inputmethod/module/ModuleManager$ModuleInfo", "loadModule", (char) 613, "ModuleManager.java")).t("Failed to get module from moduleFuture");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        mkp mkpVar;
        synchronized (this) {
            mkpVar = this.c;
            this.c = null;
        }
        if (mkpVar != null) {
            kcu.U(mkpVar, new igj(this, z, 0), mjl.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Context context, mkr mkrVar) {
        mkp mkpVar;
        synchronized (this) {
            if (this.c == null) {
                mkpVar = e(context);
                this.c = mkpVar;
            } else {
                mkpVar = null;
            }
        }
        if (mkpVar != null) {
            mkrVar.hP(mkpVar);
        }
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("moduleDef", this.a);
        S.b("module", a());
        return S.toString();
    }
}
