package defpackage;

import android.os.Process;

/* compiled from: PG */
/* renamed from: gzy  reason: default package */
/* loaded from: classes.dex */
public final class gzy {
    public static final hhl a = hhq.a("enable_log_for_dump", false);
    private final String b;

    public gzy(String str) {
        this.b = str;
    }

    public final void a(String str) {
        if (((Boolean) a.c()).booleanValue()) {
            ieh.j().e(gzz.LOG_FOR_DUMP, Integer.valueOf(Process.myTid()), this.b, str);
        }
    }

    public final void b(String str, Object obj) {
        if (((Boolean) a.c()).booleanValue()) {
            ieh.j().e(gzz.LOG_FOR_DUMP_ARG1, Integer.valueOf(Process.myTid()), this.b, str, obj);
        }
    }

    public final void c(String str, Object obj, Object obj2) {
        if (((Boolean) a.c()).booleanValue()) {
            ieh.j().e(gzz.LOG_FOR_DUMP_ARG2, Integer.valueOf(Process.myTid()), this.b, str, obj, obj2);
        }
    }

    public final void d(String str, Object obj, Object obj2, Object... objArr) {
        if (((Boolean) a.c()).booleanValue()) {
            ieh.j().e(gzz.LOG_FOR_DUMP_ARGS, Integer.valueOf(Process.myTid()), this.b, str, obj, obj2, objArr);
        }
    }

    public final void e(String str) {
        if (((Boolean) a.c()).booleanValue()) {
            ieh.j().e(gzz.LOG_FOR_DUMP_ABANDON_DUPLICATE_LOGS, Integer.valueOf(Process.myTid()), this.b, str);
        }
    }
}
