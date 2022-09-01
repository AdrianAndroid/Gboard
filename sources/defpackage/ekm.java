package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ekm  reason: default package */
/* loaded from: classes.dex */
public final class ekm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/utils/FireOnceOnStartInputViewListener");
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public static final Set c = new HashSet();
    public final EditorInfo d;
    public final Runnable e;
    public long f;
    public final hst g = new ekl(this);

    public ekm(EditorInfo editorInfo, Runnable runnable) {
        this.d = editorInfo;
        this.e = runnable;
    }

    public static Runnable a(String str, Map map) {
        return new elr(str, map, 1);
    }

    public final void b() {
        this.f = 0L;
        if (c.remove(this)) {
            this.g.h();
        }
    }
}
