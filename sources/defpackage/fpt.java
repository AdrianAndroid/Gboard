package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fpt  reason: default package */
/* loaded from: classes.dex */
public final class fpt {
    public final Executor a;
    public volatile Object b;
    public volatile fps c;

    public fpt(Looper looper, Object obj, String str) {
        this.a = new ajn(looper, 2);
        fyb.aH(obj, "Listener must not be null");
        this.b = obj;
        fyb.aF(str);
        this.c = new fps(obj, str);
    }
}
