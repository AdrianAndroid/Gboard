package defpackage;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* renamed from: cqn  reason: default package */
/* loaded from: classes.dex */
public final class cqn {
    public static final cqn a;
    public final int b;
    public final int c;
    public final String d;

    static {
        hew e = e();
        e.j(0);
        e.h(0);
        e.i("");
        a = e.g();
    }

    public cqn() {
    }

    public cqn(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public static lfb a(File file) {
        if (file == null) {
            return ldu.a;
        }
        BitmapFactory.Options f = f();
        BitmapFactory.decodeFile(file.getAbsolutePath(), f);
        return c(f);
    }

    public static lfb b(byte[] bArr) {
        if (bArr == null) {
            return ldu.a;
        }
        int length = bArr.length;
        BitmapFactory.Options f = f();
        BitmapFactory.decodeByteArray(bArr, 0, length, f);
        return c(f);
    }

    public static lfb c(BitmapFactory.Options options) {
        if (TextUtils.isEmpty(options.outMimeType) || options.outWidth < 0 || options.outHeight < 0) {
            return ldu.a;
        }
        hew e = e();
        e.i(options.outMimeType);
        e.j(options.outWidth);
        e.h(options.outHeight);
        return lfb.g(e.g());
    }

    public static hew e() {
        return new hew();
    }

    private static BitmapFactory.Options f() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        return options;
    }

    public final String d() {
        return jbc.c(this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqn) {
            cqn cqnVar = (cqn) obj;
            if (this.b == cqnVar.b && this.c == cqnVar.c && this.d.equals(cqnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        return "DecodedImageInfo{width=" + i + ", height=" + i2 + ", mimeType=" + str + "}";
    }
}
