package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: jns  reason: default package */
/* loaded from: classes.dex */
public abstract class jns {
    public final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public jns(String str) {
        this.a = str;
    }

    public abstract jns c(String str);

    public abstract void d(Level level, String str, Throwable th, String str2, Object... objArr);

    public final void e(String str) {
        d(Level.SEVERE, this.a, null, str, new Object[0]);
    }

    public final void f(Throwable th, String str) {
        d(Level.SEVERE, this.a, th, str, new Object[0]);
    }

    public final void g(String str, Object... objArr) {
        d(Level.INFO, this.a, null, str, objArr);
    }

    public final void h(String str) {
        d(Level.WARNING, this.a, null, str, new Object[0]);
    }

    public final void i(String str, Object... objArr) {
        d(Level.WARNING, this.a, null, str, objArr);
    }

    public final void j(Throwable th, String str) {
        d(Level.WARNING, this.a, th, str, new Object[0]);
    }

    public final void k(Throwable th, String str, Object... objArr) {
        d(Level.WARNING, this.a, th, str, objArr);
    }
}
