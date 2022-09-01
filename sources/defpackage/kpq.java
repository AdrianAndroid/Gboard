package defpackage;

import android.net.Uri;
import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: kpq  reason: default package */
/* loaded from: classes.dex */
final class kpq {
    private static final AtomicLong a = new AtomicLong();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Uri uri) {
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = a.getAndIncrement();
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".mobstore_tmp-" + myPid + "-" + id + "-" + currentTimeMillis + "-" + andIncrement)).build();
    }
}
