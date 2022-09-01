package defpackage;

import com.google.android.libraries.inputmethod.userfeaturecache.UserFeatureCache;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: izp  reason: default package */
/* loaded from: classes.dex */
public final class izp implements mka {
    final /* synthetic */ long a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ UserFeatureCache d;

    public izp(UserFeatureCache userFeatureCache, long j, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.d = userFeatureCache;
        this.a = j;
        this.b = atomicBoolean;
        this.c = atomicBoolean2;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) UserFeatureCache.a.d()).i(th)).k("com/google/android/libraries/inputmethod/userfeaturecache/UserFeatureCache$2", "onFailure", (char) 414, "UserFeatureCache.java")).t("updateSerializedProto failed.");
        this.b.set(false);
        this.c.set(true);
        synchronized (this.c) {
            this.c.notify();
        }
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        UserFeatureCache.h(this.d.b.get(), this.a, (byte[]) obj);
        this.b.set(true);
        this.c.set(true);
        synchronized (this.c) {
            this.c.notify();
        }
    }
}
