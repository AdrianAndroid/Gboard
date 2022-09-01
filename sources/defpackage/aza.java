package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: aza  reason: default package */
/* loaded from: classes.dex */
public final class aza implements avj {
    private Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public aza(Uri uri, bhc bhcVar, int i, byte[] bArr) {
        this.b = i;
        this.d = uri;
        this.c = bhcVar;
    }

    public aza(File file, azb azbVar, int i) {
        this.b = i;
        this.c = file;
        this.d = azbVar;
    }

    public static aza b(Context context, Uri uri, awc awcVar) {
        return new aza(uri, new bhc(atb.b(context).b.b().c(), awcVar, atb.b(context).c, context.getContentResolver()), 1, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azb, java.lang.Object] */
    @Override // defpackage.avj
    public final Class a() {
        return this.b != 0 ? InputStream.class : this.d.a();
    }

    @Override // defpackage.avj
    public final void fh() {
    }

    @Override // defpackage.avj
    public final int g() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [azb, java.lang.Object] */
    @Override // defpackage.avj
    public final void d() {
        if (this.b != 0) {
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            try {
                ((InputStream) obj).close();
                return;
            } catch (IOException unused) {
                return;
            }
        }
        Object obj2 = this.a;
        if (obj2 == null) {
            return;
        }
        try {
            this.d.c(obj2);
        } catch (IOException unused2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: FileNotFoundException -> 0x00de, TRY_LEAVE, TryCatch #2 {FileNotFoundException -> 0x00de, blocks: (B:4:0x0006, B:53:0x0024, B:12:0x0040, B:17:0x0098, B:22:0x00d2, B:23:0x00d8, B:38:0x0048, B:40:0x0053, B:42:0x005d, B:44:0x0061, B:47:0x006d, B:48:0x0094, B:10:0x002f, B:61:0x0036, B:62:0x0039, B:19:0x009c), top: B:3:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2 A[Catch: FileNotFoundException -> 0x00de, TRY_ENTER, TryCatch #2 {FileNotFoundException -> 0x00de, blocks: (B:4:0x0006, B:53:0x0024, B:12:0x0040, B:17:0x0098, B:22:0x00d2, B:23:0x00d8, B:38:0x0048, B:40:0x0053, B:42:0x005d, B:44:0x0061, B:47:0x006d, B:48:0x0094, B:10:0x002f, B:61:0x0036, B:62:0x0039, B:19:0x009c), top: B:3:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048 A[Catch: FileNotFoundException -> 0x00de, TryCatch #2 {FileNotFoundException -> 0x00de, blocks: (B:4:0x0006, B:53:0x0024, B:12:0x0040, B:17:0x0098, B:22:0x00d2, B:23:0x00d8, B:38:0x0048, B:40:0x0053, B:42:0x005d, B:44:0x0061, B:47:0x006d, B:48:0x0094, B:10:0x002f, B:61:0x0036, B:62:0x0039, B:19:0x009c), top: B:3:0x0006, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r10v3, types: [azb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [axn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, awc] */
    @Override // defpackage.avj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.atk r10, defpackage.avi r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aza.f(atk, avi):void");
    }
}
