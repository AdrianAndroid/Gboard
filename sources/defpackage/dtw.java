package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dtw  reason: default package */
/* loaded from: classes.dex */
public final class dtw implements mka {
    private final String a;

    public dtw(String str) {
        this.a = str;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) dtx.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/logging/LoggingUtil$LogFailuresCallback", "onFailure", 44, "LoggingUtil.java")).w("%s failed", this.a);
    }

    @Override // defpackage.mka
    public final void b(Object obj) {
    }
}
