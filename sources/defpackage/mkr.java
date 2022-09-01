package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mkr  reason: default package */
/* loaded from: classes.dex */
public interface mkr extends ExecutorService {
    mko hP(Runnable runnable);

    mko hQ(Callable callable);

    mko hR(Runnable runnable, Object obj);

    @Override // defpackage.mkr
    List invokeAll(Collection collection);

    @Override // defpackage.mkr
    List invokeAll(Collection collection, long j, TimeUnit timeUnit);
}
