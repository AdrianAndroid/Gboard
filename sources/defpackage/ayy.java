package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ayy  reason: default package */
/* loaded from: classes.dex */
final class ayy implements avj {
    private final String a;
    private Object b;

    public ayy(String str) {
        this.a = str;
    }

    @Override // defpackage.avj
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.avj
    public final void d() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, indexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            this.b = byteArrayInputStream;
            aviVar.b(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            aviVar.e(e);
        }
    }

    @Override // defpackage.avj
    public final void fh() {
    }

    @Override // defpackage.avj
    public final int g() {
        return 1;
    }
}
