package defpackage;

import android.util.LruCache;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gwo  reason: default package */
/* loaded from: classes.dex */
public final class gwo {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/cache/MemoryFileCache");
    public final idk b;
    public final lmz c;
    public final gwk d;
    public final LruCache e;
    public final ids f;
    private final hzr g;

    public gwo(idk idkVar, Set set, gwk gwkVar, LruCache lruCache, ids idsVar) {
        gwm gwmVar = new gwm(this);
        this.g = gwmVar;
        this.b = idkVar;
        this.c = lmz.p(set);
        this.d = gwkVar;
        this.e = lruCache;
        this.f = idsVar;
        gwmVar.d(mjl.a);
    }

    public final synchronized void a(String str, Object obj) {
        if (this.e.get(str) == null) {
            this.e.put(str, obj);
        }
    }

    public final void b() {
        this.e.evictAll();
    }
}
