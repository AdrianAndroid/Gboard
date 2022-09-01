package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dy  reason: default package */
/* loaded from: classes.dex */
final class dy implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
