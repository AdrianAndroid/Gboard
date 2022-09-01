package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: avv  reason: default package */
/* loaded from: classes.dex */
public abstract class avv implements avj {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public avv(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.avj
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        try {
            Object b = b(this.a, this.b);
            this.c = b;
            aviVar.b(b);
        } catch (FileNotFoundException e) {
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
