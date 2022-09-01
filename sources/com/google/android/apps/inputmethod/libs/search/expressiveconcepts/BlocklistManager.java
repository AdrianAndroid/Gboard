package com.google.android.apps.inputmethod.libs.search.expressiveconcepts;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BlocklistManager implements AutoCloseable {
    public static final hhl a = hhq.h("emotion_model_blacklist", "");
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/BlocklistManager");
    public static final lfy c = lfy.c(',').b().h();
    public String f = "";
    public final AtomicReference e = new AtomicReference(null);
    public final hhk d = new bvl(this, 14);

    public static native boolean nativeContainsBlocklistTerm(String str);

    public static native boolean nativeLoadExpressiveConceptModelBlocklistIfNeeded(String str);

    private static native boolean nativeUnloadExpressiveConceptModelBlocklist();

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/BlocklistManager", "unloadFileBasedBlocklist", 73, "BlocklistManager.java")).w("Blocklist is unloaded, unload result is %s", String.valueOf(nativeUnloadExpressiveConceptModelBlocklist()));
        a.g(this.d);
    }
}
