package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* renamed from: keg  reason: default package */
/* loaded from: classes.dex */
final class keg implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ keh a;
    private final Thread.UncaughtExceptionHandler b;

    public keg(keh kehVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = kehVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r23, java.lang.Throwable r24) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keg.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
