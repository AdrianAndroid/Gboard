package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: oal  reason: default package */
/* loaded from: classes2.dex */
final class oal implements ofd {
    @Override // defpackage.ofd
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(oao.i("grpc-default-executor-%d"));
    }

    @Override // defpackage.ofd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
