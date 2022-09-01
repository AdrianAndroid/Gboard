package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* renamed from: kjh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kjh implements ThreadFactory {
    private final /* synthetic */ int c;
    public static final /* synthetic */ kjh b = new kjh(3);
    public static final /* synthetic */ kjh a = new kjh(0);

    public /* synthetic */ kjh(int i) {
        this.c = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return new xh(runnable);
            }
            if (i == 2) {
                return new Thread(runnable, "SplitCompatBackgroundThread");
            }
            if (i == 3) {
                return new Thread(runnable, "heartbeat-information-executor");
            }
            throw new AssertionError("No threads allowed.");
        }
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
