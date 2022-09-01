package defpackage;

import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* renamed from: lyy  reason: default package */
/* loaded from: classes.dex */
public final class lyy extends lym {
    private final File a;

    public lyy(File file) {
        jdg.u(file);
        this.a = file;
    }

    @Override // defpackage.lym
    public final lfb b() {
        return this.a.isFile() ? lfb.g(Long.valueOf(this.a.length())) : ldu.a;
    }

    @Override // defpackage.lym
    public final byte[] d() {
        lyu a = lyu.a();
        try {
            FileInputStream a2 = a();
            a.d(a2);
            return lyp.f(a2, FileInputStreamWrapper.getChannel(a2).size());
        } finally {
        }
    }

    @Override // defpackage.lym
    /* renamed from: f */
    public final FileInputStream a() {
        return new FileInputStream(this.a);
    }

    public final String toString() {
        return "Files.asByteSource(" + this.a + ")";
    }
}
