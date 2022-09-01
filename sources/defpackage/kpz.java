package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* compiled from: PG */
/* renamed from: kpz  reason: default package */
/* loaded from: classes.dex */
public final class kpz implements kpy {
    @Override // defpackage.kpy
    public final String a() {
        return "compress";
    }

    @Override // defpackage.kpy
    public final InputStream b(InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }

    @Override // defpackage.kpy
    public final OutputStream c(OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
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
