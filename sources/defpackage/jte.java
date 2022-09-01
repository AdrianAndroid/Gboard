package defpackage;

import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: jte  reason: default package */
/* loaded from: classes.dex */
public final class jte {
    public static final mkr a;

    static {
        nzv nzvVar = new nzv((byte[]) null);
        nzvVar.c("superpacks-task-%d");
        a = kcu.B(Executors.newSingleThreadExecutor(nzv.d(nzvVar)));
    }
}
