package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: fxe  reason: default package */
/* loaded from: classes.dex */
final class fxe {
    public static final Executor a;

    static {
        nzv nzvVar = new nzv((byte[]) null);
        nzvVar.c("brella-pds-%d");
        a = Executors.newSingleThreadExecutor(nzv.d(nzvVar));
    }
}
