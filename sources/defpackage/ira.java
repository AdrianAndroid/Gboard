package defpackage;

import android.content.ContentProviderClient;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ira  reason: default package */
/* loaded from: classes.dex */
public final class ira extends iqw {
    private final ContentProviderClient b;

    public ira(InputStream inputStream, ContentProviderClient contentProviderClient) {
        super(inputStream);
        this.b = contentProviderClient;
    }

    @Override // defpackage.iqw, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
        } finally {
            jls.l(this.b);
        }
    }
}
