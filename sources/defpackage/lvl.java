package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lvl  reason: default package */
/* loaded from: classes.dex */
public abstract class lvl {
    private static String a = "lvv";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "lwi";
    private static final String[] d = {"lvv", "com.google.common.flogger.backend.google.GooglePlatform", "lwi"};

    public static int a() {
        return ((lxh) lxh.a.get()).b;
    }

    public static long b() {
        return lvj.a.c();
    }

    public static lun d(String str) {
        return lvj.a.e(str);
    }

    public static lur f() {
        return i().a();
    }

    public static lvk g() {
        return lvj.a.h();
    }

    public static lwm i() {
        return lvj.a.j();
    }

    public static lwt k() {
        return i().b();
    }

    public static String l() {
        return lvj.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract lun e(String str);

    protected abstract lvk h();

    protected lwm j() {
        return lwo.a;
    }

    protected abstract String m();
}
