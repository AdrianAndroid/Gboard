package defpackage;

import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kaq  reason: default package */
/* loaded from: classes.dex */
public final class kaq {
    public final String a;
    public final File b;
    public final String c;
    public final kan d;
    public final kaz e;
    final boolean g;
    final boolean h;
    private final kaw m;
    private kap o;
    public final lom f = ljm.F();
    int i = 0;
    private boolean n = false;
    public kao j = null;
    public int k = -1;
    public final int l = -1;

    public kaq(kaw kawVar, String str, File file, String str2, kan kanVar, kaz kazVar) {
        this.o = kap.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.d = kanVar;
        this.m = kawVar;
        this.e = kazVar;
        boolean a = kal.a(str);
        this.g = a;
        boolean g = g(str);
        this.h = g;
        if (g || a) {
            this.o = kap.NONE;
        }
    }

    public static boolean g(String str) {
        return str.startsWith("file:");
    }

    public final synchronized kap a() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.n = true;
    }

    public final boolean e() {
        return this.m.m(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kaq)) {
            return false;
        }
        kaq kaqVar = (kaq) obj;
        return jdg.W(this.a, kaqVar.a) && jdg.W(this.b, kaqVar.b) && jdg.W(this.c, kaqVar.c) && jdg.W(this.o, kaqVar.o) && this.n == kaqVar.n;
    }

    public final synchronized boolean f() {
        return this.n;
    }

    public final void h(kap kapVar) {
        if (this.h || this.g) {
            return;
        }
        this.o = kapVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        lfa R = jdg.R(kaq.class);
        R.b("", this.a);
        R.b("targetDirectory", this.b);
        R.b("fileName", this.c);
        R.b("requiredConnectivity", this.o);
        R.h("canceled", this.n);
        return R.toString();
    }
}
