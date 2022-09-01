package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: hzp  reason: default package */
/* loaded from: classes.dex */
public final class hzp implements kpy {
    @Override // defpackage.kpy
    public final String a() {
        return "xz";
    }

    @Override // defpackage.kpy
    public final InputStream b(InputStream inputStream) {
        return new oyp(inputStream);
    }

    @Override // defpackage.kpy
    public final /* synthetic */ OutputStream c(OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new kpa("wrapForWrite not supported by xz");
    }

    @Override // defpackage.kpy
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        return kqn.c(this, outputStream);
    }

    @Override // defpackage.kpy
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.kpy
    public final /* synthetic */ void f() {
    }
}
