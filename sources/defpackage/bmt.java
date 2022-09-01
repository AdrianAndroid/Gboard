package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* renamed from: bmt  reason: default package */
/* loaded from: classes.dex */
public final class bmt {
    private static final ltg a = ltg.j("com/google/android/apps/gsa/shared/logger/EventLogger");
    private volatile bmu b;
    private bvq c;

    public bmt() {
        lks.a(200);
        new HashSet();
    }

    public static void a(int i) {
        bmt bmtVar = bms.a;
        bvq bvqVar = bmtVar.c;
        nfh t = mfe.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mfe mfeVar = (mfe) t.b;
        mfeVar.a |= 2;
        mfeVar.b = i;
        mfe mfeVar2 = (mfe) t.cz();
        bmu bmuVar = bmtVar.b;
        ((ltd) ((ltd) ((ltd) a.d()).l(lub.SMALL)).k("com/google/android/apps/gsa/shared/logger/EventLogger", "recordClientEventInternal", 393, "EventLogger.java")).t("No EventLoggerStore set on EventLogger, event will be ignored.Initialize EventLogger in your Application#onCreate method");
    }
}
