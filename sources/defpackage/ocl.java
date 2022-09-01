package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ocl  reason: default package */
/* loaded from: classes2.dex */
public final class ocl extends oai {
    private static final ReferenceQueue b = new ReferenceQueue();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    public static final Logger a = Logger.getLogger(ocl.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocl(nuf nufVar) {
        super(nufVar);
        ReferenceQueue referenceQueue = b;
        ConcurrentMap concurrentMap = c;
        new ock(this, nufVar, referenceQueue, concurrentMap);
    }
}
