package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ckn  reason: default package */
/* loaded from: classes.dex */
public final class ckn implements ckm {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheImpl");
    private final Context b;

    public ckn(Context context) {
        this.b = context;
    }

    private final ckq a() {
        return (ckq) igr.d(this.b).a(ckq.class);
    }

    @Override // defpackage.ckm
    public final llp c(String str) {
        ckq a2 = a();
        if (a2 == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheImpl", "getAvailableContentForKeyword", 36, "ContentCacheImpl.java")).t("Content cache module is unavailable");
            return llp.q();
        }
        llp a3 = a2.e().a(str);
        a3.size();
        a2.f.hP(new bue(a2, str, a3, 6));
        if (a3.isEmpty()) {
            a2.i.incrementAndGet();
            a2.d.e(csv.CONTENT_CACHE_CONTENT_NOT_FOUND_FOR_KEYWORD, new Object[0]);
        } else {
            a2.h.incrementAndGet();
            a2.d.e(csv.CONTENT_CACHE_CONTENT_FOUND_FOR_KEYWORD, new Object[0]);
        }
        return a3;
    }

    @Override // defpackage.ckm
    public final boolean d() {
        ckq a2 = a();
        if (a2 == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheImpl", "isEmpty", 26, "ContentCacheImpl.java")).t("Content cache module is unavailable");
            return true;
        }
        return a2.d();
    }
}
