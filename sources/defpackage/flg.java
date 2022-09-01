package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: flg  reason: default package */
/* loaded from: classes.dex */
public final class flg {
    public static final Lock a = new ReentrantLock();
    public static flg b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    public flg(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }
}
