package defpackage;

import java.io.File;

/* compiled from: PG */
/* renamed from: eyc  reason: default package */
/* loaded from: classes.dex */
public final class eyc {
    public final jav a;
    public final File b;
    private final String c;

    public eyc(String str, jav javVar, File file) {
        this.c = str;
        this.a = javVar;
        this.b = file;
    }

    public final String toString() {
        return String.format("SanityCheckEvalName = %s : SanityCheckEvalLocale = %s", this.c, this.a);
    }
}
