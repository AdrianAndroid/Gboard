package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: PG */
/* renamed from: lyx  reason: default package */
/* loaded from: classes.dex */
public final class lyx extends lyl {
    private final File a;
    private final lmz b;

    public lyx(File file, lyw... lywVarArr) {
        jdg.u(file);
        this.a = file;
        this.b = lmz.q(lywVarArr);
    }

    @Override // defpackage.lyl
    /* renamed from: b */
    public final FileOutputStream a() {
        return new FileOutputStream(this.a, this.b.contains(lyw.a));
    }

    public final String toString() {
        return "Files.asByteSink(" + this.a + ", " + this.b + ")";
    }
}
