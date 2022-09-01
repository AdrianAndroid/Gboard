package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: jvt  reason: default package */
/* loaded from: classes.dex */
public final class jvt {
    final File a;
    final Object b = new Object();
    int c = 0;

    public jvt(File file) {
        this.a = file;
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            str = this.a.getName() + "[" + this.c + "]";
        }
        return str;
    }
}
