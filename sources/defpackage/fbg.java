package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: fbg  reason: default package */
/* loaded from: classes.dex */
public final class fbg {
    public static volatile ExecutorService b;
    private static volatile ExecutorService d;
    public static final Object a = new Object();
    private static final Object c = new Object();

    public static ExecutorService a() {
        ExecutorService executorService = d;
        if (executorService == null) {
            synchronized (c) {
                executorService = d;
                if (executorService == null) {
                    executorService = gxp.a().f("voice-recog", 11);
                    d = executorService;
                }
            }
        }
        return executorService;
    }
}
