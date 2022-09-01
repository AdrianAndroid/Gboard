package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: lds  reason: default package */
/* loaded from: classes.dex */
final class lds extends lgh {
    @Override // defpackage.lgh
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
