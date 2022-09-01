package defpackage;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;

/* compiled from: PG */
/* renamed from: jxv  reason: default package */
/* loaded from: classes.dex */
final class jxv implements jxw {
    private final jxw a;

    public jxv(jxw jxwVar) {
        this.a = jxwVar;
    }

    @Override // defpackage.jxw
    public final void a(File file, InputStream inputStream, ZipEntry zipEntry, jrr jrrVar) {
        if (zipEntry.isDirectory()) {
            return;
        }
        jxx.h(inputStream, new File(file, jxx.f(zipEntry)), this.a, jrrVar, lfl.ALWAYS_TRUE);
    }
}
