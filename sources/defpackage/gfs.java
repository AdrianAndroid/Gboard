package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* renamed from: gfs  reason: default package */
/* loaded from: classes.dex */
public abstract class gfs {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    /* JADX INFO: Access modifiers changed from: protected */
    public gfs(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static gfs c(String str) {
        return new gfq(str, false);
    }

    public abstract Object a();
}
