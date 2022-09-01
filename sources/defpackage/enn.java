package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* renamed from: enn  reason: default package */
/* loaded from: classes.dex */
public final class enn {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/grammar/GrammarCheckerManager");
    public final idk b;
    public final Executor c;
    public eoh d;
    public volatile eno e;
    public final Semaphore f = new Semaphore(1, true);
    public hzr g;

    public enn(idk idkVar) {
        mks mksVar = gxp.a().b;
        this.b = idkVar;
        this.c = mksVar;
    }

    public final void a() {
        if (this.e != null) {
            this.e.close();
            this.e = null;
        }
    }
}
